package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[]={3,7,5,9,-21,65,-45,7};
        int n=arr.length;
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i]>highest){
                secondHighest=highest;
                highest=arr[i];
            }
            if(arr[i]<highest && arr[i]> secondHighest){
                seconfHighest=arr[i];
            }
            System.out.println("second highest number"+secondHighest);
        }

    }
