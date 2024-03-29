package demo.democonsulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@RestController
public class DemoConsulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConsulApiGatewayApplication.class, args);
	}
	
	
    @Bean
    public MyGatewayFilter myGatewayFilter(){
        return new MyGatewayFilter();
    }

}
