package net.codejava.javaee.Delivery;

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
	private DeliveryDAO deliveryDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		deliveryDAO = new DeliveryDAO(jdbcURL, jdbcUsername, jdbcPassword);

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
				insertDelivery(request, response);
				break;
			case "/delete":
				deleteDelivery(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateDelivery(request, response);
				break;
			default:
				listDelivery(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listDelivery(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Delivery> listDelivery = deliveryDAO.listAllDeliverys();
		request.setAttribute("listDelivery", listDelivery);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DeliveryList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("DeliveryForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String name = request.getParameter("name");

		RequestDispatcher dispatcher = request.getRequestDispatcher("DeliveryForm.jsp");

		dispatcher.forward(request, response);

	}

	private void insertDelivery(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String ID = request.getParameter("ID");
		String expiration = request.getParameter("expiration");
		String district = request.getParameter("district");

		Delivery newDelivery = new Delivery(ID, expiration, district);
		deliveryDAO.insertDelivery(newDelivery);
		response.sendRedirect("list");
	}

	private void updateDelivery(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String ID = request.getParameter("ID");
		String expiration = request.getParameter("expiration");
		String district = request.getParameter("district");

		Delivery delivery = new Delivery(ID, expiration, district);
		deliveryDAO.updateDelivery(delivery);
		response.sendRedirect("list");
	}

	private void deleteDelivery(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String ID = request.getParameter("ID");

		Delivery delivery = new Delivery();
		deliveryDAO.deleteDelivery(delivery);
		response.sendRedirect("list");
	}
}
