package day38_Inheritance.carTask;

public class Toyota extends Car {

    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }


    public void start(){
        System.out.println("twist the key to ignition to start "+brand+" "+model);
    }
}
