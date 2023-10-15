package com.test;

import com.ssm.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main (String[] ars) {
		// 1. 获取核心容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. 根据id获取bean对象
        ProductService service = (ProductService) context.getBean("productService");
        service.browse();
        System.out.println("afterPrintLog");
        System.out.println("aroundPrintLog");
        // 3.关闭容器（如果不记得关闭容器，最典型的问题就是数据库连接不能释放）
        ((ClassPathXmlApplicationContext) context).close();

	}
	
}
