package br.com.zup.investimento;

public enum Risco {
    ALTO(0.025), MEDIO(0.015), BAIXO(0.005);

    public double valorRisco;

    Risco() {
    }

    Risco(double valorRisco) {
        this.valorRisco = valorRisco;
    }

    public double getValorRisco() {
        return valorRisco;
    }

    public void setValorRisco(double valorRisco) {
        this.valorRisco = valorRisco;
    }
}

