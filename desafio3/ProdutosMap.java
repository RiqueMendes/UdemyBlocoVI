package streams.desafio3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProdutosMap {
 public static void main(String[] args) {
    

    Produtos p1 = new Produtos("Lapis", 1.5, 0.12, 30);
    Produtos p2 = new Produtos("Caderno", 15.20, 0.3, 0);
    Produtos p3 = new Produtos("Kit lapis de cor", 65.0, 0.15, 30);
    Produtos p4 = new Produtos("Caderneta", 3.5, 0.11, 30);
    Produtos p5 = new Produtos("Mochila", 155.90, 0.27, 0);
    Produtos p6 = new Produtos("Canetao", 4.5, 0.15, 30);



    List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

    Predicate<Produtos> superPromocao = p -> p.desconto >= 0.20;
    Predicate<Produtos> fretGratis = p -> p.valorFrete == 0;
    Predicate<Produtos> produtoRelevante = p -> p.preco >= 50;

    Function<Produtos, String> chamadaPromocional = p -> "Aproveite " + p.produto + " por R$" + p.preco;

    produtos.stream().filter(superPromocao).filter(fretGratis).filter(produtoRelevante).map(chamadaPromocional)
    .forEach(System.out::println);

 }
    
}
