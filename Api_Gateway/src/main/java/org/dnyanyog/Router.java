 package org.dnyanyog;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Router { 
	  @Bean 
	   public RouteLocator customRouteLocator(RouteLocatorBuilder builder)    { 
		   return  builder 
				    .routes() 
				    .route("patient_add_route", r->r.path("/api/v1/directory/validate/**").uri("http://localhost:8082")) 
				    .route("user_add_route", r->r.path("/api/v1/directory/validate/**").uri("http://localhost:8081")) 
				    .route("case_add_route", r->r.path("/api/v1/directory/validate/**").uri("http://localhost:8083")) 
				    .route("appointment_add_route", r->r.path("/api/v1/directory/validate/**").uri("http://localhost:8084")) 
				     .build();

	  }
	   

}
