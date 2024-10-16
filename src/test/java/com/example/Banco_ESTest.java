/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 15 20:09:08 GMT 2024
 */

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.Banco;
import com.example.Conta;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Banco_ESTest extends Banco_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long(0L);
      Banco banco0 = new Banco();
      Double double0 = new Double(1.0);
      Conta conta0 = new Conta(long0, "", banco0, double0, 0, 'u');
      Conta conta1 = new Conta();
      // Undeclared exception!
      try { 
        banco0.transferencia(conta0, conta1, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.Banco", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Banco banco0 = new Banco();
      Long long0 = new Long((-1L));
      Double double0 = new Double(0);
      Conta conta0 = new Conta(long0, "Banco(id=null, nome=, nome=, contas=[])", banco0, double0, 0, 'w');
      Double double1 = new Double((-1L));
      banco0.transferencia(conta0, conta0, double1);
      assertEquals(0.0, conta0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Long long0 = new Long(1L);
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "+n~'XA$P:8-1\"FMkS", linkedList0);
      Conta conta0 = new Conta();
      banco0.addConta(conta0);
      assertEquals(1, banco0.contarContas());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Banco banco0 = new Banco();
      banco0.setNome(", nome=");
      String string0 = banco0.getNome();
      assertEquals(", nome=", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long long0 = new Long(718L);
      Banco banco0 = new Banco(long0, "", (List<Conta>) null);
      String string0 = banco0.getNome();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Banco banco0 = new Banco();
      Long long0 = banco0.getId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(0L);
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "6=", linkedList0);
      Long long1 = banco0.getId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Banco banco0 = new Banco();
      Long long0 = new Long((-2085L));
      banco0.setId(long0);
      Long long1 = banco0.getId();
      assertEquals((-2085L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Banco banco0 = new Banco();
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      banco0.setContas(linkedList0);
      List<Conta> list0 = banco0.getContas();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Banco banco0 = new Banco();
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Conta conta0 = new Conta();
      linkedList0.add(conta0);
      banco0.setContas(linkedList0);
      List<Conta> list0 = banco0.getContas();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Long long0 = new Long(837L);
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "Conta n\u00E3o encontrada no banco.", linkedList0);
      Double double0 = new Double(1350.4950728356775);
      Conta conta0 = new Conta(long0, "Conta n\u00E3o encontrada no banco.", banco0, double0, 1965, 'T');
      linkedList0.add(conta0);
      int int0 = banco0.contarContas();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Long long0 = new Long((-5074L));
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "", linkedList0);
      boolean boolean0 = banco0.canEqual(banco0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Banco banco0 = new Banco();
      Integer integer0 = new Integer(2027);
      boolean boolean0 = banco0.canEqual(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Long long0 = new Long(837L);
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "Conta n\u00E3o encontrada no banco.", linkedList0);
      Double double0 = new Double(1350.4950728356775);
      Conta conta0 = new Conta(long0, "Conta n\u00E3o encontrada no banco.", banco0, double0, 1965, 'T');
      linkedList0.add(conta0);
      Double double1 = banco0.calcularSaldoTotal();
      assertEquals(1350.4950728356775, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Long long0 = new Long((-158L));
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco();
      Double double0 = new Double((-158L));
      Conta conta0 = new Conta(long0, "Saldo insuficiente para transfer\u00EAncia.", banco0, double0, 933, 'J');
      linkedList0.add(conta0);
      Banco banco1 = new Banco(long0, "", linkedList0);
      Double double1 = banco1.calcularSaldoTotal();
      assertEquals((-158.0), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Long long0 = new Long((-1L));
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Double double0 = new Double((-1L));
      Conta conta0 = new Conta(long0, ", numeroConta=", (Banco) null, double0, (-3389), '$');
      linkedList0.add(conta0);
      Banco banco0 = new Banco(long0, ", numeroConta=", linkedList0);
      Double double1 = banco0.calcularSaldoTotal();
      assertEquals((-1.0), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Banco banco0 = new Banco();
      Conta conta0 = new Conta();
      // Undeclared exception!
      try { 
        banco0.removeConta(conta0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Banco banco0 = new Banco();
      // Undeclared exception!
      try { 
        banco0.contarContas();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.Banco", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Banco banco0 = new Banco();
      String string0 = banco0.getNome();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Banco banco0 = new Banco();
      List<Conta> list0 = banco0.getContas();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Long long0 = new Long(1063L);
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "", linkedList0);
      Long long1 = banco0.getId();
      assertEquals(1063L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Long long0 = new Long((-1L));
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "", linkedList0);
      Double double0 = banco0.calcularSaldoTotal();
      Conta conta0 = new Conta(long0, "", banco0, double0, (-1), 'k');
      linkedList0.add(conta0);
      banco0.removeConta(conta0);
      assertEquals((-1L), (long)banco0.getId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Banco banco0 = new Banco();
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      banco0.setContas(linkedList0);
      try { 
        banco0.removeConta((Conta) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Conta n\u00E3o encontrada no banco.
         //
         verifyException("com.example.Banco", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Banco banco0 = new Banco();
      Long long0 = new Long((-3429L));
      Double double0 = new Double((-3429L));
      Conta conta0 = new Conta(long0, ")", banco0, double0, 0, 'O');
      banco0.transferencia(conta0, conta0, double0);
      assertEquals((-3429.0), conta0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Banco banco0 = new Banco();
      Long long0 = new Long(0L);
      Double double0 = new Double(0L);
      Conta conta0 = new Conta(long0, "Conta(id=", banco0, double0, (-633), 'p');
      Double double1 = new Double(5617.21304287357);
      try { 
        banco0.transferencia(conta0, conta0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Saldo insuficiente para transfer\u00EAncia.
         //
         verifyException("com.example.Banco", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Banco banco0 = new Banco();
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      banco0.setContas(linkedList0);
      Banco banco1 = new Banco();
      assertFalse(banco1.equals((Object)banco0));
      
      banco1.setContas(linkedList0);
      boolean boolean0 = banco0.equals(banco1);
      assertTrue(banco1.equals((Object)banco0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Banco banco0 = new Banco();
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco1 = new Banco();
      assertTrue(banco1.equals((Object)banco0));
      
      banco1.setContas(linkedList0);
      boolean boolean0 = banco0.equals(banco1);
      assertFalse(banco1.equals((Object)banco0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Banco banco0 = new Banco();
      Banco banco1 = new Banco();
      boolean boolean0 = banco0.equals(banco1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Long long0 = new Long(3458L);
      Banco banco0 = new Banco(long0, "FK^'h!xt", (List<Conta>) null);
      Banco banco1 = new Banco(long0, "FK^'h!xt", (List<Conta>) null);
      boolean boolean0 = banco0.equals(banco1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Long long0 = new Long(3458L);
      Banco banco0 = new Banco();
      Banco banco1 = new Banco(long0, "FK^'h!xt", (List<Conta>) null);
      boolean boolean0 = banco0.equals(banco1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Long long0 = new Long(3458L);
      Banco banco0 = new Banco();
      Banco banco1 = new Banco(long0, "FK^'h!xt", (List<Conta>) null);
      boolean boolean0 = banco1.equals(banco0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Banco banco0 = new Banco();
      boolean boolean0 = banco0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Banco banco0 = new Banco();
      boolean boolean0 = banco0.equals(banco0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Long long0 = new Long(837L);
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "", linkedList0);
      banco0.hashCode();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Long long0 = new Long(837L);
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco0 = new Banco(long0, "", linkedList0);
      int int0 = banco0.contarContas();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Banco banco0 = new Banco();
      banco0.setNome("");
      Banco banco1 = new Banco();
      boolean boolean0 = banco0.equals(banco1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Banco banco0 = new Banco();
      String string0 = banco0.toString();
      assertEquals("Banco(id=null, nome=null, contas=null)", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Banco banco0 = new Banco();
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      Banco banco1 = new Banco((Long) null, "[Yiw(?Im]x", linkedList0);
      boolean boolean0 = banco0.equals(banco1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Banco banco0 = new Banco();
      LinkedList<Conta> linkedList0 = new LinkedList<Conta>();
      banco0.setContas(linkedList0);
      Banco banco1 = new Banco();
      boolean boolean0 = banco0.equals(banco1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Banco banco0 = new Banco();
      Conta conta0 = new Conta();
      // Undeclared exception!
      try { 
        banco0.addConta(conta0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.Banco", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Banco banco0 = new Banco();
      banco0.hashCode();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Banco banco0 = new Banco();
      // Undeclared exception!
      try { 
        banco0.calcularSaldoTotal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.Banco", e);
      }
  }
}
