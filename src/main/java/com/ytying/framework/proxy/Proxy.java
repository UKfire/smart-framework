package com.ytying.framework.proxy;

/**
 * Created by kefan.wkf on 18/1/25.
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
