package Avengers28_07_2022;

import java.util.Arrays;

public class Replit_method_lamed {


    public static String lameDb(String db, String op, String id, String data){
        String resultDb="oscar";
        String[]arr = db.split("#");
        System.out.println(Arrays.toString(arr));
        // some solution
       // for(String each: arr){}

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(1);
        }
        System.out.println(Arrays.toString(arr));

        switch (op){
            case "add":
                break;
            case "edit":
                break;
            case "delete":
                break;
        }

        return resultDb;
    }

    public String lameDb(String db, String op, int id, String data){  // this is an instance method even though it is in the same class, it needs an object created to be called
        String resultDb="oscar";





        // some solution
        return resultDb;
    }

    public static void main(String[] args) {
        System.out.println(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa"));
        //   System.out.println(Replit_Method_LameDB.lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa")); Since this a static method we can call with class name as well



    }


}
/*
//A database (DB) is an organized collection of data. In other words, a database is used by an organization as a method of storing, managing and retrieving information.
//
//        Implement the **lameDb()** method
//
//        - This method has 4 String parameters and returns a String
//        - `db`: information in database. Each item is separated by a **#**. Each element will also have a number in the beginning about which element it is.
//        - `op`: action that will be taken on database (add, edit, or remove)
//        - `id`: The id number that will be manipulated
//        - `data`: extra data that will be used alongside operation
//
//        - The method returns the modifed database
//
//        Examples:
//
//        ```
//        m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
//
//        returns:  1etsy#2wooden#3spoon#4aaa
//        ```
//
//        ```
//        m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")
//
//        returns:  1bbb#2etsy#3wooden#4spoon
//        ```
//
//        ```
//        m.lameDb("1test#2bla#3foo","edit","2","bbb")
//
//        returns:  1test#2bbb#3foo
//        ```
//
//        ```
//        m.lameDb("1tst#2bla#3foo","delete","1","")
//
//        returns:  #2bla#3foo
//        ```
//
//        Hint: use arrays
AccessModifiers specifier returnType MethodName(Parameters){
statement
 */