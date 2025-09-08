package Study.java009LogicOperators;

import java.util.Scanner;

public class java009LogicOperators {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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

        // Aperte q ou Q e sair

        while(true) {
            System.out.println("Digite 'q' ou 'Q' para sair do jogo");

            String response = scanner.next();
            if(!response.equals("q") && !response.equals("Q")){

                System.out.println("Você continua a jogar 'pew, pew'");

            } else {

                System.out.println("Obrigado por jogar!");
                return;
            }
        }
    }
}