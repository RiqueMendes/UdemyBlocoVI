package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Gui", 7.5);
        Aluno a3 = new Aluno("Pedro", 7.4);
        Aluno a4 = new Aluno("Maria", 5.8);
        Aluno a5 = new Aluno("Lia", 10);
        Aluno a6 = new Aluno("Bia", 6.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        alunos.stream().filter(a -> a.nota >= 7).map(a -> "Parabéns, " + a.nome + " aprovado!!")
                .forEach(System.out::println);


                
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> parabensAprovados = a -> "Parabéns, " + a.nome + " aprovado!!";
        alunos.stream().filter(aprovado).map(parabensAprovados)
                .forEach(System.out::println);
        ; // Mapeamento usando aprovados do predicado

    }

}
