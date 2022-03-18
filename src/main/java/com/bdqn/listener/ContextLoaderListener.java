package com.bdqn.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
//上下文初始化的方法  服务器已启动 就走contextInitialized方法
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
       //ServletContext 的三大方法 1.作为域使用 2.读取配置文件 3.获取初始化参数
        ServletContext servletContext = servletContextEvent.getServletContext();
      //使用servletcontext对象读取初始化参数
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
      //获取全局初始化参数 contextConfigLocation配置文件的名称
        ApplicationContext app=new ClassPathXmlApplicationContext(contextConfigLocation);
        //将spring应用上下文对象  存储到最大的域当中ServletContext域
        servletContext.setAttribute("app",app);
        System.out.println("spring容器创建完毕");
    }
//上下文销毁的方法
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
