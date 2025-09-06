package Study.java006Random;

import java.util.Random;

public class java006Random {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6)+1;
        System.out.println(x);

        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}