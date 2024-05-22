import java.util.HashMap;
import java.util.Scanner;

public class CadastroTelefone {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
HashMap<String, String> cadastro = new HashMap<>();

// Leitura de até 5 CPFs e telefones
for (int i = 0; i < 5; i++) {
System.out.println("Digite o CPF (somente números): ");
String cpf = scanner.nextLine();
System.out.println("Digite o telefone: ");
String telefone = scanner.nextLine();
cadastro.put(cpf, telefone);
}

// Impressão dos dados cadastrados
System.out.println("Dados cadastrados:");
for (String cpf : cadastro.keySet()) {
System.out.println("CPF: " + cpf + " - Telefone: " + cadastro.get(cpf));
}

// Pesquisa de telefones por CPF
System.out.println("Digite o CPF para buscar o telefone (ou 'sair' para encerrar): ");
while (true) {
String cpf = scanner.nextLine();
if (cpf.equalsIgnoreCase("sair")) {
break;
}
String telefone = cadastro.get(cpf);
if (telefone != null) {
System.out.println("Telefone para o CPF " + cpf + ": " + telefone);
} else {
System.out.println("CPF não encontrado.");
}
System.out.println("Digite outro CPF para buscar o telefone (ou 'sair' para encerrar): ");
}
}
}

