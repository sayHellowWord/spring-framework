package com.xiaowo.application;

import com.xiaowo.beans.User;
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

		System.out.println(ctx.getEnvironment());
	}

}
