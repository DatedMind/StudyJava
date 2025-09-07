package Study.java009LogicOperators;

import java.util.Scanner;

public class java009LogicOperators {

    public static void main(String[] args){

        // logical operators == &&(AND), ||(OR), !(NOT)

        boolean x = true;
        boolean y = true;

        if(x == true && y == true){
            System.out.println("Yeahhh");
        }
        if(x == false || y == true){
            System.out.println("Yesssss");
        }
        if(!x == false){
            System.out.println("Nooooo");
        }

        

    }

}