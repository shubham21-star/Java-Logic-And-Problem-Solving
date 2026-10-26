public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        int row =0;
        while(row<n){
            int col =0;
            while(col<n){
                if(col == row || col == n - 1 - row){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}