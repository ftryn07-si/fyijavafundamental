package com.juaracoding.fyijavafundamental.testharian.pratikum_1;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Fitriyani a.k.a. Fitriyani
Java Developer
Created on 13/01/2023 19:18
@Last Modified 13/01/2023 19:18
Version 1.0
*/
import java.util.Scanner;
public class Pratikum1 {
    //Start ASCII
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        System.out.print("Masukan Kata: ");
        String strInput = scn.nextLine();
        char chA='X';
        int intA=0;
        int intHasil=0;
        for (int x=0;x<strInput.length();x++)
        {
            chA = strInput.charAt(x);
            intA = chA;
            if((intA >=32 && intA <=47) || (intA>=48 && intA<=57) ||
                    (intA>=58 && intA<=64) || (intA>=65 && intA<=95))
            {
                intHasil=intHasil+intA;
            }
        }
        System.out.println("Hasil Kode ASCII "+" adalah " + intHasil);
    }
}