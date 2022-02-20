package com.company;

public class Main {

    public static void main(String[] args) {

	int arr[][]=
            {
                    {1,5,7},
                    {2,6,8},
                    {5,8,2}
            };
        int sum=0;
    for(int i=0;i<3;i++){
        sum=sum+arr[3-1-i][i];

    }
    System.out.print("sum of anti diagonal:"+sum);
    }
}
