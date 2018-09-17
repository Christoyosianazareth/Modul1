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
public class L8 {
    public static void main(String[] args){
        Scanner masukan=new Scanner(System.in);
        System.out.print("Silahkan pilih angka:");
        int bil=masukan.nextInt();
        switch(bil){
            case 1 : System.out.println("satu");
            break;
            case 2 : System.out.println("dua");
            break;
            case 3 : System.out.println("tiga");
            break;
            case 4 : System.out.println("empat");
            break;
            case 5 : System.out.println("lima");
            break;
        }
    }
}
