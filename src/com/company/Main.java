package com.company;

public class Main {

    public static void main(String[] args) {
        int A;
        for(int i=32;i<100;i++){
            A=i*i;
            int a=A/1000;
            int b=(A-1000*a)/100;
            if(a!=b){
                continue;
            }else {
                int d=A%10;
                int c=A%100/10;
                if(d==c){
                    System.out.print("The number is:"+A);
                    break;
                }else continue;
            }
        }
    }
}
