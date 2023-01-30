package streams.desafio2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProdutosFilter {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Notebook", 3525.50, true);
        Produtos p2 = new Produtos("Cadeira", 825.60, true);
        Produtos p3 = new Produtos("Monitor", 1825.30, true);
        Produtos p4 = new Produtos("Mouse", 85.50, true);
        Produtos p5 = new Produtos("Teclado", 625.30, false);

        List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produtos> precoMaior = a -> a.preco >= 1000.0;

        Predicate<Produtos> freteGratis = a -> a.freteGratis;

        Function<Produtos, String> freteAcimadeMil = a -> "Este produto " + a.produto + " tem frete gratis";

        produtos.stream()
                .filter(freteGratis)
                .filter(precoMaior)
                .map(freteAcimadeMil)
                .forEach(System.out::println);

    }
}
