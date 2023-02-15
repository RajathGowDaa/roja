package programs;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Accessemp;
import dto.Employee;

public class genericservlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String str = arg0.getParameter("empid");
		int empid=Integer.parseInt(str);
		
		String str1 = arg0.getParameter("empname");
		
		Employee emp= new Employee();
		emp.setEmpid(empid);
		emp.setEmpname(str1);
		
		Accessemp acc=new Accessemp();
		acc.insert(emp);
		
	}

}
