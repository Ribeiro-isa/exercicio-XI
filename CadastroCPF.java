import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroCPF {
    public static void main(String[] args) {
        HashMap<String, String> cadastro = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o CPF da pessoa " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            
            System.out.print("Digite o telefone da pessoa " + (i + 1) + ": ");
            String telefone = scanner.nextLine();
            
            cadastro.put(cpf, telefone);
        }
        
        scanner.close();

        System.out.println("\nDados cadastrados:");
        for (Map.Entry<String, String> entry : cadastro.entrySet()) {
            System.out.println("CPF: " + entry.getKey() + " - Telefone: " + entry.getValue());
        }
    }
}
