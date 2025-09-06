package Study.java001Out_In;

import java.util.Scanner;

public class java001Out_In {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");

        System.out.print("Escreva o que quiser! ");
        String str = scanner.nextLine();
        System.out.println("Isso foi o que você escreveu: "+str);

    }
}