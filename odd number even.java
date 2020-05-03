package appperulangan2;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class AppPerulangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       String awal = JOptionPane.showInputDialog("Masukkan Nilai Awal");
       String akhir = JOptionPane.showInputDialog("Masukkan Nilai Akhir");
       
       int bil1 = Integer.parseInt(awal);
       int bil2 = Integer.parseInt(akhir);
       
       System.out.print("Bilangan Ganjil :");
       for (int i = 0; i < bil2; i++) {
            i=i+1;
            System.out.print(i);
            System.out.print(",");
       }
       System.out.println();
       System.out.print("Bilangan Genap :");
        for (int i = bil1; i <= 20; i++) {
            if (i%2 == 0) {
                System.out.print(i);
                System.out.print(",");
            }
        }
        System.out.println();
    }
    
}
