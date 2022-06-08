package result;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
			/*
			 * 日本語を入力する可能性がある場合には指定すること
			 * */
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		int humanAge=age*7;
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>犬年齢計算機</title>");
		out.println("</head>");
		out.println("<body>");
		out.printf("<p>%s(%d歳)は人間に換算すると%d歳です。</p>%n",name,age,humanAge);
		out.println("<a href='/dogAge/index.jsp'>戻る</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
