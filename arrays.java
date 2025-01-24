public class arrays{

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};

        int arr1[] = new int[4]; //Fixed array
        arr1[0] = 10;
        arr1[1] = 11;
        arr1[2] = 12;
        arr1[3] = 13;
        

        //Printing arr[]
        for(int i=0;i<=3;i++){

            System.out.print(arr[i]);
            System.out.print(" ");
           

        }

                System.out.println();
                
                System.out.println();

        // Printing arr1[]
        for(int i=0;i<=3;i++){

            System.out.print(arr1[i]);
            System.out.print(" ");

        }


    }

}