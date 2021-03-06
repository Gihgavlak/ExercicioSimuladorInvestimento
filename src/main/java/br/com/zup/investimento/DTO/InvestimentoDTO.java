package br.com.zup.investimento.DTO;

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
    private RiscoDTO risco;

    public InvestimentoDTO() {

    }

    public InvestimentoDTO(String email, String nome, String cpf, double valorInvestido, int qtdMesesInvestidos, RiscoDTO risco) {
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

    public RiscoDTO getRisco() {
        return risco;
    }

    public void setRisco(RiscoDTO risco) {
        this.risco = risco;
    }
}
