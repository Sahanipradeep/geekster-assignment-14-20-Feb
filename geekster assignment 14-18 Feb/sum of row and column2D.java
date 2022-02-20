package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int arr[][]=new int[3][3];
    System.out.println("Enter the elements:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr[i][j]=s.nextInt();
        }
    }
        System.out.println("array:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<3;i++){
        int sum=0;
        for(int j=0;j<3;j++){
            sum=sum+arr[i][j];
        }
        System.out.println("sum of row:"+sum);
    }
    for(int i=0;i<3;i++){
        int sum=0;
        for(int j=0;j<3;j++){
            sum=sum+arr[j][i];
        }
        System.out.println("sum of column:"+sum);
    }

    }
}
