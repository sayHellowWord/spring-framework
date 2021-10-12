package com.xiaowo.application;

import com.xiaowo.beans.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wubo15 on 2021/6/9.
 *
 * @author wubo15
 * @date 2021/6/9
 */
public class ApplicationStart {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User user = ctx.getBean(User.class);
		System.out.println("user = " + user);

		//创建BeanFactory容器
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

		//XML 配置文件 ClassPath路径
	/*	String location = "classpath:beans.xml";

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		int beanDefinitionNum = reader.loadBeanDefinitions(location);
		System.out.println("Bean 定义加载的数量" + beanDefinitionNum);
		User user1 = beanFactory.getBean(User.class);
		System.out.println("user = " + user1);*/
	}

}
