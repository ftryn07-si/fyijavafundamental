package com.juaracoding.fyijavafundamental.testharian.pratikum_2;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Fitriyani a.k.a. Fitriyani
Java Developer
Created on 19/01/2023 19:04
@Last Modified 19/01/2023 19:04
Version 1.0
*/
import java.util.Scanner;

public class Pratikum2 {
    /*
	Soal Nomor 1 Praktikum 2 Java Fundamental
*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Masukan Angka: ");
        int intX=0;
        int intA=0;
        double Y=0;
        boolean i=true;
        try {
            do{
                intX = sc.nextInt();
                int[] rata = {intA};
                intA+= rata.length;
                Y+= intX;
            } while (i) ;
        }
            catch (Exception e) {
                System.out.println("Nilai Rata-rata : "+ Y/intA);

        }
    }
    }
