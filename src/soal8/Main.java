package soal8;

import java.util.ArrayList;

/**
 * Created by redharamadhian on 5/15/17.
 */
public class Main {

    public void insertValue(){
        ArrayList<Integer> randomValue = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            int randomNumber =(int )(Math.random() * 50 + 1);
            randomValue.add(randomNumber);
            System.out.println("The value from array index number "+ i + " is " + randomValue.get(i));
        }
    }

    public static void main(String[] args){
        Main soal8 = new Main();
        soal8.insertValue();
    }
}
