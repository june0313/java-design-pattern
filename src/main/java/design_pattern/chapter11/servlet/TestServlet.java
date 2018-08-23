package design_pattern.chapter11.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("GET");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("POST");
	}
}
