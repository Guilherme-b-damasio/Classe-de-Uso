package src;

import model.*;

import java.util.Scanner;

public class Src {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de criação de um Atendente
        System.out.println("Cadastro de Atendente:");
        System.out.print("Nome: ");
        String nomeAtendente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfAtendente = scanner.nextLine();
        System.out.print("ID: ");
        String idAtendente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneAtendente = scanner.nextLine();
        System.out.print("Email: ");
        String emailAtendente = scanner.nextLine();
        System.out.print("Sexo: ");
        String sexoAtendente = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascAtendente = scanner.nextLine();
        System.out.print("Data de Admissão: ");
        String admissaoAtendente = scanner.nextLine();
        System.out.print("Horário de Trabalho: ");
        String hrTrabAtendente = scanner.nextLine();
        System.out.print("ID Endereço: ");
        int idEnderecoAtendente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro
        System.out.print("CEP: ");
        String cepAtendente = scanner.nextLine();
        System.out.print("Rua: ");
        String ruaAtendente = scanner.nextLine();
        System.out.print("Número: ");
        String numeroAtendente = scanner.nextLine();
        System.out.print("Complemento: ");
        String complementoAtendente = scanner.nextLine();

        Atendente atendente = new Atendente(nomeAtendente, cpfAtendente, idAtendente, telefoneAtendente, emailAtendente,
                sexoAtendente, dataNascAtendente, admissaoAtendente, hrTrabAtendente, idEnderecoAtendente,
                cepAtendente, ruaAtendente, numeroAtendente, complementoAtendente);

        System.out.println("Atendente cadastrado:");
        System.out.println(atendente);

        // Exemplo de criação de um Médico
        System.out.println("\nCadastro de Médico:");
        System.out.print("Nome: ");
        String nomeMedico = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfMedico = scanner.nextLine();
        System.out.print("ID: ");
        String idMedico = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneMedico = scanner.nextLine();
        System.out.print("Email: ");
        String emailMedico = scanner.nextLine();
        System.out.print("Sexo: ");
        String sexoMedico = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascMedico = scanner.nextLine();
        System.out.print("CRM: ");
        String crmMedico = scanner.nextLine();
        System.out.print("Data de Admissão: ");
        String admissaoMedico = scanner.nextLine();
        System.out.print("Horário de Trabalho: ");
        String hrTrabMedico = scanner.nextLine();
        System.out.print("ID Médico: ");
        int idMedicoInt = scanner.nextInt();
        System.out.print("ID Endereço: ");
        int idEnderecoMedico = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro
        System.out.print("CEP: ");
        String cepMedico = scanner.nextLine();
        System.out.print("Rua: ");
        String ruaMedico = scanner.nextLine();
        System.out.print("Número: ");
        String numeroMedico = scanner.nextLine();
        System.out.print("Complemento: ");
        String complementoMedico = scanner.nextLine();

        Medico medico = new Medico(nomeMedico, cpfMedico, idMedico, telefoneMedico, emailMedico, sexoMedico,
                dataNascMedico, crmMedico, admissaoMedico, hrTrabMedico, idMedicoInt, idEnderecoMedico,
                cepMedico, ruaMedico, numeroMedico, complementoMedico);

        System.out.println("Médico cadastrado:");
        System.out.println(medico);

        // Exemplo de criação de um Paciente
        System.out.println("\nCadastro de Paciente:");
        System.out.print("Nome: ");
        String nomePaciente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfPaciente = scanner.nextLine();
        System.out.print("ID: ");
        String idPaciente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefonePaciente = scanner.nextLine();
        System.out.print("Email: ");
        String emailPaciente = scanner.nextLine();
        System.out.print("Sexo: ");
        String sexoPaciente = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascPaciente = scanner.nextLine();
        System.out.print("ID Endereço: ");
        int idEnderecoPaciente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro
        System.out.print("CEP: ");
        String cepPaciente = scanner.nextLine();
        System.out.print("Rua: ");
        String ruaPaciente = scanner.nextLine();
        System.out.print("Número: ");
        String numeroPaciente = scanner.nextLine();
        System.out.print("Complemento: ");
        String complementoPaciente = scanner.nextLine();
        System.out.print("RG: ");
        String rgPaciente = scanner.nextLine();
        System.out.print("Plano de Saúde: ");
        String planoSaudePaciente = scanner.nextLine();
        System.out.print("Contato de Emergência: ");
        String contatoEmergenciaPaciente = scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivilPaciente = scanner.nextLine();
        System.out.print("Tipo Sanguíneo: ");
        String tipoSanguineoPaciente = scanner.nextLine();
        System.out.print("Peso: ");
        String pesoPaciente = scanner.nextLine();

        Paciente paciente = new Paciente(nomePaciente, cpfPaciente, idPaciente, telefonePaciente, emailPaciente,
                sexoPaciente, dataNascPaciente, idEnderecoPaciente, cepPaciente, ruaPaciente, numeroPaciente,
                complementoPaciente);
        paciente.setRg_paciente(rgPaciente);
        paciente.setPlano_saude(planoSaudePaciente);
        paciente.setContato_emergencia(contatoEmergenciaPaciente);
        paciente.setEstado_civil(estadoCivilPaciente);
        paciente.setTipo_sanguineo_paciente(tipoSanguineoPaciente);
        paciente.setPeso_paciente(pesoPaciente);

        System.out.println("Paciente cadastrado:");
        System.out.println(paciente);

        // Exemplo de criação de uma Consulta
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
        int idMedicoConsulta = scanner.nextInt();
        System.out.print("ID Paciente: ");
        int idPacienteConsulta = scanner.nextInt();

        Consulta consulta = new Consulta(idConsulta, dataConsulta, salaConsulta, horarioConsulta, cepConsulta,
                idMedicoConsulta, idPacienteConsulta);

        System.out.println("Consulta cadastrada:");
        System.out.println(consulta);

        scanner.close();
    }

}
