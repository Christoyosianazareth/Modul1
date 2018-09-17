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
public class L7 {
    public static void main(String[]args){
        Scanner masukan=new Scanner (System.in);
        System.out.print("Nilai web:");
        int nilai = masukan.nextInt();
        if (nilai >= 90)
            System.out.println("Nilai A");
        else if (nilai >=85)
            System.out.println("Nilai B");
        else if (nilai >= 70)
            System.out.println("Nilai C");
        else if (nilai >= 50)
            System.out.println("Nilai D");
        else 
            System.out.println("Nilai E");
    }
}
