package cn.edu.bjfu.en.im.homework_7;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login2
 */
@WebServlet("/login2.do")
public class login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public login2() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nameValue = request.getParameter("username");
		String pwdValue = request.getParameter("userpwd");
		if (nameValue.equals(pwdValue)) {
			request.setAttribute("MESS", "µÇÂ½³É¹¦");
			RequestDispatcher rd = request.getRequestDispatcher("login2.jsp");
			rd.forward(request, response);
			return;
		} else {
			request.setAttribute("MESS", "µÇÂ½Ê§°Ü ");
			RequestDispatcher rd = request.getRequestDispatcher("login2.jsp");
			rd.forward(request, response);
			return;
		}
	}

}
