package day37_Inheritance.AnimalTask.phoneTask;

public class Iphone extends phone {

    public Iphone( String model, String size, double price, String color) {
        super("Apple",model, size, price, color);
    }

    public void facetime(long phoneNumber){
        System.out.println(brand+" "+model+" "+" is having a Face Time with phone number"+phoneNumber);
    }

    public void facetime(String email){
        System.out.println(brand+" "+model+" is having a Face Time with email: "+email);
    }
}
/*
Create a subclass of phone named Iphone:
      Variables:
        brand,model,size,price,color
        Methods:
          call(long PhoneNumber)
          text(long phoneNumber)
          facetime(long PhoneNumber)
          facetime(String email)
          toString()
 */