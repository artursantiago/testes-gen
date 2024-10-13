package com.example;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Banco {

    private Long id;

    private String nome;
    
    private List<Conta> contas;

    // Adiciona uma nova conta ao banco
    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    // Método de transferência de valores entre contas
    public void transferencia(Conta origem, Conta destino, Double valor) throws IllegalArgumentException {
        if (origem.getSaldo() >= valor) {
            origem.setSaldo(origem.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para transferência.");
        }
    }

    // Método para consultar saldo total do banco
    public Double calcularSaldoTotal() {
        return contas.stream().mapToDouble(Conta::getSaldo).sum();
    }

    // Método que retorna a quantidade de contas do banco
    public int contarContas() {
        return this.contas.size();
    }

    // Remove uma conta, se ela existir no banco
    public void removeConta(Conta conta) throws IllegalArgumentException {
        if (!this.contas.contains(conta)) {
            throw new IllegalArgumentException("Conta não encontrada no banco.");
        }
        this.contas.remove(conta);
    }
}