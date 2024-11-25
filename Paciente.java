package consultorio;

public class Paciente extends Pessoa {
    private String historicoMedico;

    public Paciente(String nome, int idade, String historicoMedico) {
        super(nome, idade);
        this.historicoMedico = historicoMedico;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Paciente: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Histórico Médico: " + historicoMedico);
    }
}