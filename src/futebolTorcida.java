import java.util.Date;

public class futebolTorcida {
    String nomeTorcedor;
    private Date DataNasc;

    public String getNomeTorcedor() {
        return nomeTorcedor;
    }

    public void setNomeTorcedor(String nomeTorcedor) {
        this.nomeTorcedor = nomeTorcedor;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        DataNasc = dataNasc;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Boolean getAssociado() {
        return associado;
    }

    public void setAssociado(Boolean associado) {
        this.associado = associado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int cpf;
    Boolean associado;
    private int ID;
}
