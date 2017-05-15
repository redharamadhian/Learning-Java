package soal4;

/**
 * Created by redharamadhian on 5/15/17.
 */
public class Main {

    public static void main(String[] args){

        // Define boolean variable
        boolean firstCalculation    = ((10 + 10) > 15 && (18 + 2) < 21);
        boolean secondCalculation   = ((12 - 1) < 12 || (13 - 2) > 10);
        boolean thirdCalculation    = ((10 * 10) > 99);
        boolean fourthCalculation    = !((150 * 3) < 99);

        // Print out the result
        System.out.println(firstCalculation);
        System.out.println(secondCalculation);
        System.out.println(thirdCalculation);
        System.out.println(fourthCalculation);
    }
}
