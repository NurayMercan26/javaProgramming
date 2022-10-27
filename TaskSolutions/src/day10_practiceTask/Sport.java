package day10_practiceTask;

public class Sport {
    String name;
    int numOfPlayers;
    boolean teamBased;
    public void makeSport(String name, int players,boolean teams){
        name=name;
        numOfPlayers = players;
        teamBased = teams;
    }
    public String toString(){
        String msg = "The sport is"+name+" and has "+numOfPlayers+" Players total ";

        if (teamBased){
            msg+= "divided into teams";
        }
        return msg;
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer",22,true);
        System.out.println(soccer);
    }
}
