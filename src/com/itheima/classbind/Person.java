package com.itheima.classbind;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class Person  implements HttpSessionBindingListener,HttpSessionActivationListener{//绑定监听器接口,这个监听器不需注册即配置xml
private String name ;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public void valueBound(HttpSessionBindingEvent event) {//绑定方法:将person对象放入session中,就会触发这个方法
	// TODO Auto-generated method stub
	System.out.println("Person对象被绑定了");
}
@Override
public void valueUnbound(HttpSessionBindingEvent event) {////绑定方法:将person对象从session中移除,就会触发这个方法
	// TODO Auto-generated method stub
	System.out.println("Person对象解绑了");
}
@Override
public void sessionWillPassivate(HttpSessionEvent se) {//person对象钝化
	// TODO Auto-generated method stub
	
}
@Override
public void sessionDidActivate(HttpSessionEvent se) {//person对象活化
	// TODO Auto-generated method stub
	
}

}
