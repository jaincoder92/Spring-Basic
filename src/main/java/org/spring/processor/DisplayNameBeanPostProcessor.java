package org.spring.processor;

import java.awt.Point;

import org.spring.beans.Triangle3;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In before Initialization method. Bean name is: "+beanName);
		if (bean instanceof Triangle3){
			Triangle3 triangle3 = (Triangle3)bean;
			triangle3.setPointA(new org.spring.beans.Point());
			triangle3.setPointB(new org.spring.beans.Point());
			triangle3.setPointC(new org.spring.beans.Point());
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In after Initialization method. Bean name is: "+beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
