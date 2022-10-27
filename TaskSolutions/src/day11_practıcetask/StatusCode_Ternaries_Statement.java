package day11_practıcetask;

public class StatusCode_Switch_Statement {

    public static void main(String[] args) {

        int code= 200;
        String result= (code>=200 &&code<=503)?
                (code==200)? "OK":(code==201)? "Created":(code==202)?"Accepted":(code==301)? "Moved Permanently":
        (code==303)?"See Other": (code==304)? "Not Modified":(code==307)? "Temporary Redirect":(code==400)?
                "Bad Request":(code==401)? "Unauthorized":(code==403)? "Forbidden": (code==404)? "Not Found":
                (code==410)?"Gone":"Internal Server Error":"Service Unavailable";


        System.out.println(result);


















    }







}
