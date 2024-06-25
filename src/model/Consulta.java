package model;

public class Consulta {
    private int id_medico;
    private String cep;
    private int id_paciente;
    private String id_consulta;
    private String data_consulta;
    private String sala_consulta;
    private String horario_consulta;

    public Consulta(String id_consulta, String data_consulta, String sala_consulta, String horario_consulta, String cep, int id_medico, int id_paciente) {
        this.id_consulta = id_consulta;
        this.data_consulta = data_consulta;
        this.sala_consulta = sala_consulta;
        this.horario_consulta = horario_consulta;
        this.cep = cep;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
    }

    public String getId_consulta() {
        return id_consulta;
    }

    public String getData_consulta() {
        return data_consulta;
    }

    public String getSala_consulta() {
        return sala_consulta;
    }

    public String getHorario_consulta() {
        return horario_consulta;
    }

    public String getData_Consulta() {  
        return null;
    }

    public String getSala_Consulta() {
        return sala_consulta;
    }

    public String getHorario_Consulta() {
        return null;
    }

    public String toString() {
        return "Consulta\n" +
                "id_consulta ='\n" + id_consulta + '\'' +
                ", data_consulta ='\n" + data_consulta + '\'' +
                ", sala_consulta ='\n" + sala_consulta + '\'' +
                ", horario_consulta ='\n" + horario_consulta + '\'' +
                ", cep='\n" + cep + '\'' +
                ", id_medico=\n" + id_medico +
                ", id_paciente =\n" + id_paciente;
    }


}
