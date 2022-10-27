package day11_practıcetask;

import java.util.ArrayList;

public class Bed {
    String size;
    ArrayList<Pillow> piloows = new ArrayList<>();
    public Bed (String size, int numOfPillows){
        this.size = size;
        for (int i = 0; i< numOfPillows; i++){
            this.piloows.add(new Pillow());
        }
    }
}
class Pillow{
    String material;

    public static void main(String[] args) {
        Bed bed = new Bed("king",4);
        System.out.println(bed.piloows.size());
    }
}
