# xiaobao.life
个人收藏+转发+笔记+技术练兵场
# license
Apache 2.0
# SpringCloud构建微服务
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
# 开发环境
若无特别说明，则默认为：  
Idea+JDK1.8+对应框架  
