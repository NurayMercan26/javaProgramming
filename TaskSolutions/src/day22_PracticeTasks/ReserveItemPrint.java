package day22_PracticeTasks;
public class ReserveItemPrint {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (int i = 0; i < items.length; i++) {
            for (int v = 0; v < items[i].length; v++) {
                System.out.print(items[i][v]+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        for (int i = 0; i < items.length; i++) {
            for (int k = items[i].length-1; k>=0; k--) {
                System.out.print(items[i][k]+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        for (int  i = items.length-1;i>=0;i--) {
            for (int b = 0; b < items[i].length; b++) {
                System.out.print(items[i][b]+"\t");
            }
            System.out.println();
        }

    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */