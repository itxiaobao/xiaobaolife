# xiaobao.life
个人收藏+转发+笔记+技术练兵场
# license
Apache 2.0
# 开发环境
若无特别说明，则默认为：  
Idea+JDK1.8+对应框架
# SpringCloud-* 微服务架构(入门级)
说明：该微服务架构只是入门级demo，只做学习理解微服务架构用,有点乱,后边有时间再整理。  
springcloud-eureka 注册中心  
springcloud-ribbon-provider 服务提供者  
springcloud-ribbon-consumer 服务消费者  
springcloud-feign-consumer feign消费者  
注：后一个服务都需要开启前几个服务，因为代码里是线性调用的  
访问地址：  
注册中心 http://localhost:8081/  
服务提供者 http://localhost:8082/hello?name=xiaobao  
服务消费者 http://localhost:8083/hello?name=consumer  
feign消费者 http://localhost:8084/hello?name=feiginend  
其实提供者与消费者之间只是角色不同而已，它们的逻辑是一样的，可以相互转换的  
# spc-* 微服务架构(精装版)
说明：在入门理解的基础上进行精简而成的SpringCloud微服务架构  
spc-eureka-server  注册  
spc-eureka-client  发现  
spc-ribbon-server  消费  
spc-feign-server   消费  
ribbon与feign功能类似，使用其中一种即可，也可以组合使用  
访问地址：  
eureka-server：http://localhost:8881/  
eureka-client：http://localhost:8882/hello  
ribbon-server：http://localhost:8884/hello  
feign-server：http://localhost:8885/hello  
Tip：启动client后把端口改为8883，然后启动，即client的8882与8883双实例形成负载。当你用ribbon和feign去消费的时候，8882与8883将会自动轮询切换
# sc-* 微服务架构(整合版)
说明：前面两个微服务架构保留原始demo，便于理解微服务。这个版本则进行各种框架的整合  
包含：  
sc-eureka-server  注册  
sc-eureka-client  发现  
sc-feign-server  消费  
sc-ribbon-server  消费  
sc-zuul-server  路由  
sc-gateway-server 路由  
sc-admin-client 应用监控  
sc-admin-server 应用监控服务中心  
目前用到的框架：  springboot+eureka+ribbon+feign+zuul+gateway+admin+hystrix+mail+flux+actuator+security  
未完成，持续更新中.......