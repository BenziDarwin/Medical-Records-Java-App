package village.clinic.records;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ejer
 */


public class VillageClinicRecords {
    /**
     * @param args the command line arguments
     * @return 
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static Connection connectDB() {
    Connection con = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost","Benzi","Genesisthe movie");
        System.out.println("Suceeded!");
        return con;
        } catch(ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            System.out.println("Connection failed!");
            return null;
        }
    }
    public static void main(String[] args){
        
        new Login().setVisible(true);
        connectDB();
    }   
}
