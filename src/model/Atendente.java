package model;

public class Atendente extends Pessoa{
    private String admissao_atendente;
    private String hr_trab_atendente;
    private String cep;
    private String rua;
    private String altura_paciente;
    private int id_endereco;
    private String numero;
    private String complemento;

    public Atendente(String nome, String cpf, String id, String telefone, String email, String sexo, String data_nasc, String admissao_atendente, String hr_trab_atendente, int id_endereco, String cep, String rua, String numero, String complemento) {
        super(nome, cpf,  id, telefone, email, sexo, data_nasc);
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.data_nasc = data_nasc;
        this.admissao_atendente = admissao_atendente;
        this.hr_trab_atendente = hr_trab_atendente;
        this.id_endereco = id_endereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        setEndereco();
    }

    public Endereco setEndereco(){
        return new Endereco(this.id_endereco, this.cep, this.rua, this.numero, this.complemento);
    }

    public String getAdmissao_atendente() {
        return admissao_atendente;
    }

    public String getHr_trab_atendente() {
        return hr_trab_atendente;
    }

    public String toString() {
        return "Atendente\n" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id='" + id + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                ", data_nasc='" + data_nasc + '\'' +
                ", admissao_atendente='" + admissao_atendente + '\'' +
                ", hr_trab_atendente='" + hr_trab_atendente + '\'' +
                ", id_endereco=" + id_endereco +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'';
    }


}
