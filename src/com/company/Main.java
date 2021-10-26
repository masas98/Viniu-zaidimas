package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


//VYNIU KALIMAS
        boolean laimejote=false;
        int vinis=85;
        int count=0;
        int vnt=5;

        while (laimejote==false)
        {
            int smugis= (int) (Math.random()* 20 + 10);
            int chance=(int) (Math.random()* 2);
            if(chance==1){
            vinis=vinis-smugis;
            System.out.println("Iki pilnai įkaltos vinies jums liko: "+ vinis);
            count++;
            }
            else{
                System.out.println("Nepataikėte į vinį");
                count++;
            }
            if (vinis<=0){
                vnt=vnt-1;
                vinis=85;
                System.out.println("Liko: "+vnt);
            }
            if (vnt==0)
            laimejote=true;


        }

        System.out.println("Įkalti 5 vinis jums prireikė "+count+ " smūgių");


        int n=30;
        int [] newArr= new int[n];
        for (int i = 0; i <n ; i++) {
            int skc= (int) (Math.random()* 20 + 5);
            newArr[i]=skc;
        }
        System.out.println(Arrays.toString(newArr));

        int daugiauuz10=0;

        for (int a = 0; a < 30; a++) {
            if (newArr[a]>10) {
                daugiauuz10++;
            }
        }
        System.out.println("daugiau uz 10 skaičiu yra: " + daugiauuz10);


        int maxx= newArr[0];
        for (int b = 0; b < newArr.length-1; b++) {
            if (maxx<newArr[b+1]){
                maxx=newArr[b+1];
            }
        }
        System.out.println("Didžiausias skaičius yra:  "+ maxx);

        for (int i = 0; i <newArr.length;i++) {
            if (maxx==newArr[i]){
                System.out.println("INDEXAS: " + i);
            }
        }

        int suma=0;


        for (int c = 0; c < n; c++) {
            if (newArr[c]%2==0){
                suma=suma+c;
            }
        }
        System.out.println("Porinių skaičiu suma " + suma);

        int indexsuma=0;
        for (int y = 0; y < newArr.length; y++) {
            if(y%2==0)
                indexsuma=indexsuma+y;

        }
        System.out.println("Porinių INDEXŲ skaičiu suma " + indexsuma);

//        int [] arr= new int [5];
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]+ " ");
//        }

        for (int z = 0; z <newArr.length ; z++) {

        for (int i = 0; i < newArr.length-1; i++) {
            if (newArr[i] > newArr[i + 1]){
            int tmp= newArr[i];
            newArr[i]=newArr[i+1];
            newArr[i+1]=tmp;
            }
        }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+ " ");

        }
        System.out.println();
//        3 D
        int [] Arr= new int [30];
        for (int i = 0; i <newArr.length ; i++) {
            Arr[i]=newArr[i]-i;

        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();

        // 3 E
        int [] arr= new int[40];
        for (int i = 0; i < newArr.length; i++) {
            arr[i]=newArr[i];
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
//           arr[i]=newArr[i];
            int skc= (int) (Math.random()* 20 + 5);
            if(i>29){
                arr[i]=skc;
            }
        }
        newArr=arr;
        System.out.println(Arrays.toString(newArr));

        // 3F
//        int e=0;
//        int o=0;
//        for (int i = 0; i < newArr.length; i++) {
//            if (i%2==0){
//                e++;
//            }
//            else o++;
//        }
//       //3F
        int [] arrEven=new int [20];
        int [] arrOdd= new int [20];
        int masyv=0;
        int masyv2=0;

        for (int i = 0; i < newArr.length; i++) {

            if ((newArr.length-i)%2==0){
                    arrEven[masyv]=i;
                    masyv++;
            }
            else {
                arrOdd[masyv2]=i;
                masyv2++;
            }
        }
        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrOdd));

        //3G
        int zero=0;
        for (int i = 0; i < arrEven.length; i++) {
            if(arrEven[i]>15) {
                arrEven[i] = zero;
            }
        }
        System.out.println(Arrays.toString(arrEven));

//        3H
        for (int i = 0; i <arrEven.length ; i++) {
            if(arrEven[i]>10){
                System.out.println("INDEXAS: "+i);
                break;
            }

        }
//        String chars = "ABC";
//        Random rnd = new Random();
//        char c = chars.charAt(rnd.nextInt(chars.length()));
//        System.out.println(c);
//
// 3 užd
        char[] charArr= new char[200];
        char a= 'A';
        char b= 'B';
        char c= 'C';
        int aCounter=0;
        int bCounter=0;
        int cCounter=0;

        for (int i = 0; i <charArr.length ; i++) {
            String chars = "ABC";
            Random rnd = new Random();
            char ch = chars.charAt(rnd.nextInt(chars.length()));
            charArr[i]=ch;
            if (charArr[i]==a){
                aCounter++;
            }
            else if (charArr[i]==b){
                bCounter++;
            }
            else {
                cCounter++;
            }
        }
//        System.out.println(Arrays.toString(charArr));
        System.out.println("Masyve yra " + aCounter + " raidės");
        System.out.println("Masyve yra " + bCounter + " raidės");
        System.out.println("Masyve yra " + cCounter + " raidės");

//      4 UŽD
        Arrays.sort(charArr);
        for(int i = 0; i < charArr.length; i++){
            System.out.print(charArr[i] + " ");
        }

















































    }
}
