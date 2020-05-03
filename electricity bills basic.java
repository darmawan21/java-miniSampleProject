/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programbayarlistrik;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class Programbayarlistrik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nl=JOptionPane.showInputDialog("Masukkan No Rek Listrik");
        String np=JOptionPane.showInputDialog("Masukkan Nama Pelanggan");
        String adaya=JOptionPane.showInputDialog("Masukkan Daya (450,900,1300)");
        String apemakai=JOptionPane.showInputDialog("Masukkan Pemakaian (Dalam Kwh)");
        int daya=Integer.parseInt(adaya);
        int pemakai=Integer.parseInt(apemakai);
        int tdl; // tarif dasar listrik
        
        //proses
        double tobay;
        if (pemakai <= 100) {
            tdl = 1300;
        } else if ((pemakai>100) && (daya == 450)) {
            tdl = 1400;
        } else if ((pemakai>100) && (daya == 900)) {
            tdl = 1500;
        } else if ((pemakai>100)&&(daya==1300)){
            tdl = 1700;
         }else{
            tdl = 0;
        }
        tobay = pemakai * tdl;
        
        System.out.println("No Rek Listrik = "+ nl);
        System.out.println(" Nama Pelanggan = "+ np);
        System.out.println(" DAYA = "+ adaya);
        System.out.println(" Pemakaian = "+ pemakai);
        System.out.println(" Total Biaya = Rp. "+ tobay);
    }
    
}
