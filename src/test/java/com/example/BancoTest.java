package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class BancoTest {

    private Banco banco;
    private Conta conta1;
    private Conta conta2;

    @BeforeEach
    public void setUp() {
        banco = new Banco(1L, "Banco Exemplo", new ArrayList<>());
        conta1 = new Conta(1L, "Cliente A", banco, 500.0, 12345, '0');
        conta2 = new Conta(2L, "Cliente B", banco, 300.0, 54321, '0');
    }

    @Test
    public void testAddConta_Success() {
        banco.addConta(conta1);
        assertEquals(1, banco.contarContas());
    }

    @Test
    public void testAddConta_AlreadyExists() {
        banco.addConta(conta1);
        assertThrows(IllegalArgumentException.class, () -> banco.addConta(conta1));
    }

    @Test
    public void testTransferencia_Success() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.transferencia(conta1, conta2, 200.0);
        
        assertEquals(300.0, conta1.getSaldo());
        assertEquals(500.0, conta2.getSaldo());
    }

    @Test
    public void testTransferencia_InsufficientFunds() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        assertThrows(IllegalArgumentException.class, () -> banco.transferencia(conta1, conta2, 600.0));
    }

    @Test
    public void testTransferencia_ZeroValue() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.transferencia(conta1, conta2, 0.0);
        
        assertEquals(500.0, conta1.getSaldo());
        assertEquals(300.0, conta2.getSaldo());
    }

    @Test
    public void testCalcularSaldoTotal() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        assertEquals(800.0, banco.calcularSaldoTotal());
    }

    @Test
    public void testContarContas() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        assertEquals(2, banco.contarContas());
    }

    @Test
    public void testRemoveConta_Success() {
        banco.addConta(conta1);
        banco.removeConta(conta1);
        assertEquals(0, banco.contarContas());
    }

    @Test
    public void testRemoveConta_NotFound() {
        assertThrows(IllegalArgumentException.class, () -> banco.removeConta(conta1));
    }

    @Test
    public void testAddConta_Null() {
        assertThrows(IllegalArgumentException.class, () -> banco.addConta(null));
    }

    @Test
    public void testRemoveConta_Null() {
        assertThrows(IllegalArgumentException.class, () -> banco.removeConta(null));
    }

    @Test
    public void testTransferencia_MultipleOperations() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        
        banco.transferencia(conta1, conta2, 200.0);
        banco.transferencia(conta2, conta1, 100.0);
        
        assertEquals(400.0, conta1.getSaldo());
        assertEquals(400.0, conta2.getSaldo());
    }

    @Test
    public void testCalcularSaldoTotal_AfterMultipleAdds() {
        Conta conta3 = new Conta(3L, "Cliente C", banco, 1500.0, 11111, '1');
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.addConta(conta3);
        
        assertEquals(2300.0, banco.calcularSaldoTotal());
    }

    @Test
    public void testRemoveConta_WithBalance() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.removeConta(conta1);
        
        assertEquals(1, banco.contarContas());
        assertEquals(300.0, conta2.getSaldo());
    }

    @Test
    public void testTransferencia_NegativeBalanceAfterTransfer() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        
        banco.transferencia(conta1, conta2, 500.0); // conta1 ficará com saldo negativo
        
        assertTrue(conta1.getSaldo() < 0);
        assertEquals(800.0, conta2.getSaldo()); // conta2 receberá 500, totalizando 800
    }

    @Test
    public void testSacar_ExceedingBalance() {
        banco.addConta(conta1);
        assertThrows(IllegalArgumentException.class, () -> conta1.sacar(600.0));
    }

    @Test
    public void testAddAndRemoveMultipleAccounts() {
        Conta conta3 = new Conta(3L, "Cliente C", banco, 400.0, 67890, '2');
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.addConta(conta3);
        
        assertEquals(3, banco.contarContas());
        
        banco.removeConta(conta1);
        banco.removeConta(conta2);
        
        assertEquals(1, banco.contarContas()); // Apenas conta3 deve permanecer
    }

    // Novos testes adicionais
    @Test
    public void testTransferencia_MultipleTransfers() {
        Conta conta3 = new Conta(3L, "Cliente C", banco, 700.0, 67890, '2');
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.addConta(conta3);
        
        banco.transferencia(conta1, conta2, 200.0);
        banco.transferencia(conta2, conta3, 150.0);
        
        assertEquals(300.0, conta1.getSaldo());
        assertEquals(450.0, conta2.getSaldo());
        assertEquals(850.0, conta3.getSaldo());
    }

    @Test
    public void testTransferencia_WithMultipleAccounts() {
        Conta conta4 = new Conta(4L, "Cliente D", banco, 1000.0, 13579, '3');
        banco.addConta(conta1);
        banco.addConta(conta2);
        banco.addConta(conta3);
        banco.addConta(conta4);
        
        banco.transferencia(conta4, conta1, 500.0);
        
        assertEquals(1000.0, conta4.getSaldo());
        assertEquals(1000.0, conta1.getSaldo());
    }

    @Test
    public void testCalcularSaldoTotal_AfterRemovingAccounts() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        assertEquals(800.0, banco.calcularSaldoTotal());

        banco.removeConta(conta1);
        assertEquals(300.0, banco.calcularSaldoTotal()); // Somente conta2 deve ser considerada
    }

    @Test
    public void testContarContas_AfterRemovingAccounts() {
        banco.addConta(conta1);
        banco.addConta(conta2);
        assertEquals(2, banco.contarContas());

        banco.removeConta(conta1);
        assertEquals(1, banco.contarContas()); // Somente conta2 deve permanecer
    }

    @Test
    public void testTransferencia_FromEmptyAccount() {
        banco.addConta(conta2);
        assertThrows(IllegalArgumentException.class, () -> banco.transferencia(conta1, conta2, 100.0));
    }

    @Test
    public void testTransferencia_ToNonexistentAccount() {
        banco.addConta(conta1);
        assertThrows(IllegalArgumentException.class, () -> banco.transferencia(conta1, null, 100.0));
    }

    @Test
    public void testCalcularSaldoTotal_EmptyBank() {
        assertEquals(0.0, banco.calcularSaldoTotal());
    }
}
