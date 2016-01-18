/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namaanda.control;

import javax.swing.JOptionPane;
import namaanda.util.UtilDatabase;

/**
 *
 * @author Lintanhg
 */
public class DataBarang {
    private String nama;
    private String nope;
    private String alamat;
    
    UtilDatabase simpan = new UtilDatabase();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if(nama == null){
            JOptionPane.showMessageDialog(null, "Nama tidak boleh null");
        }else if(nama.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama tidak boleh Kosong");
        }else{
        this.nama = nama;
        }
    }

    public String getNope() {
        return nope;
    }

    public void setNope(String nope) {
        if(nope == null){
            JOptionPane.showMessageDialog(null, "Nomor Handphone tidak boleh null");
        }else if(nope.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nomor Handphone tidak boleh Kosong");
        }else{
        this.nope = nope;
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        if(alamat == null){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh null");
        }else if(alamat.isEmpty()){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh Kosong");
        }else{
        this.alamat = alamat;
        }

    }
    public void simpan(){
        simpan.simpanData(getNama(), getNope(), getAlamat());
    }
    
    public void edit(){
    }
    
    public void hapus(){
        
    }
    
}
