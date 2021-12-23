package net.codejava.javaee.Crop;

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
public class CropDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public CropDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
	
	public boolean insertCrop(Crop crop) throws SQLException {
		String sql = "INSERT INTO crop (name, expiration, division) VALUES (?, ?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, crop.getName());
		statement.setString(2, crop.getExpiration());
		statement.setString(2, crop.getDivision());

		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	public List<Crop> listAllCrops() throws SQLException {
		List<Crop> listCrop = new ArrayList<>();
		
		String sql = "SELECT * FROM crop";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			String expiration = resultSet.getString("expiration");
			String division = resultSet.getString("division");
			
			Crop crop = new Crop(name, expiration, division);
			listCrop.add(crop);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listCrop;
	}
	
	public boolean deleteCrop(Crop crop) throws SQLException {
		String sql = "DELETE FROM crop where name = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, crop.getName());
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;		
	}
	
	public boolean updateCrop(Crop crop) throws SQLException {
		String sql = "UPDATE crop SET name = ?,  expiration = ?, division = ?";
		sql += " WHERE name = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, crop.getName());
		statement.setString(2, crop.getExpiration());
		statement.setString(3, crop.getDivision());
	
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}
	
	public Crop getCrop(int no) throws SQLException {
		Crop crop = null;
		String sql = "SELECT * FROM crop WHERE name = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			String name = resultSet.getString("name");
			String expiration = resultSet.getString("expiration");
			String division = resultSet.getString("division");
			
			crop = new Crop(name, expiration, division);
		}
		
		resultSet.close();
		statement.close();
		
		return crop;
	}
}
