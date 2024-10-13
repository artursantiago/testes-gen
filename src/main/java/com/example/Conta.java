package com.example;

import java.util.Arrays;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Conta {

    private Long id;

    private String beneficiario;

    private Banco banco;

    private Double saldo;

    private int numeroConta;

    private char digitoVerificador;

    // Método para calcular o dígito verificador de uma conta
    public char calculaDigitoVerificador(int numeroConta) {
        Integer[] digitosConta = new Integer[8];
        Arrays.fill(digitosConta, 0);
        int[] multiplicadores = {2, 3, 4, 5, 6, 7, 8, 9};
        String numeroContaAsString = new StringBuilder(String.valueOf(numeroConta))
                .reverse().toString();

        for (int i = 0; i < numeroContaAsString.length(); i++) {
            char c = numeroContaAsString.charAt(i);
            digitosConta[i] = (Integer) (Character.getNumericValue(c) * multiplicadores[i]);
        }

        int somaDigitos = Stream.of(digitosConta).reduce(0, Integer::sum);
        int restoDivisao = somaDigitos % 11;
        if (restoDivisao < 10) {
            return Character.forDigit(restoDivisao, 10);
        }
        return 'X';
    }

    // Método para depositar dinheiro na conta
    public void depositar(Double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldo += valor;
    }

    // Método para sacar dinheiro da conta
    public void sacar(Double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para o saque.");
        }
        this.saldo -= valor;
    }

    // Método que verifica se o saldo é positivo
    public boolean isSaldoPositivo() {
        return this.saldo > 0;
    }
}