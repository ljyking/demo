package com.example.demo;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private ApplicationContext app;
	@Autowired
	private testService t;
	@Autowired
	private Person p;
	
	@Test
	public void contextLoads() {
//		String[] beanDefinitionNames = app.getBeanDefinitionNames();
//		t.getPerson();
		/*for (String string : beanDefinitionNames) {
			System.out.println("bean的名字是："+string);
		}*/
		System.out.println(p.getName()+p.getAge());
	}

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void logoload() {	
		//日志的级别
		//由低到高
		//可以调整输出日志级别，日志就会在这个级别以后的高级别生效
		logger.trace("这是logge日志");
		logger.debug("这是debug日志");
		//springboot默认给我们使用的是info级别，没有指定级别就用springboot默认规定的
		logger.info("这是info日志");
		logger.warn("这是warn日志");
		logger.error("这是error日志");
	}
}
