package com.juaracoding.fyijavafundamental.testharian.pratikum_3;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 1/23/2023 11:10 AM
@Last Modified 1/23/2023 11:10 AM
Version 1.0
*/

import java.util.Scanner;

public class Pratikum3 {
    /*
	Soal Nomor 1 Praktikum 3 Java Fundamental
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Jumlah Detik: ");
        int detik = sc.nextInt();
        int menit=detik/60;
        int sisaDetik=detik%60;
        System.out.println(detik + " detik sama dengan " + menit + " menit " + sisaDetik + " detik ");

    }
}
