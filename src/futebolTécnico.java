import java.util.Date;

public class futebolTécnico {
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

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private Date DataNAsc;
    private String Clube;
    private int camisa;
    private double salario;
}
