/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Shelin
 */

import javax.swing.JOptionPane;

public class tarik {
    private int saldo;
    public void ambil (int tab, int t){
        if (t%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM SK tidak menerima uang koin \n Silahkan ulangi kembali!","Transaksi Gagal",0);
        else{
            if(t>tab)
                JOptionPane.showMessageDialog(null,"Saldo Anda tidak mencukupi \nSilahkan lakukan penyetoran","Transaksi Gagal",0);
        else if(t>50000)
                JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan tunai adalah Rp.50.000,00","Transaksi Gagal",0);
        else{
                saldo = tab-t;
                JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar :"+saldo);
                if(tab<=50000)
                    JOptionPane.showMessageDialog(null,"Saldo minmal Rp.50.000,00 Segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2);
                }     
        }
    }
public int getsaldo(){
        return saldo;
}
}

