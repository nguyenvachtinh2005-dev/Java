package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class conn {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/qlsinhvien";
            String user = "root";
            String password = "123456";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi MySQL thanh cong!");

        } catch (Exception e) {
        	System.out.println("Loi ket noi CSDL");
            e.printStackTrace();
        }
        return conn;
    }
}