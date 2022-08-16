import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static boolean esPrimo(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Numeros numeros = new Numeros();

        List<NumeroPrimo> ListNumeroPrimo = new ArrayList<>();

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un rango de impresion de numeros primos: ");
        int cantidad = lectura.nextInt();

        int numero = 2;

        for (int x=2; x < cantidad; x++ ) {
            if(esPrimo(numero)) {
                //System.out.println("es un numero primo" + numero);
                NumeroPrimo numeroPrimo = new NumeroPrimo();
                numeroPrimo.setNumero(numero);
                ListNumeroPrimo.add(numeroPrimo);
                numeros.setNumeros(ListNumeroPrimo);
            } else {
                //System.out.println("no es un numero primo" + numero);
            }
            numero ++;
        }

        System.out.println(numeros.toString());

    }
}
