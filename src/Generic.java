import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args){

        List <Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        test(dogs);

    }

    static void test(List <? extends Animal>x){
        for(Animal a : x){
            a.eating();
        }
    }

    static void check(List <? super Animal> values){

        values.add(new Dog());
        values.add(new Animal());

//        for(Object a : values){     // we do not do that it will lead to error
//            Animal x = (Animal) a;
//            x.walking();
//        }
    }
}

class Animal{
    void eating(){
        System.out.println("Animal is eating");
    };
    void walking(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    void barking(){
        System.out.println("Dog is barking");
    }
}
