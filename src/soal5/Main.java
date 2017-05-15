package soal5;

/**
 * Created by redharamadhian on 5/15/17.
 */
public class Main {

    public void kuadrat(Integer number){
        // Define Variable
        int calculation;

        // Generate calculation
        calculation = number * number;

        // Showing result
        System.out.println(calculation);
    }

    public static void main(String[] args){

        Main soal5 = new Main();
        soal5.kuadrat(10);

    }
}
