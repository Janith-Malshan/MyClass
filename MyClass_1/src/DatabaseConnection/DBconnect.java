
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect {
    
    public static Connection connect(){
          
          Connection conn = null;
          
          try {
                Class.forName("org.sqlite.JDBC"); //com.microsoft.sqlserver.jdbc.SQLServerDriver
              conn = DriverManager.getConnection("jdbc:sqlite:MyClass.sqlite"); //jdbc:sqlserver://PSL026;databaseName=MyClass","sa","1234
              
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e);
          }
          
          
          return conn;
          
      }
    
}
