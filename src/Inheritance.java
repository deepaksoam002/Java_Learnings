public class Inheritance {

    public static void main(String[] args){

        CSEngineer en = new CSEngineer(); // When CSEngineer class our main class, but we also want to use some method
        en.collegeType();                 // from parent class
        en.labs();
        en.sub();

        Vehicle v1 = new Bike();
        v1.fuel();
        v1.tyre();

        Vehicle v2 = new Car();
        v2.allowedPassenger();

    }
}

//*********************************
class Engineer {
    void collegeType(){
        System.out.println("Engineering College");
    }
}

class CSEngineer extends Engineer{
     void labs(){
        System.out.println("Computer labs");
    }
    void sub(){
        System.out.println("Programming Language");
    }
}

//***********************************

class Vehicle{
    String name;
    void start(){
        System.out.println(name +"start");
    }
    void stop(){
        System.out.println(name+ "Stop");
    }
    void steering(){
        System.out.println(name+" have steering");
    }
    void fuel(){
        System.out.println(name+" need fuel");
    }
    void tyre(){
        System.out.println(name +"have four tyre ");
    }
    void allowedPassenger(){
        System.out.println(name + "allowed two passenger only");
    }
} // Polymorphism  method overriding

class Bike extends Vehicle{
    String name = "Bike";

    Bike(){
        super.name = this.name;
    }

    @Override
    void fuel() {
        System.out.println(name+"not need any fuel");
    }

    @Override
    void tyre(){
        System.out.println(name + "have two tyre");
    }
}

class Car extends Vehicle{

    String name = "Car";
    Car(){
        super.name = this.name;
    }
    @Override
    void allowedPassenger() {
        System.out.println(name +"allowed four passenger only");
    }
}
