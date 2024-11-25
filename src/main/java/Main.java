import consultorio.Paciente;
import consultorio.Medico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Paciente> pacientes = new ArrayList<>();
    ArrayList<Medico> medicos = new ArrayList<>();

    // Cadastro de Pacientes
    for (int i = 0; i < 3; i++) {
      System.out.println("Digite o nome do paciente:");
      String nome = scanner.nextLine();
      System.out.println("Digite a idade:");
      int idade = scanner.nextInt();
      scanner.nextLine(); // Consumir nova linha
      System.out.println("Digite o histórico médico:");
      String historicoMedico = scanner.nextLine();

      pacientes.add(new Paciente(nome, idade, historicoMedico));
    }

    // Cadastro de Médicos
    for (int i = 0; i < 3; i++) {
      System.out.println("Digite o nome do médico:");
      String nome = scanner.nextLine();
      System.out.println("Digite a idade:");
      int idade = scanner.nextInt();
      scanner.nextLine(); // Consumir nova linha
      System.out.println("Digite a especialidade:");
      String especialidade = scanner.nextLine();
      System.out.println("Digite o CRM:");
      String crm = scanner.nextLine();

      medicos.add(new Medico(nome, idade, especialidade, crm));
    }

    // Exibindo Informações dos Pacientes
    for (Paciente paciente : pacientes) {
      paciente.exibirInformacoes();
      System.out.println();
    }

    // Exibindo Informações dos Médicos
    for (Medico medico : medicos) {
      medico.exibirInformacoes();
      System.out.println();
    }

    scanner.close();
  }
}