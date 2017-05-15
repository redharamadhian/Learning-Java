package soal7;

/**
 * Created by redharamadhian on 5/15/17.
 */
public class Main {

    public void oddEven(int number){
        if ((number % 2) == 0){
            System.out.println("The Number "+ number + " is Even");}
        else {
            System.out.println("The Number "+ number + " is Odd");}
    }

    public void insertValue(){
        for (int i = 0; i < 5; i++){
            int randomNumber =(int )(Math.random() * 50 + 1);
            oddEven(randomNumber);
        }
    }

    public static void main(String[] args){
        Main soal7 = new Main();
        soal7.insertValue();
    }
}
