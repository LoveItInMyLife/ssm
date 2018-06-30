package com.itheima.classbind;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PersonBindingServlet
 */
public class PersonBindingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 面试题:当用户很多时 ,我怎么对服务器进行优化(调优),
	// 对象的钝化活化就是对服务器进行的一种优化
	// 比如80个对应80个session,当用户暂时不操作我的网站,将用户暂时不用的数据存到硬盘(钝化),节省服务器空间,等用户再用时活化这些数据
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonBindingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		Person person = new Person();
		person.setAddress("北京");
		person.setName("李四");
		session.setAttribute("p", person);
		response.getWriter().write("session域中放入person对象");
		// 解绑
		session.removeAttribute("p");
		response.getWriter().write("session域中删除person对象");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
