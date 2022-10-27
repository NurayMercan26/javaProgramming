package day37_Inheritance.AnimalTask.phoneTask;

public class Samsung extends phone {
    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }
}
/*
Create a subclass of phone named Samsung:
      Variables:
        brand,model,size,price,color
        Methods:
          call(long PhoneNumber)
          text(long phoneNumber)
          freeze()
          toString()
 */