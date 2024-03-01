package packl.carro;


public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean som;

  
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isSom() {
        return som;
    }

  
    public void setSom(boolean som) {
        this.som = som;
    }
}
