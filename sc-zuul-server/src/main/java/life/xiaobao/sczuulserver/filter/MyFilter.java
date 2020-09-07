package life.xiaobao.sczuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * zuul不仅只是路由，并且还能过滤，做一些安全验证。
 * 如果不需要过滤，该类可以不写
 */
@Component
public class MyFilter extends ZuulFilter {

    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     *  pre：路由之前
     *  routing：路由之时
     *  post： 路由之后
     *  error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder：过滤的顺序,数字越小，越先执行。（负数也是这个规则，0和-1的话，-1先执行）
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter：这里可以写逻辑判断，是否要过滤，
     *  true,永远过滤。
     *  默认false。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * run：过滤器的具体逻辑。
     *  可以很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        //这是一个简单的参数过滤示例
        // 如果参数不带token，则抛出token is empty
        // 带token参数则让其通过

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        //log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            //log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        //log.info("ok");

        return null;
    }

}
