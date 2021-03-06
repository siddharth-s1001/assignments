package org.cg.labbook2.lab1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:employee.properties")
@ComponentScan("empmgtusingspring.com.cg")
@Configuration
public class Config {

}
