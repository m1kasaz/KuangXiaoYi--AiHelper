package com.m1kasaz.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanChecker {

    private final ApplicationContext applicationContext;

    @Autowired
    public BeanChecker(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * 检查指定名称的Bean是否存在
     */
    public boolean containsBean(String beanName) {
        return applicationContext.containsBean(beanName);
    }

    /**
     * 检查指定类型的Bean是否存在
     */
    public <T> boolean containsBean(Class<T> beanType) {
        try {
            applicationContext.getBean(beanType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 获取所有已注册的Bean名称
     */
    public String[] getAllBeanNames() {
        return applicationContext.getBeanDefinitionNames();
    }

    /**
     * 打印所有Bean信息
     */
    public void printAllBeans() {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("===== 所有已注册的Bean =====");
        for (String beanName : beanNames) {
            System.out.println(beanName + " : " + applicationContext.getBean(beanName).getClass().getName());
        }
        System.out.println("===== 总计: " + beanNames.length + " 个Bean =====");
    }
}
