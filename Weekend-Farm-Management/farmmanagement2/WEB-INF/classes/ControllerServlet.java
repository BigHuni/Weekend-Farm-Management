package net.codejava.javaee.Citizen;

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
	private CitizenDAO citizenDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		citizenDAO = new CitizenDAO(jdbcURL, jdbcUsername, jdbcPassword);

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
				insertCitizen(request, response);
				break;
			case "/delete":
				deleteCitizen(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateCitizen(request, response);
				break;
			default:
				listCitizen(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listCitizen(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Citizen> listCitizen = citizenDAO.listAllCitizens();
		request.setAttribute("listCitizen", listCitizen);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CitizenList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("CitizenForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String id = request.getParameter("id");

		RequestDispatcher dispatcher = request.getRequestDispatcher("CitizenForm.jsp");

		dispatcher.forward(request, response);

	}

	private void insertCitizen(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String id = request.getParameter("id");
		String district = request.getParameter("district");

		Citizen newCitizen = new Citizen(id, district);
		citizenDAO.insertCitizen(newCitizen);
		response.sendRedirect("list");
	}

	private void updateCitizen(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String id = request.getParameter("id");
		String district = request.getParameter("district");

		Citizen citizen = new Citizen(id, district);
		citizenDAO.updateCitizen(citizen);
		response.sendRedirect("list");
	}

	private void deleteCitizen(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String id = request.getParameter("id");

		Citizen citizen = new Citizen();
		citizenDAO.deleteCitizen(citizen);
		response.sendRedirect("list");
	}
}
