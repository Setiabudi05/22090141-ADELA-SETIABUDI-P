
package koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
public class Koneksi {
    
    
    
    public static Connection koneksi_database() {
        try{
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("datasekolah");
            m.setServerName("localhost");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");
            
            Connection C = m.getConnection();
            System.out.println("sukses terhubung ke database");
            return C;
            
            
        } catch (Exception e) {
            //penanganan error
            System.out.println("gagal terhubung ke database");
            System.out.println("Error: "+ e.getMessage());
            
        }
        return null;
    }
 
}
     