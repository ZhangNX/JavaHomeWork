package cn.edu.bjfu.en.im.homework_6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class login
 */
@WebServlet("/login.do")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();// �õ�session
		String username = (String) session.getAttribute("username");
		if (username != null) {
			RequestDispatcher rd = request.getRequestDispatcher("logout.html");
			rd.forward(request, response);
			return;
		}

		String nameValue = request.getParameter("username");
		String pwdValue = request.getParameter("userpwd");
		if (nameValue.equals(pwdValue)) {
			session = request.getSession();// �õ�session
			session.setAttribute("username", nameValue);
			RequestDispatcher rd = request.getRequestDispatcher("loginsucc.html");
			rd.forward(request, response);
			return;
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("loginunsucc.html");
			rd.forward(request, response);
			return;
		}
	}

}
