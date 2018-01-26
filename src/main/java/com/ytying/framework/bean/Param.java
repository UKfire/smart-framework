package com.ytying.framework.bean;

import com.ytying.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by kefan.wkf on 18/1/22.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }
}
