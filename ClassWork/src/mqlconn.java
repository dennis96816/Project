import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class mqlconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/my_test_db","root", "");	
			Statement st = conn.createStatement();
			ResultSet rs =st.executeQuery("select * from student");
			while(rs.next()) {
				JOptionPane.showMessageDialog(null, rs.getInt(1)+"  "+rs.getString(2));
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

}
