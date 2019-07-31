## demo of using zuul as a api gateway and integrated with consul


create class and extends ZuulFilter for filter, such as processing authenication and authorization.

define routing information in properties file

spring.application.name=demo-consul-api-gateway
server.port=9000
spring.cloud.consul.host=localhost
spring.cloud.consul.port=8500
spring.cloud.consul.discovery.serviceName=demo-consul-api-gateway


zuul.routes.api-a.path=/api/producer/**
zuul.routes.api-a.service-id=service-consul-producer

