import java.util.HashSet;

public class FiltrarNumeros {
    public static void main(String[] args) {
        // Array com os números fornecidos
        int[] numeros = {
            1, 10, 50, 60, 10,
            200, 300, 500, 700, 800,
            900, 14, 33, 60, 55,
            70, 80, 3, 100, 200,
            25, 50, 75, 100, 300,
            1000, 11, 22, 33, 60,
            70, 80, 100, 35, 10,
            150, 75, 85, 95, 200
        };

        // Criar um HashSet para armazenar os números únicos
        HashSet<Integer> numerosUnicos = new HashSet<>();

        // Adicionar os números no HashSet
        for (int numero : numeros) {
            numerosUnicos.add(numero);
        }

        // O tamanho do HashSet representa a quantidade de números únicos
        int quantidadeNumerosUnicos = numerosUnicos.size();

        // Exibir a quantidade de números únicos
        System.out.println("Quantidade de números a serem sorteados: " + quantidadeNumerosUnicos);
    }
}
