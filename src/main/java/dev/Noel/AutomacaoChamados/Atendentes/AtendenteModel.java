package dev.Noel.AutomacaoChamados.Atendentes;

import dev.Noel.AutomacaoChamados.Cargos.CargosModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_cadastro_atendentes")
public class AtendenteModel {

    @Id
    private UUID AtentendeteId;
    private String Nome;
    private String Cargo;
    private List<CargosModel> cargos;


    public AtendenteModel() {

    }

    public AtendenteModel(String nome, String cargo, UUID atentendeteId) {
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

    public UUID getAtentendeteId() {
        return AtentendeteId;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public void setAtentendeteId(UUID atentendeteId) {
        AtentendeteId = atentendeteId;
    }

}

