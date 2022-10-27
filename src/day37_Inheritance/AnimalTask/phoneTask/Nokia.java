package day37_Inheritance.AnimalTask.phoneTask;

public class Nokia extends phone {
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }
}
/*
Create a subclass of phone named Nokia:
      Variables:
        brand,model,size,price,color
        Methods:
          call(long PhoneNumber)
          text(long phoneNumber)
          selfDefence()
          toString()
 */