/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversiwaktu;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Konversiwaktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d,H,J,M,D;
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukan Jumlah Detik = ");d=baca.nextInt();
        D=d;
        H=D/86400; D=D%86400;
        J=D/3600; D=D%3600;
        M=D/60; D=D%60;
        System.out.print(d+" detik = ");
        System.out.print(H+" Hari = ");
        System.out.print(J+" Jam = ");
        System.out.print(M+" Menit = ");
        System.out.print(D+" detik = ");
        
    }
    
}
