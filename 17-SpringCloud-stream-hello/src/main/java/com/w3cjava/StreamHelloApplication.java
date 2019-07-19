package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @class  StreamHelloApplication
 * @version TODO
 * @author cos
 * @date   2019年7月19日
 * @desc   执行rabbitmq-plugins enable rabbitmq_management命令，开启Web管理插件，这样我们就可以通过浏览器来进行管理了
 * http://localhost:15672/
 * application.properties配置
 * spring.cloud.stream.bindings.input.group属性指定了该应用实例都属于Service-A消费组
 * spring.cloud.stream.bindings.input.destination属性则指定了输入通道对应的主题名
 *
 */
@SpringBootApplication
public class StreamHelloApplication {
	public static void main(String[] args) {
		SpringApplication.run(StreamHelloApplication.class, args);
	}
}
