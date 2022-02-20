package com.company;

public class Main {

    public static void main(String[] args) {
int [][] mat=
        {
                {1, 3, 5},
                {2, 4, 1},
                {7, 8, 9}
        };
            int row=mat.length;
            int col=mat[0].length;
            int even=0,odd=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(mat[i][j]%2==0)
                        even++;
                    else
                        odd++;
                }
            }
            System.out.println("even ="+even);
            System.out.println("odd ="+odd);
        }
    }

