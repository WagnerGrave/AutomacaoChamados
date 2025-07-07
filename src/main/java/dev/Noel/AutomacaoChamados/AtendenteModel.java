package dev.Noel.AutomacaoChamados;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cadastro_atendentes")
public class AtendenteModel {

    @Id
    private int AtentendeteId;
    private String Nome;
    private String Cargo;


    public AtendenteModel() {

    }

    public AtendenteModel(String nome, String cargo, int atentendeteId) {
        this.Nome = nome;
        this.Cargo = cargo;
        this.AtentendeteId = atentendeteId;
    }

    public String getNome() {
        return Nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public int getAtentendeteId() {
        return AtentendeteId;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public void setAtentendeteId(int atentendeteId) {
        AtentendeteId = atentendeteId;
    }

}

