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
public class Konversisuhu {
    public static void main(String[]args){
        Scanner masukan = new Scanner (System.in);
        int a=78;
        
        //perhitungabn
        int r=a*4/5;
        int f=a*9/5;
        int k=a*5/5;
        
        System.out.println("Konversi suhu");
        System.out.println("Reamur="+r+"R");
        System.out.println("Farenheit="+f+"F");
        System.out.println("Kelvin="+k+"K");
    }
}
