package com.juaracoding.fyijavafundamental.testharian.pratikum_5;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/5/2023 10:59 AM
@Last Modified 2/5/2023 10:59 AM
Version 1.0
*/
import java.util.Scanner;
public class Pratikum5 {
    /*
	Soal Nomor 1 Praktikum 5 Java Fundamental
*/
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("##  Program Java Segitiga Angka  ##");
            System.out.println("===================================");
            int angka,i,j,x;

            System.out.print("Masukan Angka: ");
            angka = input.nextInt();
            System.out.println();

            for(i=1; i<=angka; i++) {
                for(j=angka-1; j>=i; j--){
                    System.out.print(" ");
                }
                for(x=i; x>0; x--) {
                    System.out.print(x);
                }
                System.out.println(" ");
            }
        }
    }