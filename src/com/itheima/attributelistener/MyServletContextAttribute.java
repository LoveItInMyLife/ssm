package com.itheima.attributelistener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttribute implements ServletContextAttributeListener {
 //每个域对象都有set,get,removeattribute方法
	//set和remove都会出发属性监听器
	//其中set既有添加又有同一属性的修改功能
	//只要做框架监听器肯定会用
	@Override
	public void attributeAdded(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("添加的属性和属性值"+scab.getName()+"=="+scab.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("删除的属性和属性值"+scab.getName()+"=="+scab.getValue());

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		System.out.println("修改前的属性和属性值"+scab.getName()+"=="+scab.getValue());//修改前哦

	}

}
