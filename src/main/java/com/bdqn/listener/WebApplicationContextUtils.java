package com.bdqn.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationContextUtils {
//static可以直接调用 需要传递一个servletContext来获取当前域中的app的值  然后将这个值返回
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){

        //获取将servletContext域中的app的值返回
        return (ApplicationContext) servletContext.getAttribute("app");

    }
}
