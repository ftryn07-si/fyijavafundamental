package com.juaracoding.fyijavafundamental.cobacoba.oretoretan;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Fitriyani a.k.a. Fitriyani
Java Developer
Created on 13/01/2023 19:16
@Last Modified 13/01/2023 19:16
Version 1.0
*/

import java.util.Scanner;

public class OretOretanArray {
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        System.out.print("Masukan Karakter Huruf: ");
        String strInput = scn.nextLine();
        char chA ='X';
        int intA = 0;
        int intTotal=0;
        for (int x=0;x<strInput.length();x++)
        {
            chA = strInput.charAt(x);
            intA = chA;

            if((intA>=32 && intA<=64)||(intA>=65 && intA<=90))
            {
                intTotal=intTotal+intA;

            }

        }
        System.out.println(intTotal);


    }
}
