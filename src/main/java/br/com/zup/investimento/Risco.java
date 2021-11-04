package br.com.zup.investimento;

public enum Risco {
    ALTO(0.025), MEDIO(0.015), BAIXO(0.005);

    public double taxaDeRetorno;

    Risco() {
    }

    Risco(double valorRisco) {
        this.taxaDeRetorno = valorRisco;
    }

    public double getValorRisco() {
        return taxaDeRetorno;
    }

    public void setValorRisco(double valorRisco) {
        this.taxaDeRetorno = valorRisco;
    }
}

