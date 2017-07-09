package Main;

import java.sql.Connection;
import java.sql.SQLException;

import Admin.WelcomePage;
import Customer.CustomerLogin;
import DAO.DataSource;
import Employee.EmployeeLogin;

public class Start {
	static Connection con;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		con=new DataSource().getDBConnection();
		//EmployeeLogin m2 = new EmployeeLogin();
		WelcomePage w = new WelcomePage();
		//CustomerLogin c = new CustomerLogin();
		//c.login();
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		con=new DataSource().getDBConnection();
		return con;
	}

}
