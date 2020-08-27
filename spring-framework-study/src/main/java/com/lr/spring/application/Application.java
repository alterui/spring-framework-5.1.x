package com.lr.spring.application;

import com.lr.spring.bean.IndexDao;
import com.lr.spring.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liurui
 * @date 2020/8/27 22:27
 */
public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		IndexService indexService = (IndexService) context.getBean("indexService");
		String str = indexService.print("liu");
		System.out.println(str);

	}

}
