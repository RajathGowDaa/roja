package programs;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet implements javax.servlet.Servlet {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String str = arg0.getParameter("name");
		arg1.getWriter().print(str + " i");

	}

}
