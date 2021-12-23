package net.codejava.javaee.Citizen;

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
 * This DAO class provides CRUD database operations for the table Customer
 * in the database.
 * @author www.codejava.net
 *
 */
public class CitizenDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public CitizenDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
	
	public boolean insertCitizen(Citizen citizen) throws SQLException {
		String sql = "INSERT INTO citizen (id, district) VALUES (?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, citizen.getId());
		statement.setString(2, citizen.getDistrict());

		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	public List<Citizen> listAllCitizens() throws SQLException {
		List<Citizen> listCitizen = new ArrayList<>();
		
		String sql = "SELECT * FROM citizen";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String id = resultSet.getString("id");
			String district = resultSet.getString("district");
			
			Citizen citizen = new Citizen(id, district);
			listCitizen.add(citizen);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listCitizen;
	}
	
	public boolean deleteCitizen(Citizen citizen) throws SQLException {
		String sql = "DELETE FROM citizen where id = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, citizen.getId());
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;		
	}
	
	public boolean updateCitizen(Citizen citizen) throws SQLException {
		String sql = "UPDATE citizen SET id = ?, district = ?";
		sql += " WHERE id = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, citizen.getId());
		statement.setString(2, citizen.getDistrict());
	
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}
	
	public Citizen getCitizen(int no) throws SQLException {
		Citizen citizen = null;
		String sql = "SELECT * FROM citizen WHERE id = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			String id = resultSet.getString("id");
			String district = resultSet.getString("district");
			
			citizen = new Citizen(id, district);
		}
		
		resultSet.close();
		statement.close();
		
		return citizen;
	}
}
