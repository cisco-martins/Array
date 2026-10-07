import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Pessoa> banco = new ArrayList<>();

        banco.add(new Pessoa(1, "Francisco", 16));
        banco.add(new Pessoa(2, "Artur Johnson", 17));
        banco.add(new Pessoa(3, "Pedro Enrik", 18));
        banco.add(new Pessoa(4, "Bryan Gomes", 19));
        banco.add(new Pessoa(5, "João Pedro", 20));
        banco.add(new Pessoa(6, "Jonata", 21));
        banco.add(new Pessoa(7, "Berbadito", 22));

        List<Pessoa> cache = new ArrayList<>();

        IO.print("Digite o ID da pessoa: ");
        int idBuscado = scanner.nextInt();

        Pessoa pessoaEncontrada = null;

        for (Pessoa pessoa : cache) {
            if (pessoa.id == idBuscado) {
                pessoaEncontrada = pessoa;
                break;
            }
        }

        if (pessoaEncontrada != null) {
            IO.print("Pessoa encontrada no cache: " + pessoaEncontrada);
        } else {

            for (Pessoa pessoa : banco) {
                if (pessoa.id == idBuscado) {
                    pessoaEncontrada = pessoa;
                    break;
                }
            }

            if (pessoaEncontrada != null) {

                if (cache.size() >= 10) {
                    cache.remove(0);
                }

                cache.add(pessoaEncontrada);

                IO.print(
                        "Pessoa buscada no banco e adicionada ao cache: "
                                + pessoaEncontrada
                );

            } else {
                IO.print("Pessoa não encontrada.");
            }
        }

        scanner.close();
    }
}