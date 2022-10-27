package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = getClass().getSimpleName();
    }

    public String getName (){return name;}

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
