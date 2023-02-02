package com.juaracoding.fyijavafundamental.testharian.pratikum_4;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/2/2023 1:42 PM
@Last Modified 2/2/2023 1:42 PM
Version 1.0
*/
import java.util.*;
import java.util.Random;
public class Pratikum4 {
    /*
	Soal Nomor 1 Praktikum 4 Java Fundamental
*/
    public static void main(String[] args) {
        Random generate = new Random();
        StringBuilder str =new StringBuilder();
        int random  = generate.nextInt(25, 40);
        int angka;
        char kata;
        int angkaRandom = generate.nextInt(10, 100);
        String provider ="yahoo";
        String sambung =".";
        String simbol ="@";
        String domain =".co.id";
        String hasilA = "";
        String hasilB ="";

        for ( int i=0; i<random; i++) {
//            Kode ASCII
            angka = generate.nextInt(97, 123);
            kata = (char) angka;
            if(i%2==0){
                hasilA+=kata;
            }
        }
        hasilB+=hasilA;
        str.append(hasilB);
        str.insert(hasilB.length()/2,sambung);
        str.append(angkaRandom);
        str.append(simbol);
        str.append(provider);
        str.append(domain);
        System.out.println("Email Random Anda adalah : " +str);
    }
}