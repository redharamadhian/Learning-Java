package soal6;

/**
 * Created by redharamadhian on 5/15/17.
 */
public class Main {

    public void reverseCount(){
        int counterValue = 100;
        for (int i = 0; i <= counterValue; i++){
            int result;
            result = counterValue - i;
            System.out.println(result);
        }
    }

    public static void main(String[] args){
        Main soal6 = new Main();
        soal6.reverseCount();
    }
}
