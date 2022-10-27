package day20_PracticeTasks;

public class ReverseClassmates {

    public static void main(String[] args) {
     String[]ClassMates={"ifelse","switchcase","loop","while","array","break","continue","exit"};
        for (int i = 0; i < ClassMates.length; i++) {
            String name = ClassMates[i];
            String reserveName= "";
            for (int j = name.length()-1; j >=0; j--) {
                reserveName+=name.charAt(j);
            }
            System.out.println(reserveName);
        }
    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c

 */