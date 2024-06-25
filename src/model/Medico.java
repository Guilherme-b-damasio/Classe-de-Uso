package model;

public class Medico extends Pessoa {
    private String crm_medico;
    private String admissao_medico;
    private String hr_trab_medico;
    private int id_medico;
    private String cep;
    private String rua;
    private String altura_paciente;
    private int id_endereco;
    private String numero;
    private String complemento;

    public Medico(String nome, String cpf, String id, String telefone, String email, String sexo, String data_nasc, String crm_medico, String admissao_medico, String hr_trab_medico, int id_medico, int id_endereco, String cep, String rua, String numero, String complemento ) {
        super(nome, cpf,  id, telefone, email, sexo, data_nasc);
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.crm_medico = crm_medico;
        this.admissao_medico = admissao_medico;
        this.hr_trab_medico = hr_trab_medico;
        this.id_medico = id_medico;
        this.id_endereco = id_endereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.endereco = setEndereco();
    }

    public Endereco setEndereco(){
        return new Endereco(this.id_endereco, this.cep, this.rua, this.numero, this.complemento);
    }

    public int getId_medico() {return id_medico;}

    public String getCrm_medico() {
        return crm_medico;
    }

    public String getAdmissao_medico() {
        return admissao_medico;
    }

    public String getHr_trab_medico() {
        return hr_trab_medico;
    }

    @Override
    public String toString() {
        return "Medico\n" +
                "id_medico=" + id_medico +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id='" + id + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                ", data_nasc='" + data_nasc + '\'' +
                ", crm_medico='" + crm_medico + '\'' +
                ", admissao_medico='" + admissao_medico + '\'' +
                ", hr_trab_medico='" + hr_trab_medico + '\'' +
                ", id_endereco=" + id_endereco +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'';
    }



}
