public class Pattern7{
    public static void main(String[] args){

        int n=5;
        int row=0;

        while(row<n){

            // Star print
            int col=0;
            while(col<n){

                if(row==0 || col==n-1 || row==n-1 || col==0){
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