import java.util.Date;

public class futebolJogador {
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNAsc() {
        return DataNAsc;
    }

    public void setDataNAsc(Date dataNAsc) {
        DataNAsc = dataNAsc;
    }

    public String getClube() {
        return Clube;
    }

    public void setClube(String clube) {
        Clube = clube;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    private int ID;
        private String nome;
        private Date DataNAsc;
        private String Clube;
        private int camisa;
        private int tamanho;
    }

