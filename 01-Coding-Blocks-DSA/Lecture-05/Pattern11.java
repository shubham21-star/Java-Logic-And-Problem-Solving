public class Pattern11{
    public static void main(String[] args){

        int n=5;
        int row=0;

        while(row<n){

            int space=0;

            while(space<n-row-1){
                System.out.print("  ");
                space++;
            }

            int col=0;

            while(col<=row){

                System.out.print("*   ");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}