package br.com.zup.investimento.DTO;

public enum RiscoDTO {
    ALTO(0.025), MEDIO(0.015), BAIXO(0.005);

    public double taxaDeRetorno;

    RiscoDTO() {
    }

    RiscoDTO(double valorRisco) {
        this.taxaDeRetorno = valorRisco;
    }

    public double getValorRisco() {
        return taxaDeRetorno;
    }

    public void setValorRisco(double valorRisco) {
        this.taxaDeRetorno = valorRisco;
    }
}

