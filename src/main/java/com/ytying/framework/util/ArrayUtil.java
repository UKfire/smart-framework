package com.ytying.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by kefan.wkf on 18/1/22.
 */
public final class ArrayUtil {

    public static boolean isEmpty(Object[] arr) {
        return ArrayUtils.isEmpty(arr);
    }

    public static boolean isNotEmpty(Object[] arr) {
        return !isEmpty(arr);
    }
}
