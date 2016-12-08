package com.moonspring.contronller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class WebListenerContronller implements ServletContextListener,ServletRequestListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
//		sce.get
		System.out.println("关闭服务");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("启动服务");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request死亡");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request出现");
	}

}
