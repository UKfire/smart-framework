package com.ytying.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by kefan.wkf on 18/1/25.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    Class<? extends Annotation> value();

}
