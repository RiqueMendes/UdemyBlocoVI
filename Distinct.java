package streams;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    
    public static void main(String[] args) {
        


        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.5);
        Aluno a3 = new Aluno("Gui", 6.1);
        Aluno a4 = new Aluno("Gabi", 8.1);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Luna", 7.5);
        Aluno a7 = new Aluno("Gui", 6.1);
        Aluno a8 = new Aluno("Gabi", 8.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);


        alunos.stream().distinct().forEach(System.out::println);

       
    }
}
