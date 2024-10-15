package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta conta6 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco5.removeConta(conta6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Conta na?o encontrada no banco.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta conta6 = null;
        com.example.Conta conta7 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco5.transferencia(conta6, conta7, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        com.example.Conta conta13 = null;
        com.example.Conta conta14 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco9.transferencia(conta13, conta14, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double4 = banco3.calcularSaldoTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = banco3.contarContas();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList13 = banco3.getContas();
        java.lang.String str14 = banco3.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double15 = banco3.calcularSaldoTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(contaList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Banco(id=1, nome=hi!, contas=null)" + "'", str14, "Banco(id=1, nome=hi!, contas=null)");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        java.lang.Class<?> wildcardClass6 = banco5.getClass();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList7);
        banco3.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.Class<?> wildcardClass11 = banco3.getClass();
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        com.example.Conta conta4 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.addConta(conta4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Long long25 = banco9.getId();
        com.example.Conta conta26 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco9.removeConta(conta26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Long long25 = banco9.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double26 = banco9.calcularSaldoTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList13 = banco3.getContas();
        java.lang.String str14 = banco3.toString();
        java.lang.Class<?> wildcardClass15 = banco3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(contaList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Banco(id=1, nome=hi!, contas=null)" + "'", str14, "Banco(id=1, nome=hi!, contas=null)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        com.example.Conta conta25 = null;
        com.example.Conta conta26 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco16.transferencia(conta25, conta26, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList13 = banco3.getContas();
        com.example.Conta conta14 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.addConta(conta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(contaList13);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.setNome("hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        java.util.List<com.example.Conta> contaList14 = null;
        com.example.Banco banco15 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList14);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = banco15.equals(obj16);
        boolean boolean18 = banco9.canEqual((java.lang.Object) banco15);
        java.util.List<com.example.Conta> contaList21 = null;
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList21);
        com.example.Conta[] contaArray25 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList26 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList26, contaArray25);
        com.example.Banco banco28 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList26);
        banco22.setContas((java.util.List<com.example.Conta>) contaList26);
        boolean boolean30 = banco15.equals((java.lang.Object) banco22);
        boolean boolean32 = banco22.equals((java.lang.Object) (-1.0d));
        boolean boolean33 = banco3.canEqual((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(contaArray25);
        org.junit.Assert.assertArrayEquals(contaArray25, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        com.example.Conta conta6 = null;
        com.example.Conta conta7 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco5.transferencia(conta6, conta7, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.lang.String str6 = banco3.getNome();
        com.example.Conta conta7 = null;
        com.example.Conta conta8 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.transferencia(conta7, conta8, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList7);
        banco3.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str11 = banco3.toString();
        java.lang.Class<?> wildcardClass12 = banco3.getClass();
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str11, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        boolean boolean7 = banco3.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.lang.String str13 = banco3.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Long long25 = banco9.getId();
        java.lang.String str26 = banco9.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.lang.String str13 = banco3.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = banco3.contarContas();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Banco(id=1, nome=hi!, contas=null)" + "'", str13, "Banco(id=1, nome=hi!, contas=null)");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList13 = banco3.getContas();
        java.util.List<com.example.Conta> contaList14 = banco3.getContas();
        com.example.Conta conta15 = null;
        com.example.Conta conta16 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.transferencia(conta15, conta16, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(contaList13);
        org.junit.Assert.assertNull(contaList14);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 100L, "Banco(id=1, nome=hi!, contas=null)", contaList2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) (-1L), "hi!", contaList2);
        com.example.Conta conta4 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.removeConta(conta4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        banco3.setId((java.lang.Long) 10L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.lang.String str6 = banco3.getNome();
        java.util.List<com.example.Conta> contaList9 = null;
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList9);
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = banco10.equals(obj11);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        banco10.setContas((java.util.List<com.example.Conta>) contaList20);
        banco3.setContas((java.util.List<com.example.Conta>) contaList20);
        java.lang.Class<?> wildcardClass26 = banco3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Long long25 = banco9.getId();
        banco9.setNome("hi!");
        com.example.Conta conta28 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco9.removeConta(conta28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        boolean boolean7 = banco5.canEqual((java.lang.Object) 10.0f);
        java.util.List<com.example.Conta> contaList10 = null;
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList10);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = banco11.equals(obj12);
        java.lang.String str14 = banco11.getNome();
        boolean boolean16 = banco11.equals((java.lang.Object) 10.0d);
        com.example.Conta[] contaArray17 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList18 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList18, contaArray17);
        banco11.setContas((java.util.List<com.example.Conta>) contaList18);
        banco5.setContas((java.util.List<com.example.Conta>) contaList18);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(contaArray17);
        org.junit.Assert.assertArrayEquals(contaArray17, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.List<com.example.Conta> contaList4 = null;
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = banco5.equals(obj6);
        java.util.List<com.example.Conta> contaList10 = null;
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList10);
        com.example.Conta[] contaArray14 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList15 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList15, contaArray14);
        com.example.Banco banco17 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList15);
        banco11.setContas((java.util.List<com.example.Conta>) contaList15);
        banco5.setContas((java.util.List<com.example.Conta>) contaList15);
        com.example.Banco banco20 = new com.example.Banco((java.lang.Long) 10L, "Banco(id=1, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(contaArray14);
        org.junit.Assert.assertArrayEquals(contaArray14, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        boolean boolean7 = banco5.canEqual((java.lang.Object) (-1));
        int int8 = banco5.contarContas();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList13 = banco3.getContas();
        boolean boolean15 = banco3.canEqual((java.lang.Object) '#');
        java.util.List<com.example.Conta> contaList18 = null;
        com.example.Banco banco19 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList18);
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = banco19.equals(obj20);
        java.util.List<com.example.Conta> contaList24 = null;
        com.example.Banco banco25 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList24);
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = banco25.equals(obj26);
        boolean boolean28 = banco19.canEqual((java.lang.Object) banco25);
        java.util.List<com.example.Conta> contaList31 = null;
        com.example.Banco banco32 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList31);
        com.example.Conta[] contaArray35 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList36 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList36, contaArray35);
        com.example.Banco banco38 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList36);
        banco32.setContas((java.util.List<com.example.Conta>) contaList36);
        boolean boolean40 = banco25.equals((java.lang.Object) banco32);
        boolean boolean41 = banco3.canEqual((java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(contaList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(contaArray35);
        org.junit.Assert.assertArrayEquals(contaArray35, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.lang.String str6 = banco3.getNome();
        java.lang.String str7 = banco3.getNome();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.lang.String str13 = banco3.toString();
        com.example.Conta conta14 = null;
        com.example.Conta conta15 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.transferencia(conta14, conta15, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Banco(id=1, nome=hi!, contas=null)" + "'", str13, "Banco(id=1, nome=hi!, contas=null)");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        boolean boolean26 = banco9.equals((java.lang.Object) 10.0f);
        com.example.Conta conta27 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco9.removeConta(conta27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Long long25 = banco9.getId();
        java.util.List<com.example.Conta> contaList26 = banco9.getContas();
        banco9.setNome("Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNull(contaList26);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.lang.String str6 = banco3.getNome();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double7 = banco3.calcularSaldoTotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList7);
        banco3.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str11 = banco3.toString();
        java.util.List<com.example.Conta> contaList14 = null;
        com.example.Banco banco15 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList14);
        com.example.Conta[] contaArray18 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList19 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList19, contaArray18);
        com.example.Banco banco21 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList19);
        banco15.setContas((java.util.List<com.example.Conta>) contaList19);
        java.lang.String str23 = banco15.toString();
        boolean boolean24 = banco3.canEqual((java.lang.Object) banco15);
        java.lang.String str25 = banco3.getNome();
        int int26 = banco3.contarContas();
        com.example.Conta conta27 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.removeConta(conta27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Conta na?o encontrada no banco.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str11, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaArray18);
        org.junit.Assert.assertArrayEquals(contaArray18, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str23, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        boolean boolean26 = banco9.equals((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = banco9.contarContas();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        boolean boolean26 = banco9.equals((java.lang.Object) 10.0f);
        com.example.Conta conta27 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco9.addConta(conta27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList7);
        banco3.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str11 = banco3.toString();
        java.util.List<com.example.Conta> contaList14 = null;
        com.example.Banco banco15 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList14);
        com.example.Conta[] contaArray18 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList19 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList19, contaArray18);
        com.example.Banco banco21 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList19);
        banco15.setContas((java.util.List<com.example.Conta>) contaList19);
        java.lang.String str23 = banco15.toString();
        boolean boolean24 = banco3.canEqual((java.lang.Object) banco15);
        java.lang.String str25 = banco3.getNome();
        boolean boolean27 = banco3.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str11, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaArray18);
        org.junit.Assert.assertArrayEquals(contaArray18, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str23, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList13 = banco3.getContas();
        banco3.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(contaList13);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Long long25 = banco9.getId();
        banco9.setNome("hi!");
        banco9.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Long long25 = banco9.getId();
        banco9.setNome("hi!");
        java.util.List<com.example.Conta> contaList30 = null;
        com.example.Banco banco31 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList30);
        boolean boolean32 = banco9.equals((java.lang.Object) contaList30);
        com.example.Conta conta33 = null;
        com.example.Conta conta34 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco9.transferencia(conta33, conta34, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        com.example.Conta conta6 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco3.addConta(conta6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        boolean boolean7 = banco5.canEqual((java.lang.Object) (-1));
        com.example.Conta conta8 = null;
        banco5.addConta(conta8);
        java.lang.String str10 = banco5.toString();
        java.util.List<com.example.Conta> contaList13 = null;
        com.example.Banco banco14 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList13);
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = banco14.equals(obj15);
        java.util.List<com.example.Conta> contaList19 = null;
        com.example.Banco banco20 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList19);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = banco20.equals(obj21);
        boolean boolean23 = banco14.canEqual((java.lang.Object) banco20);
        java.util.List<com.example.Conta> contaList26 = null;
        com.example.Banco banco27 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList26);
        com.example.Conta[] contaArray30 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList31 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList31, contaArray30);
        com.example.Banco banco33 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList31);
        banco27.setContas((java.util.List<com.example.Conta>) contaList31);
        boolean boolean35 = banco20.equals((java.lang.Object) banco27);
        boolean boolean37 = banco27.equals((java.lang.Object) (-1.0d));
        java.lang.Double double38 = banco27.calcularSaldoTotal();
        java.util.List<com.example.Conta> contaList39 = banco27.getContas();
        banco5.setContas(contaList39);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Banco(id=-1, nome=hi!, contas=[null])" + "'", str10, "Banco(id=-1, nome=hi!, contas=[null])");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(contaArray30);
        org.junit.Assert.assertArrayEquals(contaArray30, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(contaList39);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList7);
        banco3.setContas((java.util.List<com.example.Conta>) contaList7);
        java.lang.String str11 = banco3.toString();
        java.util.List<com.example.Conta> contaList14 = null;
        com.example.Banco banco15 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList14);
        com.example.Conta[] contaArray18 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList19 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList19, contaArray18);
        com.example.Banco banco21 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList19);
        banco15.setContas((java.util.List<com.example.Conta>) contaList19);
        java.lang.String str23 = banco15.toString();
        boolean boolean24 = banco3.canEqual((java.lang.Object) banco15);
        java.lang.String str25 = banco3.getNome();
        int int26 = banco3.contarContas();
        com.example.Conta conta27 = null;
        banco3.addConta(conta27);
        java.lang.Long long29 = banco3.getId();
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str11, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertNotNull(contaArray18);
        org.junit.Assert.assertArrayEquals(contaArray18, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Banco(id=1, nome=hi!, contas=[])" + "'", str23, "Banco(id=1, nome=hi!, contas=[])");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.example.Conta[] contaArray6 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList7 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList7, contaArray6);
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco10 = new com.example.Banco((java.lang.Long) 100L, "", (java.util.List<com.example.Conta>) contaList7);
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) (-1L), "Banco(id=1, nome=hi!, contas=null)", (java.util.List<com.example.Conta>) contaList7);
        com.example.Conta conta12 = null;
        // The following exception was thrown during execution in test generation
        try {
            banco11.removeConta(conta12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Conta na?o encontrada no banco.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaArray6);
        org.junit.Assert.assertArrayEquals(contaArray6, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = banco3.equals(obj4);
        java.util.List<com.example.Conta> contaList8 = null;
        com.example.Banco banco9 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList8);
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = banco9.equals(obj10);
        boolean boolean12 = banco3.canEqual((java.lang.Object) banco9);
        java.util.List<com.example.Conta> contaList15 = null;
        com.example.Banco banco16 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList15);
        com.example.Conta[] contaArray19 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList20 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList20, contaArray19);
        com.example.Banco banco22 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList20);
        banco16.setContas((java.util.List<com.example.Conta>) contaList20);
        boolean boolean24 = banco9.equals((java.lang.Object) banco16);
        java.lang.Double double25 = banco16.calcularSaldoTotal();
        banco16.setNome("Banco(id=1, nome=hi!, contas=null)");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(contaArray19);
        org.junit.Assert.assertArrayEquals(contaArray19, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 0L, "Banco(id=-1, nome=hi!, contas=[null])", contaList2);
        banco3.setId((java.lang.Long) 1L);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.util.List<com.example.Conta> contaList2 = null;
        com.example.Banco banco3 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList2);
        java.util.List<com.example.Conta> contaList6 = null;
        com.example.Banco banco7 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList6);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = banco7.equals(obj8);
        java.util.List<com.example.Conta> contaList12 = null;
        com.example.Banco banco13 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList12);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = banco13.equals(obj14);
        boolean boolean16 = banco7.canEqual((java.lang.Object) banco13);
        java.util.List<com.example.Conta> contaList19 = null;
        com.example.Banco banco20 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList19);
        com.example.Conta[] contaArray23 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList24 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList24, contaArray23);
        com.example.Banco banco26 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList24);
        banco20.setContas((java.util.List<com.example.Conta>) contaList24);
        boolean boolean28 = banco13.equals((java.lang.Object) banco20);
        java.lang.Long long29 = banco13.getId();
        banco13.setNome("hi!");
        java.util.List<com.example.Conta> contaList34 = null;
        com.example.Banco banco35 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList34);
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = banco35.equals(obj36);
        java.util.List<com.example.Conta> contaList40 = null;
        com.example.Banco banco41 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList40);
        com.example.Conta[] contaArray44 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList45 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList45, contaArray44);
        com.example.Banco banco47 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList45);
        banco41.setContas((java.util.List<com.example.Conta>) contaList45);
        banco35.setContas((java.util.List<com.example.Conta>) contaList45);
        banco13.setContas((java.util.List<com.example.Conta>) contaList45);
        boolean boolean51 = banco3.canEqual((java.lang.Object) banco13);
        banco3.setNome("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(contaArray23);
        org.junit.Assert.assertArrayEquals(contaArray23, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(contaArray44);
        org.junit.Assert.assertArrayEquals(contaArray44, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        boolean boolean7 = banco5.canEqual((java.lang.Object) 10.0f);
        java.lang.Double double8 = banco5.calcularSaldoTotal();
        int int9 = banco5.contarContas();
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.example.Conta[] contaArray2 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList3 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList3, contaArray2);
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList3);
        banco5.setId((java.lang.Long) 1L);
        boolean boolean9 = banco5.canEqual((java.lang.Object) ' ');
        java.lang.Object obj10 = null;
        boolean boolean11 = banco5.equals(obj10);
        org.junit.Assert.assertNotNull(contaArray2);
        org.junit.Assert.assertArrayEquals(contaArray2, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.util.List<com.example.Conta> contaList4 = null;
        com.example.Banco banco5 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList4);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = banco5.equals(obj6);
        java.util.List<com.example.Conta> contaList10 = null;
        com.example.Banco banco11 = new com.example.Banco((java.lang.Long) 1L, "hi!", contaList10);
        com.example.Conta[] contaArray14 = new com.example.Conta[] {};
        java.util.ArrayList<com.example.Conta> contaList15 = new java.util.ArrayList<com.example.Conta>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.example.Conta>) contaList15, contaArray14);
        com.example.Banco banco17 = new com.example.Banco((java.lang.Long) (-1L), "hi!", (java.util.List<com.example.Conta>) contaList15);
        banco11.setContas((java.util.List<com.example.Conta>) contaList15);
        banco5.setContas((java.util.List<com.example.Conta>) contaList15);
        com.example.Banco banco20 = new com.example.Banco((java.lang.Long) 100L, "", (java.util.List<com.example.Conta>) contaList15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(contaArray14);
        org.junit.Assert.assertArrayEquals(contaArray14, new com.example.Conta[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

