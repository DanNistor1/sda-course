package com.bucur.spring.core.configs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoBeanConfig {

    public static void main(String[] args) {
        // create context, Spring's container that will create the objects, wire them together, configure them,
        // and manage their complete life cycle from creation till destruction
        ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        // get bean
        MyBean bean = appContext.getBean(MyBean.class);
//        MyBean bean = appContext.getBean("myBean", MyBean.class); // with alias
        bean.complexOperation();

    }
}
