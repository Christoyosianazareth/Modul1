/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;
import java.util.Scanner;
/**
 *
 * @author GL553VD
 */
public class L6 {
    public static void main (String[]args){
        Scanner masukan=new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir PBO:");
        nilai = masukan.nextInt();
        if (nilai<75)
            System.out.println("Siswa tak lulus");
        if (nilai>75);
        System.out.println("Siswa lulus");
    }
}
