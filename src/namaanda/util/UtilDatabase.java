/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namaanda.util;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lintanhg
 */
public class UtilDatabase extends Koneksi{
    //Koneksi koneksi = new Koneksi();
    
    public void simpanData(String nama, String nope, String alamat){
        koneksiDatabase();
        if("".equals(nama) || "".equals(nope) || "".equals(alamat)){
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
        }else{
        try {
           String query = "insert into tbl_barang(kode,nama_barang,qty) values('"+nama+"','"+nope+"','"+alamat+"')";
           state.executeUpdate(query);
           JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan..");
        } catch (SQLException ex){
            System.err.println("SQLException:"+ex.getMessage());
        }
        }
    }
    
    
}
