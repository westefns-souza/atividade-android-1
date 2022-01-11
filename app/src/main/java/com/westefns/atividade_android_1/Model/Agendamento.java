package com.westefns.atividade_android_1.Model;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Agendamento implements Serializable {
    private String Especialidade;
    private String Profissional;
    private String Data;
    private String Horario;
    private String Status;

    public Agendamento(String Especialidade, String Profissional, String Data, String Horario) {
        this.Especialidade = Especialidade;
        this.Profissional = Profissional;
        this.Data = Data;
        this.Horario = Horario;
        this.Status = "Novo";
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

    public String getProfissional() {
        return Profissional;
    }

    public void setProfissional(String profissional) {
        Profissional = profissional;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Especialidade: " + Especialidade +
                ", Profissional: " + Profissional +
                ", Data: " + Data +
                ", às " + Horario;
    }
}
