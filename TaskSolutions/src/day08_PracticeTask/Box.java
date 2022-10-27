package day08_PracticeTask;

public class Box {
    double width;
    double lenght;
    public  String print(){
        return "width"+width+", Lenght"+lenght;
    }
    public void setInfo(double width,double lenght){
        this.width=width;
        this.lenght=lenght;
    }
}
class UseBoxes{

    public static void main(String[] args) {
        Box box = new Box();
        box.setInfo(5,11);
        System.out.println(box);
    }
}

