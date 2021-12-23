package knu.mypackage;

import java.util.*;
import java.sql.*;

	public class FarmHandler {
		Vector<Citizen> citizens;
		Vector<Crop> crops;
		Vector<Environment> environments;
		Vector<Delivery> deliverys;
		Vector<Vegetable> vegetables;
		Vector<Fruit> fruits;
		Vector<Dogye> dogyes;
		Vector<Madal> madals;
		Vector<Temperature> temperatures;
		Vector<Humidity> humiditys;
		Vector<Division> divisions;
		Vector<IdName> idnames;
		Vector<IdNameA> idnamea;
		Vector<IdNameD> idnamed;

		

		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		String user = "c##scott";
		String pwd = "tiger";

		public FarmHandler() {
			citizens = new Vector<Citizen>(); // collection, 가변길이배열
			crops = new Vector<Crop>(); // collection, 가변길이배열
			environments = new Vector<Environment>(); // collection, 가변길이배열
			deliverys = new Vector<Delivery>(); // collection, 가변길이배열
			vegetables = new Vector<Vegetable>(); // collection, 가변길이배열
			fruits = new Vector<Fruit>(); // collection, 가변길이배열
			dogyes = new Vector<Dogye>(); // collection, 가변길이배열
			madals = new Vector<Madal>(); // collection, 가변길이배열
			temperatures = new Vector<Temperature>(); // collection, 가변길이배열
			humiditys = new Vector<Humidity>(); // collection, 가변길이배열
			divisions = new Vector<Division>(); // collection, 가변길이배열
			idnames = new Vector<IdName>(); // collection, 가변길이배열
			idnamea = new Vector<IdNameA>(); // collection, 가변길이배열
			idnamed = new Vector<IdNameD>(); // collection, 가변길이배열
			

			try {
				Class c = Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(url, user, pwd);
				//conn.setAutoCommit(true);
			} catch (ClassNotFoundException e1) {
				System.out.println("Error loading driver :" + e1.toString());
				return;
			} catch (Exception e2) {
				System.out.println("Fail DB Connection :" + e2.toString());
				return;
			}
		}
		
		public Vector<Citizen> getAllCitizen() {

			String query = "SELECT id, district FROM CITIZEN";
			try {
				PreparedStatement pstmt = conn.prepareStatement(query);

				ResultSet rs = pstmt.executeQuery();
				
				while (rs.next()) {			
					citizens.add( new Citizen(rs.getString(1), rs.getString(2)));
				}

			} catch (Exception ex3) {
				System.out.println("Error SQL Statement Execution ");

			} finally {
				try {
					stmt.close();
				} catch (Exception ex4) {
				}
			}
			
			return citizens;
		}
		
			public Vector<Crop> getAllCrop() {

				String query = "SELECT name, expiration, division FROM CROP";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						crops.add( new Crop(rs.getString(1), rs.getString(2), rs.getString(3)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return crops;
		}
			
			public Vector<Environment> getAllEnvironment() {

				String query = "SELECT name, temperature, humidity FROM ENVIRONMENT";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						environments.add( new Environment(rs.getString(1), rs.getString(2), rs.getString(3)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return environments;
		}
			
			public Vector<Delivery> getAllDelivery() {

				String query = "SELECT id, expiration, district FROM DELIVERY";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						deliverys.add( new Delivery(rs.getString(1), rs.getString(2), rs.getString(3)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return deliverys;
		}
			
			public Vector<Vegetable> getAllVegetable() {

				String query = "SELECT name FROM CROP WHERE DIVISION LIKE 'vegetable'";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						vegetables.add( new Vegetable(rs.getString(1)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return vegetables;
		}
			
			public Vector<Fruit> getAllFruit() {

				String query = "SELECT name FROM CROP WHERE DIVISION LIKE 'fruit'";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						fruits.add( new Fruit(rs.getString(1)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return fruits;
		}
			
			public Vector<Dogye> getAllDogye() {

				String query = "SELECT ID FROM CITIZEN WHERE DISTRICT LIKE 'Dogye-eup'";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						dogyes.add( new Dogye(rs.getString(1)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return dogyes;
		}
			
			public Vector<Madal> getAllMadal() {

				String query = "SELECT ID FROM CITIZEN WHERE DISTRICT LIKE 'Madal-dong'";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						madals.add( new Madal(rs.getString(1)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return madals;
		}
			
			public Vector<Temperature> getAllTemperature() {

				String query = "SELECT name FROM ENVIRONMENT WHERE TEMPERATURE > '15'";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						temperatures.add( new Temperature(rs.getString(1)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return temperatures;
		}
			
			public Vector<Humidity> getAllHumidity() {

				String query = "SELECT name FROM ENVIRONMENT WHERE HUMIDITY < '75'";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						humiditys.add( new Humidity(rs.getString(1)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return humiditys;
		}
			
			public Vector<Division> getAllDivision() {

				String query = "SELECT delivery.id, crop.division FROM delivery, crop "
						+ "WHERE delivery.expiration = crop.expiration";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						divisions.add( new Division(rs.getString(1), rs.getString(2)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return divisions;
		}
			
			public Vector<IdName> getAllIdName() {

				String query = "SELECT delivery.id, crop.name FROM delivery, crop "
						+ "WHERE delivery.expiration = crop.expiration";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						idnames.add( new IdName(rs.getString(1), rs.getString(2)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return idnames;
		}
			
			public Vector<IdNameA> getAllIdNameA() {

				String query = "SELECT delivery.id, crop.name FROM delivery, crop "
						+ "WHERE delivery.expiration = crop.expiration ORDER BY name ASC";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						idnamea.add( new IdNameA(rs.getString(1), rs.getString(2)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return idnamea;
		}
			
			public Vector<IdNameD> getAllIdNameD() {

				String query = "SELECT delivery.id, crop.name FROM delivery, crop "
						+ "WHERE delivery.expiration = crop.expiration ORDER BY name DESC";
				try {
					PreparedStatement pstmt = conn.prepareStatement(query);

					ResultSet rs = pstmt.executeQuery();
					
					while (rs.next()) {			
						idnamed.add( new IdNameD(rs.getString(1), rs.getString(2)));
					}

				} catch (Exception ex3) {
					System.out.println("Error SQL Statement Execution ");

				} finally {
					try {
						stmt.close();
					} catch (Exception ex4) {
					}
				}

			return idnamed;
		}
}