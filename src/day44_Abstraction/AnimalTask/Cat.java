package day44_Abstraction.AnimalTask;

public final class Cat extends Animal implements Playable{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void Meow(){
        System.out.println(getName()+" is Meowing");
    }

    @Override
    public void play() {

    }
}
