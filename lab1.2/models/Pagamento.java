package models;

public class Pagamento {
    
    private double valor;
    private String cpf;

    public Pagamento(double valor, String cpf) {
        this.valor = valor;
        this.cpf = cpf;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
