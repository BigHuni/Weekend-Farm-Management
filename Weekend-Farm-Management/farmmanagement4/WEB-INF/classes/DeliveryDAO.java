package net.codejava.javaee.Delivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * AbstractDAO.java
 * This DAO class provIDes CRUD database operations for the table Customer
 * in the database.
 * @author www.codejava.net
 *
 */
public class DeliveryDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public DeliveryDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	public boolean insertDelivery(Delivery delivery) throws SQLException {
		String sql = "INSERT INTO delivery (ID, expiration, district) VALUES (?, ?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, delivery.getID());
		statement.setString(2, delivery.getExpiration());
		statement.setString(3, delivery.getDistrict());

		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	public List<Delivery> listAllDeliverys() throws SQLException {
		List<Delivery> listDelivery = new ArrayList<>();
		
		String sql = "SELECT * FROM delivery";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String ID = resultSet.getString("ID");
			String expiration = resultSet.getString("expiration");
			String district = resultSet.getString("district");
			
			Delivery delivery = new Delivery(ID, expiration, district);
			listDelivery.add(delivery);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listDelivery;
	}
	
	public boolean deleteDelivery(Delivery delivery) throws SQLException {
		String sql = "DELETE FROM delivery where ID = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, delivery.getID());
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;		
	}
	
	public boolean updateDelivery(Delivery delivery) throws SQLException {
		String sql = "UPDATE delivery SET ID = ?, expiration = ?, district = ?";
		sql += " WHERE ID = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, delivery.getID());
		statement.setString(2, delivery.getExpiration());
		statement.setString(3, delivery.getDistrict());
	
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}
	
	public Delivery getDelivery(String ID) throws SQLException {
		Delivery delivery = null;
		String sql = "SELECT * FROM citizen WHERE ID = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			
			String expiration = resultSet.getString("expiration");
			String district = resultSet.getString("district");
			
			delivery = new Delivery(ID, expiration, district);
		}
		
		resultSet.close();
		statement.close();
		
		return delivery;
	}
}
