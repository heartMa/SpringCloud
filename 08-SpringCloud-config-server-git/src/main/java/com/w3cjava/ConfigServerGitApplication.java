package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * 
 * @class  ConfigServerGitApplication
 * @version 1.0.0
 * @author cos
 * @desc	访问配置信息的URL与配置文件的映射关系   
			/{application}/{profile}[/{label}]
			/{application}-{profile}.yml
			/{label}/{application}-{profile}.yml
			/{application}-{profile}.properties
			/{label}/{application}-{profile}.properties
			上面的url会映射{application}-{profile}.properties对应的配置文件，其中{label}对应Git上不同的分支，默认为master。
			我们可以尝试构造不同的url来访问不同的配置内容，比如，要访问master分支，config-client应用的dev环境，
			就可以访问这个url：http://localhost:1201/config-client/dev/master，并获得如下返回：
			{
				"name": "config-client",
				"profiles": ["dev"],
				"label": "master",
				"version": null,
				"state": null,
				"propertySources": [{
					"name": "https://github.com/heartMa/config-repo-demo/config-client-dev.yml",
					"source": {
						"info.profile": "dev"
					}
				}, {
					"name": "https://github.com/heartMa/config-repo-demo/config-client.yml",
					"source": {
						"info.profile": "default"
					}
				}]
			}	
			
					
		
		
 *
 */
@SpringBootApplication
//2、开启Spring Cloud Config的服务端功能
@EnableConfigServer
public class ConfigServerGitApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGitApplication.class, args);
	}
}
