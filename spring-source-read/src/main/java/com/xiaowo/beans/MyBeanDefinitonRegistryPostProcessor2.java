package com.xiaowo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.Ordered;

/**
 * Created by wubo15 on 2021/6/11.
 *
 * @author wubo15
 * @date 2021/6/11
 */
public class MyBeanDefinitonRegistryPostProcessor2 implements BeanDefinitionRegistryPostProcessor, Ordered {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("--- MyBeanDefinitonRegistryPostProcessor2.postProcessBeanFactory 被执行了。");

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("--- MyBeanDefinitonRegistryPostProcessor2.postProcessBeanDefinitionRegistry 被执行了。");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
