public class Pattern5{
    public static void main(String[] args){

        int n=5;
        int row=0;

        while(row<n){

            int col=0;

            while(col<n){

                if(col>=row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

                col++;
            }

            System.out.println();
            row++;
        }
    }
}