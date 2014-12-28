import  java.sql.*;
import java.util.Scanner;

public class ConnectToServerDemo {
	public static void main(String [] args){
		//1.Load database driver
		try{
			Class.forName("com.mckoi.JDBCDriver").newInstance();
		}
		catch (Exception e){
			System.out.println("Driver DB tidak ditemukan \n");
			System.exit(1);
		}
		String url = "jdbc:mckoi://localhost"; 
		String username = "LARAS";
		String password = "1234";
		Connection connection;//2. buat connect
		Scanner sc=new Scanner(System.in);
		try{
			connection = DriverManager.getConnection(url, username, password);
			Statement stmt=connection.createStatement(); //3. buat statement
			System.out.print("Masukkan id Product yang dicari");
			String id=sc.next();
			ResultSet rs= stmt.executeQuery("Select * from Products where id=" +id);
			
			while(rs.next()){
				System.out.println(rs.getString(1)+ "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
		}
		catch (SQLException e){
			System.out.println("Unable to make a connection to the database. \n" + "The reason:" + e.getMessage());
			System.exit(1);
			return;
		}
		try{
			connection.close();
		}
		catch (SQLException e){
			System.out.println("An error occured \n" + "The SQLException message is: " +e.getMessage());
			return;
		}
	}
	
}
