package src;

import model.*;

import java.util.Scanner;

public class Src {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        cadastrarAtendente();
        cadastrarMedico();
        cadastrarPaciente();
        cadastrarConsulta();
        scanner.close();
    }

    private static String[] cadastrarPessoa() {
        String[] dados = new String[6];
        System.out.print("Nome: ");
        dados[0] = scanner.nextLine();
        System.out.print("CPF: ");
        dados[1] = scanner.nextLine();
        System.out.print("Telefone: ");
        dados[2] = scanner.nextLine();
        System.out.print("Email: ");
        dados[3] = scanner.nextLine();
        System.out.print("Sexo: ");
        dados[4] = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        dados[5] = scanner.nextLine();
        return dados;
    }

    private static void cadastrarAtendente() {
        try {
            System.out.println("Cadastro de Atendente:");
            String[] dados = cadastrarPessoa();
            String nome = dados[0];
            String cpf = dados[1];
            String telefone = dados[2];
            String email = dados[3];
            String sexo = dados[4];
            String dataNasc = dados[5];

            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Data de Admissão: ");
            String admissao = scanner.nextLine();
            System.out.print("Horário de Trabalho: ");
            String hrTrab = scanner.nextLine();
            System.out.print("ID Endereço: ");
            int idEndereco = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("CEP: ");
            String cep = scanner.nextLine();
            System.out.print("Rua: ");
            String rua = scanner.nextLine();
            System.out.print("Número: ");
            String numero = scanner.nextLine();
            System.out.print("Complemento: ");
            String complemento = scanner.nextLine();

            Atendente atendente = new Atendente(nome, cpf, id, telefone, email, sexo, dataNasc, admissao, hrTrab, idEndereco, cep, rua, numero, complemento);
            System.out.println("Atendente cadastrado:");
            System.out.println(atendente);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar atendente: " + e.getMessage());
        }
    }

    private static void cadastrarMedico() {
        try {
            System.out.println("\nCadastro de Médico:");
            String[] dados = cadastrarPessoa();
            String nome = dados[0];
            String cpf = dados[1];
            String telefone = dados[2];
            String email = dados[3];
            String sexo = dados[4];
            String dataNasc = dados[5];

            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("CRM: ");
            String crm = scanner.nextLine();
            System.out.print("Data de Admissão: ");
            String admissao = scanner.nextLine();
            System.out.print("Horário de Trabalho: ");
            String hrTrab = scanner.nextLine();
            System.out.print("ID Médico: ");
            int idMedico = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("ID Endereço: ");
            int idEndereco = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("CEP: ");
            String cep = scanner.nextLine();
            System.out.print("Rua: ");
            String rua = scanner.nextLine();
            System.out.print("Número: ");
            String numero = scanner.nextLine();
            System.out.print("Complemento: ");
            String complemento = scanner.nextLine();

            Medico medico = new Medico(nome, cpf, id, telefone, email, sexo, dataNasc, crm, admissao, hrTrab, idMedico, idEndereco, cep, rua, numero, complemento);
            System.out.println("Médico cadastrado:");
            System.out.println(medico);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar médico: " + e.getMessage());
        }
    }

    private static void cadastrarPaciente() {
        try {
            System.out.println("\nCadastro de Paciente:");
            String[] dados = cadastrarPessoa();
            String nome = dados[0];
            String cpf = dados[1];
            String telefone = dados[2];
            String email = dados[3];
            String sexo = dados[4];
            String dataNasc = dados[5];

            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("RG: ");
            String rg = scanner.nextLine();
            System.out.print("Plano de Saúde: ");
            String planoSaude = scanner.nextLine();
            System.out.print("Contato de Emergência: ");
            String contatoEmergencia = scanner.nextLine();
            System.out.print("Estado Civil: ");
            String estadoCivil = scanner.nextLine();
            System.out.print("Tipo Sanguíneo: ");
            String tipoSanguineo = scanner.nextLine();
            System.out.print("Peso: ");
            String peso = scanner.nextLine();
            System.out.print("ID Endereço: ");
            int idEndereco = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("CEP: ");
            String cep = scanner.nextLine();
            System.out.print("Rua: ");
            String rua = scanner.nextLine();
            System.out.print("Número: ");
            String numero = scanner.nextLine();
            System.out.print("Complemento: ");
            String complemento = scanner.nextLine();

            Paciente paciente = new Paciente(nome, cpf, id, telefone, email, sexo, dataNasc, idEndereco, cep, rua, numero, complemento);
            paciente.setRg_paciente(rg);
            paciente.setPlano_saude(planoSaude);
            paciente.setContato_emergencia(contatoEmergencia);
            paciente.setEstado_civil(estadoCivil);
            paciente.setTipo_sanguineo_paciente(tipoSanguineo);
            paciente.setPeso_paciente(peso);
            System.out.println("Paciente cadastrado:");
            System.out.println(paciente);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar paciente: " + e.getMessage());
        }
    }

    private static void cadastrarConsulta() {
        try {
            System.out.println("\nCadastro de Consulta:");
            System.out.print("ID da Consulta: ");
            String idConsulta = scanner.nextLine();
            System.out.print("Data da Consulta: ");
            String dataConsulta = scanner.nextLine();
            System.out.print("Sala da Consulta: ");
            String salaConsulta = scanner.nextLine();
            System.out.print("Horário da Consulta: ");
            String horarioConsulta = scanner.nextLine();
            System.out.print("CEP: ");
            String cepConsulta = scanner.nextLine();
            System.out.print("ID Médico: ");
            int idMedico = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("ID Paciente: ");
            int idPaciente = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Consulta consulta = new Consulta(idConsulta, dataConsulta, salaConsulta, horarioConsulta, cepConsulta, idMedico, idPaciente);
            System.out.println("Consulta cadastrada:");
            System.out.println(consulta);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar consulta: " + e.getMessage());
        }
    }
}
