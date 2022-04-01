import java.util.Arrays;

public class Application {

    //Fun with loops - magic squre
    //declare a variable to store total
   //for each row (loop)  = i
    //add all numbers in row together (loop) j
    public static void main(String[] args) {
        try {
            int[][] magicSquare = { {2, 7, 6},
                                    {9, 5, 1},
                                    {4, 3, 8}};

            int total = 0;

            //Loop and add numbers from each row
            for (int row = 0; row < magicSquare.length ; row++) {
                //System.out.println(Arrays.toString(magicSquare[row]));
                for (int column = 0; column < magicSquare[row].length; column++) {

                    System.out.println("current element:" + magicSquare[row][column]);
                    total += magicSquare[row][column];
                }
                System.out.println("Row total: "  + total);
                total = 0;
            }


        }
        catch (Exception e) {
            System.out.println(e);
            return;
        }

    }

    //example with single array
    public static void tempMain(String[] args) {
        try {
            int[] numArray = {9, 8, 7, 2, 1, 10, 3};
            int sum = 0;

            //print out all the elements of the array
            for (int i = 0; i < numArray.length; i++) {
                //System.out.println("Item:" + numArray[i]);
                //add numbers to sum
                sum += numArray[i];
            }
            System.out.println("Total:" + sum);
        }
        catch (Exception e) {
            System.out.println(e);
            return;
        }

        System.out.println("I'm fine here!");
    }

}

