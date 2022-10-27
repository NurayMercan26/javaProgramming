package week13;

public class Credentials {
    public String email =  "oscar@cydeo.com";
    private  String username = "Scolfield";
    private String password = "Cydeo123";

    public String getUserName(String emailInput){
        if(emailInput.equalsIgnoreCase(email)){
            return this.username;
        }
        return "condition has Not been satisfied";
    }
    public String getPassword(String emailInput, String userNameInput){
        if(emailInput.equalsIgnoreCase(email) && userNameInput.equalsIgnoreCase(username)){
            return this.password;
        }
        return "condition has Not been satisfied";
    }



    public void setPassword(String password) {
        if(true)
            this.password=password;
        System.exit(-1);
    }
}
