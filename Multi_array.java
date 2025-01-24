public class Multi_array {
    public static void main(String[] args) {
        
        int nums[][] = new int[3][4];

            // Assigning values to Multi Dimentional Array Using Math Random Method.
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    nums[i][j] =(int)(Math.random() * 10);
                }
            }
            
            // Printing Multi Dimentional Array.
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    System.out.print(" " + nums[i][j]);
                }
                System.err.println();
            }



    }
}
