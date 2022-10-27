package day37_Inheritance.AnimalTask.phoneTask;

public class phone {

    public  String brand;
    public  String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery = true;

    public phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        hasBattery = true;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling ");
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
/*
1. Create a class named Phone:
      Variables:
          brand,model,size,price, color

          Add Constructor to set all the fields

          methods:
          call(long phoneNumber)
          text(long phoneNumber)
          toString()
 */