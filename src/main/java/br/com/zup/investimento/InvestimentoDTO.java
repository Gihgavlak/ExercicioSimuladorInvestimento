package br.com.zup.investimento;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.constraints.Email;

@SpringBootApplication
public class InvestimentoDTO {
    @Email (message = "e-mail inválido")
    private String email;
    private String nome;
    @CPF(message = "CPF inválido")
    private String cpf;
    private double valorInvestido;
    private int qtdMesesInvestidos;
    private Risco risco;

    public InvestimentoDTO() {

    }

    public InvestimentoDTO(String email, String nome, String cpf, double valorInvestido, int qtdMesesInvestidos, Risco risco) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.valorInvestido = valorInvestido;
        this.qtdMesesInvestidos = qtdMesesInvestidos;
        this.risco = risco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public int getQtdMesesInvestidos() {
        return qtdMesesInvestidos;
    }

    public void setQtdMesesInvestidos(int qtdMesesInvestidos) {
        this.qtdMesesInvestidos = qtdMesesInvestidos;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }
}
