package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(brand+" "+model+" breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand+" "+model+ " is racing car");
    }


    @Override
    public void start() {
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }
}
/*
BMW:

    extra methods:
        breakDown()
        racing()
 */