package com.ytying.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kefan.wkf on 18/1/22.
 */
public final class StringUtil {
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
