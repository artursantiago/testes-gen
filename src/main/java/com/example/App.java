package com.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Conta conta = new Conta(1L, "Beneficiario A", null, 1000.0, 262634, '0');
        char digito = conta.calculaDigitoVerificador(262634);
        System.out.println("Dígito verificador: " + digito);

        // Exemplo de uso de transferência
        Banco banco = new Banco(1L, "Banco Exemplo", null);
        Conta contaOrigem = new Conta(1L, "Cliente A", banco, 500.0, 12345, '0');
        Conta contaDestino = new Conta(2L, "Cliente B", banco, 300.0, 54321, '0');

        banco.addConta(contaOrigem);
        banco.addConta(contaDestino);

        banco.transferencia(contaOrigem, contaDestino, 200.0);

        System.out.println("Saldo conta origem: " + contaOrigem.getSaldo());
        System.out.println("Saldo conta destino: " + contaDestino.getSaldo());
    }
}