
package model;

public class Paciente extends Pessoa {
    private String cep;
    private String rua;
    private String altura_paciente;
    private int id_endereco;
    private String numero;
    private String rg_paciente;
    private String complemento;
    private String plano_saude;
    private String contato_emergencia;
    private String estado_civil;
    private String tipo_sanguineo_paciente;
    private String peso_paciente;
    private int id_paciente;
    
    public Paciente(String nome, String cpf, String id, String telefone, String email, String sexo, String data_nasc, int id_endereco, String cep, String rua, String numero, String complemento) {
        super(nome, cpf, id, telefone, email, sexo, data_nasc);
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.data_nasc = data_nasc;
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

    public String getCep() {
        return cep;
    }
    public String getRua() {
        return rua;
    }
    public String getAltura_paciente() {
        return altura_paciente;
    }

    public void setAltura_paciente(String altura_paciente) {
        this.altura_paciente = altura_paciente;
    }

    public String getNumero() {
        return numero;
    }

    public String getRg_paciente() {
        return rg_paciente;
    }

    public void setRg_paciente(String rg_paciente) {
        this.rg_paciente = rg_paciente;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getPlano_saude() {
        return plano_saude;
    }

    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    public String getContato_emergencia() {
        return contato_emergencia;
    }

    public void setContato_emergencia(String contato_emergencia) {
        this.contato_emergencia = contato_emergencia;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTipo_sanguineo_paciente() {
        return tipo_sanguineo_paciente;
    }

    public void setTipo_sanguineo_paciente(String tipo_sanguineo_paciente) {
        this.tipo_sanguineo_paciente = tipo_sanguineo_paciente;
    }

    public String getPeso_paciente() {
        return peso_paciente;
    }

    public void setPeso_paciente(String peso_paciente) {
        this.peso_paciente = peso_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }
    
    public int getId_paciente(){
        return id_paciente;
    }

    public String toString() {
        return "Paciente{" +
                "id_paciente=" + id_paciente +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id='" + id + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                ", data_nasc='" + data_nasc + '\'' +
                ", id_endereco=" + id_endereco +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", rg_paciente='" + rg_paciente + '\'' +
                ", plano_saude='" + plano_saude + '\'' +
                ", contato_emergencia='" + contato_emergencia + '\'' +
                ", estado_civil='" + estado_civil + '\'' +
                ", tipo_sanguineo_paciente='" + tipo_sanguineo_paciente + '\'' +
                ", peso_paciente='" + peso_paciente + '\'' +
                '}';
    }
}
