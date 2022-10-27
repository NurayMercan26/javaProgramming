package day36_Inheritance.animalTask;

public class Dog extends Animal {//Dog is animal
    //     child         parent


    public void bark(){
        System.out.println(name+" is barking");
    }
}
/*
dog:
  6 variables
  6 methods
 */
/*
animal:
  name, breed, gender,size,age, color
  setInfo(), eat(), drink(); move(), sleep(), toString()

     Dog extends animal:
     bark()
     Cat extends animal:
     scracht()
     Dog extends animal:
     roar()
     Dog extends animal:
     swim()
 */