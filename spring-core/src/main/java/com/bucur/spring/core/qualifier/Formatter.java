package com.bucur.spring.core.qualifier;

import org.springframework.stereotype.Component;

// @Component // interfetele nu este necesar sa fie adnotate
public interface Formatter {

    String format();
}
