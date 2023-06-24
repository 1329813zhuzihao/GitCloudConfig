package com.itlike.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.REQUEST_URI_KEY;

@Component
public class MyPreFilter extends ZuulFilter {
    //返回过滤器类型
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    //返回指定过滤器执行顺序 越小  执行越靠前
    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER+1;
    }
    //决定过滤器是否要执行
    @Override
    public boolean shouldFilter() {
        return true;
    }
    //过滤器执行的具体逻辑
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String remoteAddr = request.getRemoteAddr();
        String requestURI = request.getRequestURI();
        System.out.println("IP"+remoteAddr);
        System.out.println("requestURI"+requestURI);
        System.out.println("路由后的路径"+ctx.get(REQUEST_URI_KEY));
        return null;
    }
}
