package soal10;


/**
 * Created by redharamadhian on 5/15/17.
 */
public class Pet extends Animal{

    String animalName;

    public Pet(String animalName){
        this.animalName = animalName;
    }

    public void isAlive(boolean alive){
        if (!alive){
            System.out.println("But "+ animalName +" is already dead");
        } else {
            System.out.println("I am happy because "+ animalName +" is still alive");
        }
    }

    public void name(){
        System.out.println("My pet name is " + animalName);
    }

    public static void main(String[] args){

        String kind     = "Cat";
        int age         = 2;
        boolean status  = true;

        Pet pets = new Pet("Garfield");
        pets.name();
        pets.sound(kind);
        pets.age(age);
        pets.isAlive(status);
    }
}
