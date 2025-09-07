package Study.java007Statement;

import java.util.Random;

public class java007Statement {

    public static void main(String[] args){

        Random random = new Random();
        // if statement = ele funciona bloqueando entradas de infos que você defin como false até que algo seja true para assim ele executar o que está dentro

        int age = random.nextInt(100)+1;
        System.out.println("Idade: "+age);

        if(age <= 59 && age >= 18){
            System.out.println("Você é um adulto");
        }else if(age >= 60){
            System.out.println("Você é um idoso");
        }else{
            System.out.println("Você é uma criança");
        }
    }
}