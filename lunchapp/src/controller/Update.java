package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LunchDAO;
import model.Lunch;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s_id=request.getParameter("id");
		if(s_id==null) {
			response.sendRedirect("/lunchapp/Read");
		}else {
			LunchDAO dao=new LunchDAO();
			Lunch lunch=dao.findOne(Integer.parseInt(s_id));
			request.setAttribute("lunch", lunch);
			request.getRequestDispatcher("/WEB-INF/view/update.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String menu=request.getParameter("menu");
		Lunch lunch=new Lunch(Integer.parseInt(id),name,menu);
		LunchDAO dao=new LunchDAO();
		dao.updateOne(lunch);
		response.sendRedirect("/lunchapp/Read");
	}

}
