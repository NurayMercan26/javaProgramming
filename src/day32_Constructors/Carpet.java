package day32_Constructors;

public class Carpet {

    public double width,length, unitPrice;
    public boolean isPersian;
    //                  5.5             7.5             10$


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice+= 200;
        }

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }
}
/*
Carpet Task:
  1.1. Create a custom class for the Carpet class that should contain the following;
        Attributes:
             width, lenght, unitPrice, isPersian (boolean)

             Add a constructor to set all the Instances

             Actions:
               calcCost(): should be able to calculate the total cost of the carpet and return
               toString(): should be able to display all the info of the carpet including

               total price of carpet = (width*length)*unitPrice

               if the carpet is persian carpet,add 200$ to the totalPrice

 */