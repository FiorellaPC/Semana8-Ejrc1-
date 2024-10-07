import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double suma = 0;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Ingrese nota: ");
            int nota = scan.nextInt();
            suma = suma + nota;
        }
        double promedio = suma / 5;
        System.out.println("Promedio: " + promedio);
    }
}