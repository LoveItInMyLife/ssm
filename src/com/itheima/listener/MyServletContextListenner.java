package com.itheima.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListenner implements ServletContextListener{
	//监听servletContext对象创建的
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//ServletContextEvent sce 获得被监听的对象
		ServletContext sc = sce.getServletContext();
		//sc就是被监听的对象
		ServletContext source = (ServletContext) sce.getSource();//获得的source也是被监听的对象,这是通用的方法
		System.out.println("servletcontext创建了");
	}
	//监听servletContext对象销毁的
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("servletcontext销毁了");

	}
//ServletContextListener的作用
	//1.准备工作,比如准备连接池,服务一旦加载,我就创建了池子
	//2.加载一些初始化的文件,框架的应用,比如spring的核心监听器ContextLoaderListener
	//2.任务调度:定时器,比如银行定时计息
}
