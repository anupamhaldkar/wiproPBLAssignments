import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Fourth {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Bhopal12");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = Integer.parseInt(args[0]);
		double fees = Double.parseDouble(args[1]);
		
		try {			
			sql = "UPDATE student SET fees = ? WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, fees);
			pstmt.setInt(2, rollno);
			
			if (pstmt.executeUpdate() == 1)
				System.out.println("student's fees having rollno = " + rollno + " updated successfully");
			else
				System.out.println("Error occurred");
pstmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();
	}
}
