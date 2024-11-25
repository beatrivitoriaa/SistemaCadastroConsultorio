package consultorio;

public class Medico extends Pessoa {
    private String especialidade;
    private String crm;

    public Medico(String nome, int idade, String especialidade, String crm) {
        super(nome, idade);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Médico: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
    }
}