package com.bucur.spring.core.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Scope("singleton") este implicit si poate fi omis
 *  the container creates a single instance of that bean,
 *  and all requests for that bean name will return the same object
 * @Scope se poate pune pe orice bean
 */

@Scope("singleton")
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // alta varianta
@Service
public class SingletonService {
}
