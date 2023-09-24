package com.ssm;

import com.ssm.entity.AdminInfo;
import com.ssm.service.UserService;
import com.ssm.service.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestHelloSpring {

    public static void main(String[] args) {

        Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        UserService hello = (UserService) factory.getBean("userService");
        AdminInfo admin = (AdminInfo) factory.getBean("admin");
        hello.login(admin.getName(), admin.getPwd());
    }

}
/*
//Resource res=new FileSystemResource("bean.xml");
	/*	//初始化容器,引入配置文件  X号点击红线点import                   引号里写配置文件名字
				ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			    //1.  ctx.getBean("helloSpring");  //get配置文件的id 值
				HelloSpring hello =(HelloSpring)ctx.getBean("helloSpring");
				//通过容器获取配置中helloSpring的实例
				hello.show();//调用方法
				*/