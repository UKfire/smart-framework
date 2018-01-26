package com.ytying.framework;

import com.ytying.framework.helper.*;
import com.ytying.framework.util.ClassUtil;

/**
 * Created by kefan.wkf on 18/1/22.
 */
public class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }

}
