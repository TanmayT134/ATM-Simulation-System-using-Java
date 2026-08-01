import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Jxcx00521");
            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
