package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Slime;

@WebServlet("/SlimeApp")
public class SlimeApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Slime slime = new Slime("スラきち",100);
		List<Slime> list=new ArrayList<>();
		list.add(new Slime("スラきち",100));
		list.add(new Slime("スラりん",89));
		list.add(new Slime("スラまる",92));
		request.setAttribute("sKey", list);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/result.jsp");
		rd.forward(request, response);
	}


}
