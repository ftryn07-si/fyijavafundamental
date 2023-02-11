package com.juaracoding.fyijavafundamental.testharian.pratikum_6;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/9/2023 10:57 AM
@Last Modified 2/9/2023 10:57 AM
Version 1.0
*/

import java.util.*;
import java.util.Scanner;
public class Pratikum6{
        /*
	Soal Nomor 2 Praktikum 6 Java Fundamental
    */
    public static void main(String[] args) {
        int x;
        int[] intArr = new int[50];
        boolean angka= true;
        boolean notAngka = true;
        try {
            while (angka){
                Scanner sc = new Scanner(System.in);
                System.out.println("Masukan angka :");
                for (int i = 0; i < intArr.length; i++) {
                    intArr[i] = sc.nextInt();
                }
            }
        }catch (Exception e) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan Angka Yang Ingin Dicari :");
            x = sc.nextInt();
            System.out.print("Angka Yang Dicari adalah " + x);
            System.out.println("");
            try {
                for (int i = 0; i <= intArr.length; i++) {
                    if (x == intArr[i]) {
                        System.out.println("Angka " +x+ " ditemukan pada index ke " + i +" Urutan ke "+ (i+1)+" dari data yang diinput");;
                        break;
                    }
                }
            }catch (Exception ex){
                if(notAngka) {
                    System.out.println("Angka  " + x + " tidak ditemukan pada data hasil inputan sebelumnya !! ");
                }
            }
        }
    }
}

