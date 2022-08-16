import java.util.List;

public class Numeros {

    public List<NumeroPrimo> numeros;

    public List<NumeroPrimo> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<NumeroPrimo> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numeros=" + numeros +
                '}';
    }
}
