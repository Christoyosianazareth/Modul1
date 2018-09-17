/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;
import java.util.Scanner;

/**
 *
 * @author GL553VD
 */
public class Bola {
    public static void main(String[]args){
        Scanner masukan=new Scanner (System.in);
        System.out.println("Luas permukaan bola");
        System.out.print("Nilai jari-jari bola:");
        int r=masukan.nextInt();
        
        //penghitungan
        double lp=4*r*r*Math.PI;
        System.out.print("Luas permukaan bola"+r+"adalah:"+lp);
        System.out.println();
        
        
    }
}
