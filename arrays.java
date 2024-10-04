

class Arrays{
    public static void main(String[] a)
    {
        // int nums[] = {1,2,3,4,5};

        // System.out.println(nums[0]);

        // for(int i=0; i<4; i++){
        //     System.out.println(nums[i]);
        // }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        
        // for(int i=0; i<cars.length; i++){
        //     System.out.println(cars[i]);
        // }

        /* Java Multi-Dimensional Arrays */
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); //  7

        int nums[][] = new int[3][4];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}