import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Fulano", 15, "M");
        Pessoa p2 = new Pessoa("Cicrano", 20, "M");
        Pessoa p3 = new Pessoa("Fulana", 25, "F");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        //Exibe as pessoas maiores de idade
        pessoas.stream().filter(p -> p.getIdade() > 18).forEach(p -> System.out.println(p));

        //Existe idoso na lista?
        boolean existeIdoso = pessoas.stream().anyMatch(p -> p.getIdade() > 60);
        System.out.println(existeIdoso);

        //Qual(is) o(s) sexo(s) dos adolecentes dessa lista?
        List<String> sexos = pessoas.stream()
                .filter(p -> p.getIdade() < 18 && p.getIdade() > 13)
                .map(p -> p.getSexo())
                .collect(Collectors.toList());

        System.out.println(sexos);

        //Imprime os nomes das pessoas que começam com a letra F
        List<String> names = pessoas.stream()
                .filter(p -> p.getNome().startsWith("F"))
                .map(p -> p.getNome())
                .collect(Collectors.toList());

        System.out.println(names);

    }
}