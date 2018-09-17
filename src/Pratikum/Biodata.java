/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author GL553VD
 */
public class Biodata {
    public static void main(String[] args){
        String nama, alamat, NIS, jeniskelamin, tempatlahir, tanggallahir, motto;
        
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("B I O D A T A");
        String Nama;
            InputStreamReader isr = new InputStreamReader (System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Nama:");
            nama = keyboard.next();
                     
            
            System.out.print("NIS:");
            NIS = keyboard.next();
            System.out.print("Tempat lahir:");
            tempatlahir = keyboard.next();
            System.out.print("Tanggal lahir:");
            tanggallahir = keyboard.next();
            System.out.print("Jenis kelamin:");
            jeniskelamin= keyboard.next();
            System.out.print("Alamat:");
            alamat = keyboard.next();
            System.out.print("Motto:");
             motto = keyboard.next();
        
        
        
        
        
        
        
        
        
        
        
        
}
}
