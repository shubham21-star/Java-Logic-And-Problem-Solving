import java.util.Scanner;

public class array_merze{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=2;
        int m=3;

        int[][] array1=new int[n][m];


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array1[i][j]=sc.nextInt();
            }
        }

        int[][] array2=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array2[i][j]=sc.nextInt();
            }
        }

        int[][] array3=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array3[i][j]=array1[i][j]+array2[i][j];
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }
}      