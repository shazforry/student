import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {


	String dbHost="localhost";
	String dbDatabase="softdev2";
	String dbUser ="root";
	String dbPassword = "";



	public void create (Student student ){

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl = "jdbc:mysql://" + dbHost
					+"/" + dbDatabase
					+"?user=" + dbUser
					+"&password=" + dbPassword;

			Connection conn =DriverManager.getConnection(connectionUrl);

			String sql ="insert into student (id,name,age) values (?,?,?);";

			
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setLong(1, student.id);
			ps.setString(2, student.name);
			ps.setInt(3, student.age);
			ps.executeUpdate();

			conn.close();

		} catch (ClassNotFoundException cnfe){
			throw new RuntimeException(cnfe);
		} catch (SQLException sqle){
			throw new RuntimeException(sqle);
		}

	}

	public void update (Student student ){


	}

	public void Delete (Student student ){


	}
}
