package com.empapp.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.empapp.api.EmployeeApi;
// i want to integration spring with jersy
@Component
public class RestConfig extends ResourceConfig{
public RestConfig() {
        register(EmployeeApi.class); 
        packages("com.empapp");
    }
}
