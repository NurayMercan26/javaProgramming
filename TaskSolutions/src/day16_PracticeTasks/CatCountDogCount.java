package day16_PracticeTasks;

public class CatCountDogCount {

    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt";
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < sentence.length() - 2; i++) {
         String animalPart= sentence.substring(i,i+3);
         if(animalPart.equalsIgnoreCase("Cat")) {
            countCat++;
            }
          if (animalPart.equalsIgnoreCase("Dog")){
              countDog++;
          }
        }

       boolean same=countCat==countDog;
        System.out.println(same);
    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */