import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {
	
	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		Student student = new Student(444,"wqertyu8i",66);
		dao.create(student);
		
		
	}
}
