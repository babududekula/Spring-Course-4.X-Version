import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClassA 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "");
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			pst.setString(1, "s-111");
			pst.setString(2, "Babu");
			pst.setString(3, "Hyd");
			pst.addBatch();
			
			pst.setString(1, "s-222");
			pst.setString(2, "Durga");
			pst.setString(3, "Nellore");
			pst.addBatch();
			
			pst.setString(1, "s-333");
			pst.setString(2, "Hero");
			pst.setString(3, "tirupati");
			pst.addBatch();
			
			pst.setString(1, "s-444");
			pst.setString(2, "Naresh");
			pst.setString(3, "Kammam");
			pst.addBatch();
			
			int[] rowCount = pst.executeBatch();
			for(int rowCount1:rowCount)
			{
				System.out.println("rowCount is :"+rowCount1);
			}
			
			
			
		}	
			
		catch (Exception e) 
		{
			System.out.println("Failure");
			e.printStackTrace();
		}
	}
}

