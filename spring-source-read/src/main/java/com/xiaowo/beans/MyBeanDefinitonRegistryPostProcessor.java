package com.xiaowo.beans;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * Created by wubo15 on 2021/6/11.
 *
 * @author wubo15
 * @date 2021/6/11
 */
public class MyBeanDefinitonRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("--- MyBeanDefinitonRegistryPostProcessor.postProcessBeanFactory 被执行了。");

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("--- MyBeanDefinitonRegistryPostProcessor.postProcessBeanDefinitionRegistry 被执行了。");
	}

}
