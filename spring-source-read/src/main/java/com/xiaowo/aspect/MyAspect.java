package com.xiaowo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by wubo15 on 2021/6/22.
 *
 * @author wubo15
 * @date 2021/6/22
 */
public class MyAspect {

	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("1 -- around before...");
		Object obj = jp.proceed(); //--显式的调用目标方法
		System.out.println("1 -- around after...");
		return obj;
	}
}
