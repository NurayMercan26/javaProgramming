package day22_PracticeTasks;
public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] batch25Groups = {batch25Group1, batch25Group2, batch25Group3};

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = {batch24Group1, batch24Group2, batch24Group3};

        String[][][] cydeoStudents = {batch24Groups, batch25Groups};

        for (String[][] EachBatch : cydeoStudents) {
            for (String[] EachGroups : EachBatch) {
                for (String EachStudent : EachGroups) {
                    System.out.print(EachStudent+"\t");
                    
                }
                System.out.println();
            }

        }





    }
}
