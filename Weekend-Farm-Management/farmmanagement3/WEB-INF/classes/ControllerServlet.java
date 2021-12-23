package net.codejava.javaee.Crop;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * www.codejava.net
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CropDAO cropDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		cropDAO = new CropDAO(jdbcURL, jdbcUsername, jdbcPassword);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertCrop(request, response);
				break;
			case "/delete":
				deleteCrop(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateCrop(request, response);
				break;
			default:
				listCrop(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listCrop(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Crop> listCrop = cropDAO.listAllCrops();
		request.setAttribute("listCrop", listCrop);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CropList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("CropForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String name = request.getParameter("name");

		RequestDispatcher dispatcher = request.getRequestDispatcher("CropForm.jsp");

		dispatcher.forward(request, response);

	}

	private void insertCrop(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String expiration = request.getParameter("expiration");
		String division = request.getParameter("division");

		Crop newCrop = new Crop(name, expiration, division);
		cropDAO.insertCrop(newCrop);
		response.sendRedirect("list");
	}

	private void updateCrop(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String expiration = request.getParameter("expiration");
		String division = request.getParameter("division");

		Crop crop = new Crop(name, expiration, division);
		cropDAO.updateCrop(crop);
		response.sendRedirect("list");
	}

	private void deleteCrop(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");

		Crop crop = new Crop();
		cropDAO.deleteCrop(crop);
		response.sendRedirect("list");
	}
}
