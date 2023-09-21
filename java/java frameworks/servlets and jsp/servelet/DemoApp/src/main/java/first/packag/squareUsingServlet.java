package first.packag;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/squareServlet") // annotation instead of using web.xml file
public class squareUsingServlet extends HttpServlet {
	public void doGet(HttpServletRequest reqq, HttpServletResponse ress) throws IOException {
		
		int num = 0;
		
//		take parameters from url
		num = Integer.parseInt(reqq.getParameter("keyyy"));
		
//		request dispatcher
//		num = (int)reqq.getAttribute("keyyy"); // casting object to int, getAttribute("keyyy") get the value associated with keyyy
		
//		session
//		HttpSession sess = reqq.getSession();
//		num = (int)sess.getAttribute("key");
		
//		cookie
//		Cookie arr[] = reqq.getCookies();
//		for(Cookie c:arr) {
//			if(c.getName().equals("cookieKey")) {
//				num = Integer.parseInt(c.getValue());
//			}
//		}
		
		int sq = num*num;
		
//		print to browser
		PrintWriter out = ress.getWriter();
		out.println("Addition: "+num);
		out.println("Square: "+sq);
	}
}
