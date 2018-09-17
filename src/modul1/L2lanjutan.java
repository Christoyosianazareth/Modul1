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
public class L2lanjutan {
    public static void main(String[]args){
        Scanner masukan=new Scanner(System.in);
        int pilihan=9;
        do{
            System.out.println("\nLuas Bangunan");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda:");
            pilihan=masukan.nextInt();
            switch (pilihan){
                case 1 : luasPersegi();break;
                case 2 : luasPersegiPanjang();break;
            }
        }while (pilihan!=3);
    }

    private static void luasPersegiPanjang() {
        Scanner masukan = new Scanner (System.in);
        float sisi, luas;
        System.out.println("Masukan siis:");
        sisi=masukan.nextFloat();
        luas = sisi*sisi;
        System.out.println("Luas persegi adalah:"+luas);
    }

    private static void luasPersegi() {
       Scanner masukan = new Scanner (System.in);
        float panjang, lebar, luas;
        System.out.println("Masukan panjang:");
        panjang=masukan.nextFloat();
        System.out.println("Masukan lebar:");
        lebar=masukan.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah:"+luas);
    }
}
