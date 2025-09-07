package Study.java008Switch;

public class java008Switch{

    public static void main(String[] args){

        // switch = compara uma lista de valores até que o valor seja igual a var definida no escopo

        String day = "Batata"; {

            switch (day) {
                case "Batata_frita": {
                    System.out.println("Batata_frita");
                    break;
                }
                case "Batata": {
                    System.out.println("Batata");
                    break;
                }
            }
        }
    }
}