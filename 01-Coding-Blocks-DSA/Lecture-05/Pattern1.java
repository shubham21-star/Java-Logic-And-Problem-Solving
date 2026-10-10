// package Lecture-05;

public class Pattern1{
    public static void main(String[] args){

        int n=5;
        int row=0;

        while(row<n){

            // Star print
            int col=0;
            while(col<n){
                System.out.print("* ");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}