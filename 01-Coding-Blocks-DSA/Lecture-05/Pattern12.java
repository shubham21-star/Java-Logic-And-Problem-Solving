public class Pattern12{
    public static void main(String[] args){

        int n=5;
        int row=0;

        while(row<n){

            int space=0;

            while(space<row*2){
                System.out.print("  ");
                space++;
            }

            int col=0;

            while(col<n-row){
                System.out.print("* ");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}