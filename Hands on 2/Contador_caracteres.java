/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();

        int letras = 0;
        int numeros = 0;
        int espacos = 0;
        int outros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else {
                outros++;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros caracteres: " + outros);

        scanner.close();
    }
}