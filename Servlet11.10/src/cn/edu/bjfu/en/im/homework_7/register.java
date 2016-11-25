package cn.edu.bjfu.en.im.homework_7;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

/**
 * Servlet implementation class register
 */
@WebServlet("/register.do")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public register() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameValue = request.getParameter("username");
		String pwdValue = request.getParameter("userpwd");
		RegisterVO rVO = new RegisterVO(nameValue, pwdValue);
		if (nameValue!=""&&pwdValue!="") {
			RegisterDAO rDAO = new RegisterDAO();
			if (rDAO.add(rVO)) {//���ݿ�����
				request.setAttribute("MESS", "ע��ɹ�");
				RequestDispatcher rd = request.getRequestDispatcher("login2.jsp");
				rd.forward(request, response);
				return;
			}else{
				request.setAttribute("MESS", "ע��ʧ��");
				RequestDispatcher rd = request.getRequestDispatcher("login2.jsp");
				rd.forward(request, response);
				return;
			}
			
		} else {
			request.setAttribute("MESS", "�������û���������");
			RequestDispatcher rd = request.getRequestDispatcher("login2.jsp");
			rd.forward(request, response);
			return;
		}
	}

}