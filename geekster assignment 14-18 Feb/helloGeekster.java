package com.company;

public class Main {

    public static void main(String[] args) {
	String [][] arr=
            {
                    {"Hello","Geekster"},
                    {"Good","Day"}
            };
    for(int i=0;i<2;i++){
        System.out.println(i);
        for(int j=0;j<2;j++){
          System.out.print(arr[i][j]);
        }
        }
    }
}
