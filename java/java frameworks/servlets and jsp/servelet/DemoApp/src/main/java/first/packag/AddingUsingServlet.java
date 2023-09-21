package first.packag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adding") // annotation
public class AddingUsingServlet extends HttpServlet {
	public void doGet(HttpServletRequest reqq, HttpServletResponse ress) throws IOException, ServletException {
		int a = Integer.parseInt(reqq.getParameter("num1"));
		int b = Integer.parseInt(reqq.getParameter("num2"));
		int c = a + b;

		ress.sendRedirect("squareServlet?keyyy="+c);
		
//		request dispatcher
//		reqq.setAttribute("keyyy", c); // setAttribute(key,value) is use to set the value to the object so that it can be forword to another servlet
//		RequestDispatcher rdp = reqq.getRequestDispatcher("squareServlet");
//		rdp.forward(reqq, ress);


//		session
//		HttpSession sess = reqq.getSession();
//		sess.setAttribute("key", c);
//		ress.sendRedirect("squareServlet");

//		cookie
//		Cookie cook = new Cookie("cookieKey", c + "");
//		ress.addCookie(cook);
//		ress.sendRedirect("squareServlet");

//		System.out.println("By adding we get "+c); // this will be printed in console

//		print on browser
//		PrintWriter outttt = ress.getWriter();
//		outttt.println(a + " + " + b + " = " + c); // this will print on browser
	}
}
