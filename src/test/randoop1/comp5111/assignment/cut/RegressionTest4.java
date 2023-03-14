package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        char[] charArray7 = new char[] { ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-11), (int) (short) 100, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhhhhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-101));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhi!!!!!!", (java.lang.CharSequence) "hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (int) (short) 10, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-99), 15, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(39, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i", "hhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi", "hhi!!!", "hhhhhhi!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi" + "'", str3, "hhi");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!" + "'", str1, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(35, (int) ' ', (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray6 = new char[] { ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray6);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean8, 101);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi!");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhhi!", (int) '4');
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.CharSequence charSequence19 = null;
        char[] charArray20 = new char[] {};
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence19, charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray17, (java.lang.Object) "", (int) 'a');
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!");
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray17, (java.lang.Object) strArray26, 45);
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) '\r', (-10));
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) (-10), 30);
        java.lang.Class<?> wildcardClass36 = strArray26.getClass();
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass36, (-99));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) strArray2, (int) (short) 1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 999999999, 6);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 1L, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-17), 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60 + "'", int1 == 60);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hi!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hhhhi!", 1);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hi!", 30);
        java.lang.CharSequence charSequence11 = null;
        char[] charArray12 = new char[] {};
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray12, 90);
        java.lang.CharSequence charSequence22 = null;
        char[] charArray23 = new char[] {};
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence22, charArray23);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray23);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray23);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray23);
        boolean boolean28 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray23);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray23, 17);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhi!!", charArray23);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!hhhi!!hhhi!!i");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) wildcardClass12, 8);
        java.lang.CharSequence charSequence18 = null;
        char[] charArray19 = new char[] {};
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence18, charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray19);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray19, 6);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-19));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!i!", "hhh", "hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!i!!hh!i!!hh!i!!i!" + "'", str3, "hh!i!!hh!i!!hh!i!!i!");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(97, (int) (short) 1, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 60");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!!", 97);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) charArray8, (-62));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-62), (int) (short) 1);
        java.lang.CharSequence charSequence19 = null;
        char[] charArray24 = new char[] { ' ', '#' };
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray24);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray24);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence19, charArray24);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray24);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!!", charArray24);
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray24);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhi", charArray24);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray24);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray24);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhi!", 62);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi" + "'", str1, "hhhi");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(84);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhi!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-65), (-25), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(99, 84, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hi!", "hhhhhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhhhhi!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 22, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhhhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(45, 7, 2);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-45), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhhhhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!", charArray4);
        java.lang.Class<?> wildcardClass12 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhh" + "'", str1, "hhhhh");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray3);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhh!!" + "'", str1, "hhhhhhhhhhh!!");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi" + "'", str2, "hhhhi");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!hhi!!", "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!!", "hhhhhhi", "hhi!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!!" + "'", str3, "hhhi!!!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhi");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhi!!!!!!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi!!!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi!");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) '\r');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhh", "hhhi!!hhhi!!hhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 0, 2, (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhhhhhhhh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) '#', 999999999);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi!!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 62);
        java.lang.CharSequence charSequence11 = null;
        char[] charArray12 = new char[] {};
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence11, charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) boolean19, 0);
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!", "hhh", "hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhii!!hhhhii!!hhhhii!!" + "'", str3, "hhhhii!!hhhhii!!hhhhii!!");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(97, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhhi!!!!", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhi!!!!" + "'", str2, "hhhhhhi!!!!");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-62), (-84), 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hhi!" + "'", str1, "hi!hhi!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi", "hhhi!", "hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi" + "'", str3, "hhhi");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(42, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhhhhhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhhhhhhhh! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhi!!hhi!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!!hhi!!i!" + "'", str1, "hhi!!hhi!!i!");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhhi!!!!", "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i", "hi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhi!!!!" + "'", str3, "hhhhhhi!!!!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhhhhhh!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhhhhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhi!!hhi!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!!hhi!!i" + "'", str1, "hhi!!hhi!!i");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-10), (int) (byte) 10, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-19), (-62), (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!i!!hh!i!!hh!i!!i!", "hhhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhi!!", charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhii!!hhhhii!!hhhhii!!", "hhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhhhhhi!!!!!!!!!", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhhhhhhi!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(84, (-39), (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!!hh!!hh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-19), 62, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhii!!hhhhii!!hhhhii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhii!!hhhhii!!hhhhii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhhi!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hi!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-101), (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhi!!hhhi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        char[] charArray5 = new char[] { ' ', '#' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i!", charArray5);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!hhi!!", (java.lang.CharSequence) "hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-10), (-42), 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhii!!hhhhii!!hhhhii!" + "'", str1, "hhhhii!!hhhhii!!hhhhii!");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-90), 7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi", "hhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi" + "'", str2, "hhi");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 0, (-90), 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(25, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhi!!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhhi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-65), (-9), 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi", "i!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i", "hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi", "hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-3), 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhi!", "hhhhhi!!!!!!", "hhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhi!" + "'", str3, "hhhhi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhhhhhh!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(39, 29, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(29, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(17, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi", "hhhi!", "hhi!!hhi!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi" + "'", str3, "hhi");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-999999999), 6, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhi", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-100), (-100), (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhi", (java.lang.CharSequence) "h!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i", "hhhhhhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(29, (-42), (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhhhhhhh!", (java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", (int) 'a');
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray12, 45);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int14, (-11));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh!i!!hh!i!!hh!i!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!i!!hh!i!!hh!i!!i!" + "'", str1, "hh!i!!hh!i!!hh!i!!i!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!i!!hh!i!!hh!i!!i!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!i!!hh!i!!hh!i!!i!" + "'", str2, "hh!i!!hh!i!!hh!i!!i!");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int[] intArray4 = new int[] { '\n', (-3), 90, (-3) };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -3, 90, -3]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhi!!hhi!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!!hhi!!", "hi", "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!" + "'", str3, "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        char[] charArray6 = new char[] { ' ', '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = new char[] {};
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhhhhhhh!!", (java.lang.CharSequence) "hhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-3), 6, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!" + "'", str1, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(17, 18, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        char[] charArray5 = new char[] { ' ', '#' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 10, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhii!!hhhhii!!hhhhii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhii!!hhhhii!!hhhhii" + "'", str1, "hhhhii!!hhhhii!!hhhhii");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass7 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhhhhhhi!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhi!!!!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!", charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hh!!hh!!hh!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        char[] charArray7 = new char[] { ' ', '#' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhhh!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!", "hhhhhhhhhhh!!", "hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!hhhi!!hhhi!" + "'", str3, "hhhi!!hhhi!!hhhi!");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhii!!hhhhii!!hhhhii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhii!!hhhhii!!hhhhii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "hhi!!", "hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhii!!hhhhii!!hhhhii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhii!!hhhhii!!hhhhii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhii!!hhhhii!!hhhhii" + "'", str1, "hhhhii!!hhhhii!!hhhhii");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) 'a', 31, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhii!!hhhhii!!hhhhii!", "hhhi!!hhhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhhhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!", (java.lang.CharSequence) "hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", (int) 'a');
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray12, 45);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) '\r', (-10));
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) (-10), 30);
        java.lang.Class<?> wildcardClass22 = strArray12.getClass();
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray12, 99);
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!");
        java.lang.String[] strArray28 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Class<?> wildcardClass29 = strArray28.getClass();
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) strArray28, (int) (byte) 10);
        java.lang.Class<?> wildcardClass32 = strArray26.getClass();
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) strArray26, 16);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhi!!hhhi!!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hhh" + "'", str1, "hhhi!!hhhi!!hhh");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhii!!hhhhii!!hhhhii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhii!!hhhhii!!hhhhii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-62), (-90), 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhh", "hhhhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (int) '\n', (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhhhhhhi!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhi!!!!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) -1, 45);
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence9 = null;
        java.lang.CharSequence charSequence11 = null;
        char[] charArray12 = new char[] {};
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence9, charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!!!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray12);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean22, 39);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhii!!hhhhii!!hhhhii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhii!!hhhhii!!hhhhii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhii!!hhhhii!!hhhhii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhii!!hhhhii!!hhhhii!" + "'", str1, "hhhhii!!hhhhii!!hhhhii!");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!", (java.lang.CharSequence) "hhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-97), (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(97, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i", "hhi", "hhhhhhi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i" + "'", str3, "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhi!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhhhhhhi!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-39));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhii!!hhhhii!!hhhhii!", "hhhhi!!!", "hh!i!!hh!i!!hh!i!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhii!!hhhhii!!hhhhii!" + "'", str3, "hhhhii!!hhhhii!!hhhhii!");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] { ' ', '#' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhhh!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhhi");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean7, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hhhhi!", 1);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hi!", 30);
        java.lang.CharSequence charSequence12 = null;
        char[] charArray13 = new char[] {};
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence12, charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray13, 90);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int19, (int) (short) 0);
        java.lang.String[] strArray23 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) '\n', 6);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) "hhhhi!!", 0);
        java.lang.CharSequence charSequence32 = null;
        char[] charArray33 = new char[] {};
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence32, charArray33);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean36 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray33);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray33);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) charArray33, 45);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 45, (-13));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhi!!hhhi!!hhhi");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhi!!hhhi!!hhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!", "hhhi!!hhhi!!hhhi!!", "hhhhhhhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!" + "'", str3, "hhi!");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!" + "'", str1, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhh");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean7, 19);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhi!!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(45, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(7, (int) '4', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhhhhhhhh!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhii!!hhhhii!!hhhhii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhh", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!", charArray2);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhh", "hh!!hh!!hh!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!" + "'", str1, "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(999999999, 9, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!i!!hh!i!!hh!i!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-100), 8, 7);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray7, (-62));
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hi!hhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhhhhh!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(101, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!i!!hh!i!!hh!i!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(87, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), 6, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!hhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 29, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhi!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhhhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-100), (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi", "hhhi!!hhhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i!", charArray6);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(18, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!", "hhhhhhhhhhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi" + "'", str2, "hhhhi");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhi!!hhhi!!hhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\n', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhhi!", "hhhhhhi!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        char[] charArray8 = new char[] { ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!hh!!hh!!i!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhh", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hh!i!!hh!i!!hh!i!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhhhhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-22));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", charArray6);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) wildcardClass8, (-22));
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.CharSequence charSequence16 = null;
        char[] charArray17 = new char[] {};
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence16, charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, (java.lang.Object) charArray17, (-62));
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray17, 19);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!i!!hh!i!!hh!i!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhi!!hhi!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean11, (int) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhhhi!!hhhi!!hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!i!!hh!i!!hh!i!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!i!!hh!i!!hh!i!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(25, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhi!", (java.lang.CharSequence) "hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 10, (int) '\000', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhi!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray7);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray7, (-101));
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!!", (java.lang.CharSequence) "hhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\n', (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi", "hhhi!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!i!!hh!i!!hh!i!!i!", "hhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhi!!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhh", "hhhhi!!", "hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhh" + "'", str3, "hhhhh");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-101), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!hhi!", "hhhi!!!!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!" + "'", str3, "hi!hhi!");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi");
        char[] charArray10 = new char[] { ' ', '#' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray10);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray10, 62);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-90));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhhhhhi!!hhhi!!hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhi!!hhhi!!hhhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-25), (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence7, charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhi!!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhii!!hhhhii!!hhhhii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhh", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 10);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!!", (int) (byte) 1);
        java.lang.Object obj9 = null;
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj9, 100);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!");
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) strArray17, 10);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray13, (java.lang.Object) int19, 39);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 39, 19);
        java.lang.CharSequence charSequence26 = null;
        char[] charArray27 = new char[] {};
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence26, charArray27);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray27);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray27);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray27, (-999999999));
        java.lang.CharSequence charSequence34 = null;
        char[] charArray35 = new char[] {};
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence34, charArray35);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray35);
        java.lang.Class<?> wildcardClass38 = charArray35.getClass();
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray35, 13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhhi!!i!", "hh!!hh!!hh!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.lang.Object[] objArray0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray5, 13);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hi!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-1), (-42), 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhhhhhhh!!", (java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(17, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!hhhi!!hh", (java.lang.CharSequence) "hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!i!", "hh!", "hhhhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!hhhi!!hhhi!!i!" + "'", str3, "hhhi!!hhhi!!hhhi!!i!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray2);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhhh!!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, (int) 'a', 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!!!");
        int[] intArray3 = new int[] { (short) 100 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray3, 11);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hhhhhhi", "hhhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!hhhi!!hhhi!!i!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhii!!hhhhii!!hhhhii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        char[] charArray2 = new char[] { '\000' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhi", charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\000]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhhhhhi!!!!!!!!!", "hhhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhi!!!!!!!!!" + "'", str2, "hhhhhhhhhi!!!!!!!!!");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 100, 17, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!", "hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhi!", "hhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!" + "'", str2, "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhii!!hhhhii!!hhhhii", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhi!!");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray5);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, 25);
        java.lang.CharSequence charSequence13 = null;
        java.lang.CharSequence charSequence15 = null;
        char[] charArray16 = new char[] {};
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence15, charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence13, charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray16);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence9 = null;
        char[] charArray10 = new char[] {};
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence9, charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh", charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray10);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean21, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-9), 16, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-90), 30, (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-17), (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhi!!", "hhhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        char[] charArray3 = new char[] { ' ', '#' };
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhi!!" + "'", str2, "hhhi!!");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!", "hhhhhhhhhhh!", "hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!" + "'", str3, "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean9, 0);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) strArray14, (int) (short) 1);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray14);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, (java.lang.Object) (byte) 0, 0);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int20, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-3));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\000', 7, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 1, 18);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i");
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) '#', 999999999);
        java.lang.CharSequence charSequence14 = null;
        char[] charArray15 = new char[] {};
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence14, charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray15);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) "h", 4);
        java.lang.Class<?> wildcardClass24 = strArray8.getClass();
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) wildcardClass24, 5);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) (-42), (-10));
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 90);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(100, 52, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi" + "'", str1, "hhhhhhi");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(84, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhhhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhi", (java.lang.CharSequence) "hhi!!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!", "hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhhi!", "hhhi!!hhhi!!hhhi!", "hhhhhhhhhhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhi!" + "'", str3, "hhhhhhi!");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!i!!hh!i!!hh!i!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!!" + "'", str1, "hhhi!!!");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhhhii!!hhhhii!!hhhhii!!", "hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhhhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!" + "'", str1, "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-11), (int) (short) 10, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hh!i!!hh!i!!hh!i!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(87, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(3, (-87), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(1, 4, 4);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhii!!hhhhii!!hhhhii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass11 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hi!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\r', (int) '\000', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-62), 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 1, 31);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!", "hhi!", "hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhh!hhhhh!hhh!!hhhhhh!hhhhh!hhh!" + "'", str3, "hhhhhh!hhhhh!hhh!!hhhhhh!hhhhh!hhh!");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!hhi!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!", "hh!!hh!!hh!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!!!", (java.lang.CharSequence) "hhhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) '\n', 6);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hhhhi!!", 0);
        java.lang.CharSequence charSequence11 = null;
        char[] charArray12 = new char[] {};
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray12, 45);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhi!!!", charArray12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!hhhi!!hhhi!!i");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray8);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray8, 0);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhii!!hhhhii!!hhhhii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhh!hhhhh!hhh!!hhhhhh!hhhhh!hhh!", "hhhhhhhhhhh!!", "hhi!!hhi!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhh!hhhhh!hhh!!hhhhhh!hhhhh!hhh!" + "'", str3, "hhhhhh!hhhhh!hhh!!hhhhhh!hhhhh!hhh!");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(62);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhhi!!", "hhhhhhi!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!hhhi!!hhhi!!i");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray9 = new char[] {};
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence8, charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!", charArray9);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray9, 0);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhi!!", charArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi", (java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!", "hhi", "hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!!hhhi!!!hhhi!!!!!hhhi!!!hhhi!!!hhhi!!!!!hhhi!!!hhhi!!!hhhi!!!!" + "'", str3, "hhhi!!!hhhi!!!hhhi!!!!!hhhi!!!hhhi!!!hhhi!!!!!hhhi!!!hhhi!!!hhhi!!!!");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i", "hhhhhi!", "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i" + "'", str3, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!!", "hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!!" + "'", str2, "i!!");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhii!!hhhhii!!hhhhii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhii!!hhhhii!!hhhhii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray3);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhh", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!", "hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!!" + "'", str2, "hhi!!");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(90, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) ' ', '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) strArray2, (int) (short) 1);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray2);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (byte) 0, 0);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, (java.lang.Object) strArray12, 10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) 31, (int) (byte) 10);
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!!hh!!hh!!i!");
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) "hh!!hh!!hh!!i!", 39);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 39, (-65));
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(9, 9, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!" + "'", str2, "hh!");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.CharSequence charSequence5 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence7, charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi", charArray8);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhi!", charArray8);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int[] intArray3 = new int[] { (-99) };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray3, (-39));
        java.lang.CharSequence charSequence10 = null;
        char[] charArray11 = new char[] {};
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence10, charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean17, 19);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-99]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh", (java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\000', (-11), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(35, 13, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhhi!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhi!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh!!hh!!hh!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hh!!hh!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhhhhhi!!hhhi!!hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhi!!hhhi!!hhhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-97), (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi!!hhhi!!hhhi!");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!hhhi!!hhhi!!i!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhhi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 3);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        java.lang.CharSequence charSequence9 = null;
        char[] charArray10 = new char[] {};
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence9, charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray10, (-62));
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", charArray10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hhhi!!hhhi!!hhhi!!", 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(6, (int) '#', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhh", charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(6, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 36");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hh!!hh!!i!", charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhi!!!!!!", "hhhi!!hhhi!!hhhi!!", "hhhi!!hhhi!!hhhi!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhi!!!!!!" + "'", str3, "hhhhhi!!!!!!");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-9), 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhi!!!hhhi!!!hhhi!!!!!hhhi!!!hhhi!!!hhhi!!!!!hhhi!!!hhhi!!!hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhii!!hhhhii!!hhhhii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhii!!hhhhii!!hhhhi" + "'", str1, "hhhhii!!hhhhii!!hhhhi");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhhhhh!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhii!!hhhhii!!hhhhii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh", (java.lang.CharSequence) "hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhi!!!", (java.lang.CharSequence) "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\000', ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-19), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(90, 9, 14);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) 'a');
        java.lang.Class<?> wildcardClass9 = strArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray6);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray6, (-97));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(19, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!hhhhhhhi!!!!hhhhhhhi!!!!hhhhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114 + "'", int1 == 114);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhii!!hhhhii!!hhhhii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhh!hhhhh!hhh!!hhhhhh!hhhhh!hhh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hh!!hh!!i!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhi!!hhhi!!hhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhi!!hhhi!!hhh!!hhhhi!!hhhi!!hhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

