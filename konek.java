
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author user
 */ 
public class konek {
    static Connection Koneksi;
    public static Connection getConnection(){
        try{
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/Mahasiswa","root","");
        }catch (Exception t){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal!");
        }
        return Koneksi;
    }
}
