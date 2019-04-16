package dataStructureHomework;

public class Array2D {

        public static void main(String[] args) {

            int array[][] = new int[2][2];
            array[0][0] = 100;
            array[0][1] = 200;
            array[1][0] = 300;
            array[1][1] = 400;

            System.out.println(array.length); //size of row
            System.out.println(array[0].length); //size of column
            System.out.println(array[1][0]);
            System.out.println("*******");
            //printing all the values
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[0].length; col++) {
                    System.out.println(array[row][col]);
                }
                System.out.println("*******"); //inner loops
                for (int m = 0; m < 5; m++) {
                    System.out.println("Java");
                    for (int j = 0; j < 6; j++) {
                        System.out.println("Selenium");
                    }
                }
            }
        }









    }


