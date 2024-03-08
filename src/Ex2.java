import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int aux;

        int chosenNumber = new Random().nextInt(1000);

        while (num2 <= chosenNumber) {
            aux = num2;
            num2 += num1;
            num1 = aux;
        }
        if (chosenNumber == num1) {
            System.out.println("Número informado pertence a sequência de Fibonacci");
        } else {
            System.out.println("Número informado não pertence a sequência de Fibonacci");
        }
    }
}
