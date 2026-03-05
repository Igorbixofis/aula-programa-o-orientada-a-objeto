import java.util.Date;

public class futebolClube {
    private int ID;
    private String Nome;
    private Date DataFundacao;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Date getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        DataFundacao = dataFundacao;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String presidente) {
        Presidente = presidente;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    private String Presidente;
    private String estadio;
}

