package soal10;


/**
 * Created by redharamadhian on 5/15/17.
 */
public class Animal{

    public void sound(String animalType){
        if (animalType == "Dog"){
            System.out.println("Woof! hes barking because he is a dog");
        } else if (animalType == "Cat") {
            System.out.println("Meaouw! hes meowing because he is a cat");
        }
    }


    public void age(int age){
        System.out.println("The age is " + age);
    }

    public static void main(String[] args){
    }
}
