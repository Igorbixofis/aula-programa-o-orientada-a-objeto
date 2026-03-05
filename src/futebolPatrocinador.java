import java.util.Date;

public class futebolPatrocinador {
    private String nome;

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

    public int getValorDoação() {
        return valorDoação;
    }

    public void setValorDoação(int valorDoação) {
        this.valorDoação = valorDoação;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    private Date DataNAsc;
    private String Clube;
    private int valorDoação;
    private String Empresa;
}
