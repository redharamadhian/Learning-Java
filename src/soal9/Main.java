package soal9;


/**
 * Created by redharamadhian on 5/15/17.
 */
public class Main {

    public void isAlive(boolean alive){
        if (!alive){
            System.out.println("Already Dead");
        } else {
            System.out.println("Still Alive");
        }
    }

    public void name(String name){
        System.out.println(name);
    }

    public void age(int age){
        System.out.println(age);
    }

    public static void main(String[] args){
        Main animals = new Main();
        animals.name("Dogi");
        animals.age(7);
        animals.isAlive(true);
    }
}
