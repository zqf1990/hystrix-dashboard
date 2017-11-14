package com.bonc.eureka_server2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixDashboard {

	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixDashboard.class).web(true).run(args);
	}

}
