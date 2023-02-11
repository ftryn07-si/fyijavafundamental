package com.juaracoding.fyijavafundamental.testharian.pratikum_4;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/6/2023 7:36 PM
@Last Modified 2/6/2023 7:36 PM
Version 1.0
*/
import java.util.Random;
public class Soal1 {
    public static void main(String[] args) {
         /*
            Soal Nomor 1 Praktikum 4 Java Fundamental
          */

        /*
            Jumlah karakter yang konstan untuk format tersebut adalah
            1. Tanda Hubung (1 digit)
            2. Tanda @ (1 digit)
            3. Tanda . setelah provider sebelum domain (1 digit)
            4. Angka (2 digit)

            Jumlah karakter yang dinamis ada di
            1. format pemilihan provider
            2. format pemilihan domain
         */

        for(int u=0;u<100;u++){

            int intMax = 40;//persyaratan maksimal 40 karakter
            int intMin = 25;//persyaratan minimal 25 karakter
            StringBuilder sBuild = new StringBuilder();
            Random rand = new Random();
            String strAlphabet ="abcdefghijklmnopqrstuvwxyz";
            int intLengthAlphabet = strAlphabet.length();
            String strNumeric = "0123456789";
            int intLengthNumeric = strNumeric.length();
            String [] strTandaHubung = {"_","."};
            int intRandTandaHubung = rand.nextInt(strTandaHubung.length-1);//1 -> 1
            String [] strProvider = {"yahoo","gmail","hotmail","ymail"};
            int intRandProvider = rand.nextInt(strProvider.length-1);//3 -> 5
            String [] strDomain = {"com","co.id","id","edu","ac.id","sch","xyz","en"};
            int intRandDomain = rand.nextInt(strDomain.length-1);//6 -> 3
            final int intJmlKarakterConstant = 5;
            String strFormatEmail = "";

            int intTotalAttributFormat = strDomain[intRandDomain].length()+strProvider[intRandProvider].length()+intJmlKarakterConstant;//13
            int intLengthMinHuruf =(int) Math.ceil((intMin-intTotalAttributFormat)/2.0);// 25 - 13 = 12 / 2 = 6
            int intLengthMaxHuruf = (int) Math.floor((intMax-intTotalAttributFormat)/2.0);// 40 - 13 = 27 / 2 = 13.5
            int intLoopKataAwal  = rand.nextInt(intLengthMinHuruf,intLengthMaxHuruf); // 9
            int intLoopKataAkhir = rand.nextInt(intLengthMinHuruf,intLengthMaxHuruf+1); // 14
            String strTampungKataAwal = "";
            String strTampungKataAkhir = "";
            for (int i=0;i<intLoopKataAwal;i++)
            {
                sBuild.setLength(0);
                strTampungKataAwal = sBuild.append(strTampungKataAwal).append(strAlphabet.charAt(rand.nextInt(intLengthAlphabet-1))).toString();
            }
            for (int i=0;i<intLoopKataAkhir;i++)
            {
                sBuild.setLength(0);
                strTampungKataAkhir = sBuild.append(strTampungKataAkhir).append(strAlphabet.charAt(rand.nextInt(intLengthAlphabet-1))).toString();
            }
            sBuild.setLength(0);
            String strTampungNumeric = sBuild.append(strNumeric.charAt(rand.nextInt(intLengthNumeric-1))).append(strNumeric.charAt(rand.nextInt(intLengthNumeric-1))).toString();

            sBuild.setLength(0);
            strFormatEmail  = sBuild.append(strTampungKataAwal).
                    append(strTandaHubung[intRandTandaHubung]).
                    append(strTampungKataAkhir).append(strTampungNumeric).append("@").append(strProvider[intRandProvider]).append(".").append(strDomain[intRandDomain]).toString();

            System.out.println("Hasil Generate Adalah : "+strFormatEmail+" ----------->"+strFormatEmail.length());
//            int checkLength = strFormatEmail.length();
//            System.out.println("Mulai Proses Pengecekan");
//            if(checkLength<25 || checkLength>40){
//                System.out.println("Hasil Generate Adalah : "+strFormatEmail+" ----------->"+strFormatEmail.length());
//            }
        }
    }
}