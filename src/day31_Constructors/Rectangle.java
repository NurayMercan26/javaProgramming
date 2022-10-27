package day31_Constructors;

public class Rectangle {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" +calcArea()+
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
Create a custom class named Rectangle
    Attributes:
    lenght,width

    Add a constructor that can set all the fields

    Actions:
       calculatearea(): calculates the area of rectangle, returns it as double
       calculatePerimeter()calculates the perimeter of rectangle returns it as double
       toString(): displays the width,leghth area and perimeter of rectangle when an object
 */