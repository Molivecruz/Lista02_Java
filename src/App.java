import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2;

        Scanner tc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        n1 = tc.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = tc.nextInt();

        tc.close();

        if (n1 > n2) {
            System.out.print("O maior número é: " + n1);
        } else {
            System.out.print("O maior número é: " + n2);   
        }
    }
}
