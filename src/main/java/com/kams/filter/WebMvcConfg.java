package com.kams.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfg implements WebMvcConfigurer {

    public final static String SESSION_KEY = "user";
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	System.out.println("web走了");
        registry.addInterceptor(new LoginFilter()).addPathPatterns("/**").excludePathPatterns("/logon","/html/logon.html","/css/**","/images/**","/js/**","/json/**");
    }

}
