1 使用spring 4.3.3，将springmvc和spring整合时，过去的web.xml已经不再适用，
在配置文件中，只需要指定springmvc相关配置即可，spring核心配置文件通过import
的方式导入进去

2 事务功能实现要点：2.1 查看root-context.xml支持事务配置，切记：只支持在service层上以注解的方式添加事务功能，
这样，才能实现dao中getcurrentsession功能


以下为概念复习


在Javaweb中，会有域的概念：context，session，request/response,page

web的三层结构：
表现层 :模型(model)  视图(view) 和 控制器(controller)  spring mvc
业务层 spring service
数据访问层 hibernate  dao

http://stackoverflow.com/

http://mvnrepository.com/

http协议详解


tomcat7:run
