package com.app.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.dao.StudentDao;
import com.app.dao.StudentDaoImpl;
import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.app.controller")
public class DispatcherConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
	}
	
	@Bean
	public ViewResolver internalviewResolver()
	{
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	@Bean 
	public DataSource datasource()
	{
		DriverManagerDataSource datasource= new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/ittraining");
		datasource.setUsername("root");
		datasource.setPassword("");
		return datasource;
	}
	@Bean
	public UserDao dao()
	{
		
		return new UserDaoImpl();
	}
	@Bean
	public StudentDao studentDao()
	{
		return new StudentDaoImpl();
	}

}
