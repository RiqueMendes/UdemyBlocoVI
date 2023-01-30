package streams.desafio;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarroFilter {
    
    public static void main(String[] args) {
        

        Carro c1 = new Carro("Ferrari ", 2.5, true);
        Carro c2 = new Carro("BMW ", 2.0, true);
        Carro c3 = new Carro("Fiat ", 1.4, false);
        Carro c4 = new Carro("VW ", 1.8, false);
        Carro c5 = new Carro("Porsche ", 2.0, true);
        Carro c6 = new Carro("Hyundai ", 2.0, true);

        List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6);

        Predicate<Carro> potente = a -> a.motor >= 2.0;
        Predicate<Carro> turbo = a -> a.turbo;
        Function<Carro, String> carroDesempenho = a -> "Este carro " + a.modelo + "tem bom desempenho";

        carros.stream()
        .filter(potente)
        .filter(turbo)
        .map(carroDesempenho)
        .forEach(System.out::println);

    }
}
