package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-99), 101, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 80");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(79, (int) (byte) 0, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhi!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(11, 6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hhh", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str2, "hh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(84, 39, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hh!hhhh!hhh!hhhh!h!hh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!hhhh!hhh!hhhh!h!hh!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\r', (-2), 109);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i" + "'", str1, "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) false, (-1));
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi");
        char[] charArray16 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray16);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "i", 54);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int25, 30);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray17, (-62));
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-97), 193);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 193");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(113);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(52, 9, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 1.0f, 3);
        int[] intArray10 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) intArray10, 31);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray10, (int) (short) 10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-25), (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(30, (-11), (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        int[] intArray8 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray8, 31);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(90, (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-13), 54, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray13);
        java.lang.Class<?> wildcardClass20 = charArray13.getClass();
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass20, 4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 0, 6, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhi!!", 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-2), 54, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(52, (-90), 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-20), (int) '\n', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "h", 100);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj9 = null;
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, obj9, (int) '\n');
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray22 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray22);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray22, 100);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray22);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (-9));
        java.lang.String[] strArray31 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        java.lang.Class<?> wildcardClass32 = strArray31.getClass();
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray31, (int) (short) -1);
        char[] charArray43 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray43);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray43);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray43);
        java.lang.Class<?> wildcardClass47 = charArray43.getClass();
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass47, (-87));
        java.lang.Class<?> wildcardClass50 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(39, (-62), (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 10, 189);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 189");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh", (java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-32), 28, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 28");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(57, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(62, 49, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(5, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) 'a', 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi" + "'", str2, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(79, (int) '\r', (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "i!", (-65));
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(39, (-13), (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-9), 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi" + "'", str1, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(100, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        char[] charArray13 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-1), 80);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-52), 56, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", (java.lang.CharSequence) "hhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) '\n');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray18 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray18, 100);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0 };
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray24, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) objArray24, (int) (byte) 100);
        char[] charArray38 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray38);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray38, 101);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray38);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray38);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray38);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '4', 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(3, 30, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '4', 45, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(49, 1, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray2 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks3 = new comp5111.assignment.cut.Subject.StringTasks();
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray2, (java.lang.Object) stringTasks3, (int) '\n');
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) stringTasks3, 22);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray19);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean25, 31);
        java.lang.CharSequence charSequence28 = null;
        char[] charArray38 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray38);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray38);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray38);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence28, charArray38);
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray38, 4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(83);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhi!", (java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(4, 100, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", "hhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        int[] intArray8 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray8, 31);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 90, 1);
        java.lang.Class<?> wildcardClass16 = strArray1.getClass();
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(90, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(54, 1, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) '\n');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray18 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray18, 100);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray18, (-62));
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray18);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(4, (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-100), (-10), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(190);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi" + "'", str3, "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 10, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", (java.lang.CharSequence) "hhihhi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "h", 100);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj11 = null;
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, obj11, (int) '\n');
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray24 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray24);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray24);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, (java.lang.Object) charArray24, 100);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray24);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", (-9));
        java.lang.String[] strArray33 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        java.lang.Class<?> wildcardClass34 = strArray33.getClass();
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray33, (int) (short) -1);
        char[] charArray45 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray45);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray45);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray45);
        java.lang.Class<?> wildcardClass49 = charArray45.getClass();
        int int51 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) wildcardClass49, (-87));
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-87), 84);
        char[] charArray63 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean64 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray63);
        boolean boolean65 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray63);
        boolean boolean66 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray63);
        boolean boolean67 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray63);
        boolean boolean68 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray63);
        boolean boolean69 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray63);
        boolean boolean70 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray63);
        java.lang.Class<?> wildcardClass71 = charArray63.getClass();
        int int73 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass71, 27);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(6, (-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, 110, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 110");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(149, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        char[] charArray9 = new char[] { ' ', '\000', 'a', '\n', '\r', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean10, (-20));
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, (java.lang.Object) 1.0f, 3);
        int[] intArray21 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray21);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray21);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, (java.lang.Object) intArray21, 31);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, (java.lang.Object) 90, 1);
        java.lang.Class<?> wildcardClass29 = strArray14.getClass();
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray14, (-52));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " \000a\n\r4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " \000a\n\r4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , \000, a, \n, \r, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 1, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(90, 97, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(28, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-35), (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(83, 0, 193);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass19, (-84));
        char[] charArray33 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray33);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray33);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray33);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray33);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhi!", charArray33);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhi!hhi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 'a', 0);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, obj8, (int) '\n');
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray21 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray21);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray21);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray21, 100);
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0 };
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray27, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) objArray27, (int) (byte) 100);
        char[] charArray41 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray41);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray41);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray41);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray41, 101);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) strArray7, (int) (byte) 100);
        java.lang.String[] strArray50 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.String[] strArray52 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray53 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks54 = new comp5111.assignment.cut.Subject.StringTasks();
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray53, (java.lang.Object) stringTasks54, (int) '\n');
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray52, (java.lang.Object) stringTasks54, 22);
        int int60 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) stringTasks54, 65);
        int int62 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) 65, 90);
        java.lang.String[] strArray64 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi");
        int int66 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) strArray64, 2);
        java.lang.String[] strArray69 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj70 = null;
        int int72 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, obj70, (int) '\n');
        int int75 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray83 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean84 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray83);
        boolean boolean85 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray83);
        int int87 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, (java.lang.Object) charArray83, 100);
        boolean boolean88 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray83);
        boolean boolean89 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray83);
        int int91 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray64, (java.lang.Object) charArray83, (-100));
        boolean boolean92 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray83);
        boolean boolean93 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray83);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(11, (-100), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 504 + "'", int1 == 504);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int[] intArray1 = new int[] { 3 };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[3]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!", "hhihhi!hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 30, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", "ii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh" + "'", str2, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh" + "'", str3, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 409 + "'", int1 == 409);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!hhhh!hhh!hhhh!h!hh!hhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str3, "hh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(27, 149, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 149");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", (java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        char[] charArray8 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", charArray17);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", (int) (short) -1);
        java.lang.String[] strArray28 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray28, (java.lang.Object) (-11), 52);
        char[] charArray43 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray43);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray43);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray43);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray43);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray43);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray43);
        int int51 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray28, (java.lang.Object) boolean49, 30);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) strArray28, 190);
        char[] charArray61 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean62 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray61);
        boolean boolean63 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray61);
        boolean boolean64 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray61);
        boolean boolean65 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray61);
        boolean boolean66 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray61);
        int int68 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) charArray61, 45);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int[] intArray6 = new int[] { (-52), '4', 3, (-99), (-3), 87 };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-52, 52, 3, -99, -3, 87]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(84, 62, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hh");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray13, 83);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(110, (-1), 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!hhhh!hhh!hhhh!h!hh!hhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str3, "hh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        comp5111.assignment.cut.Subject.GregorianTasks gregorianTasks0 = new comp5111.assignment.cut.Subject.GregorianTasks();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) gregorianTasks0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(57, 44, 193);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 193");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 410 + "'", int1 == 410);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-10), 39, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(28, 113, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 113");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", charArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-22), 193);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 193");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (byte) 10);
        java.lang.Object obj22 = null;
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj22, 62);
        java.lang.Object obj25 = null;
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj25, (-22));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(504);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) (byte) 10, (int) (byte) -1);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray19);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", charArray19);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", (int) (short) -1);
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) (-11), 52);
        char[] charArray45 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray45);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray45);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray45);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray45);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray45);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray45);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) boolean51, 30);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) strArray30, 190);
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray30, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi");
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray15, 3);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray15);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-20), (int) ' ', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray8, (int) (short) 1);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray23 = new char[] { ' ', '\000', 'a', '\n', '\r', '4' };
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray23);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) boolean24, 6);
        char[] charArray36 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray36);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray36);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray36);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) boolean40, (-11));
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-11), (-999999999));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " \000a\n\r4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " \000a\n\r4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , \000, a, \n, \r, 4]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!" + "'", str1, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int[] intArray8 = new int[] { '\000', 29, (short) 1 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) intArray8, (-65));
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 29, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) strArray6, 10);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, (java.lang.Object) 1.0f, 3);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) 1.0f, (int) 'a');
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", 111);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\n', 113);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 113");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(409);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(84, 109, (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 10, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 504");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray2);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", (java.lang.CharSequence) "hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-19), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) '\n');
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, 100);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(79, (int) '\n', 112);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 112");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", (java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(190, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(17, 190, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 190");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi" + "'", str2, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(50);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-20), 44, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 44");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass19, (-84));
        java.lang.Object obj22 = null;
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj22, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) '\n');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray18 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray18, 100);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0 };
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray24, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) objArray24, (int) (byte) 100);
        char[] charArray38 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray38);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray38, 101);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray38);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray38, 62);
        boolean boolean48 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        java.lang.Class<?> wildcardClass49 = charArray38.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray15);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hi!", (int) (byte) 10);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) strArray2, (-87));
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) strArray26, (-9));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-45));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(10, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray17, (-62));
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", "hhi!", "hh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray14, 0);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh", charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hh", charArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi" + "'", str2, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) '\n');
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, 100);
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0 };
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray21, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) objArray21, (int) (byte) 100);
        char[] charArray35 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray35);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray35, 101);
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        java.lang.Class<?> wildcardClass42 = charArray35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int43 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!hhhh!hhh!hhhh!h!hh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-2), (int) '\n', (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        char[] charArray8 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) charArray8, 409);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(79, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(31, 409, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(189, 47, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 47");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh" + "'", str1, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 'a', 0);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, obj8, (int) '\n');
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray21 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray21);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray21);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray21, 100);
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0 };
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray27, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) objArray27, (int) (byte) 100);
        char[] charArray41 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray41);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray41);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray41);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray41, 101);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) strArray7, (int) (byte) 100);
        java.lang.String[] strArray50 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.String[] strArray52 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray53 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks54 = new comp5111.assignment.cut.Subject.StringTasks();
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray53, (java.lang.Object) stringTasks54, (int) '\n');
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray52, (java.lang.Object) stringTasks54, 22);
        int int60 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) stringTasks54, 65);
        int int62 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) 65, 90);
        java.lang.String[] strArray64 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi");
        int int66 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) strArray64, 2);
        java.lang.String[] strArray69 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj70 = null;
        int int72 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, obj70, (int) '\n');
        int int75 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray83 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean84 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray83);
        boolean boolean85 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray83);
        int int87 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, (java.lang.Object) charArray83, 100);
        boolean boolean88 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray83);
        boolean boolean89 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray83);
        int int91 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray64, (java.lang.Object) charArray83, (-100));
        boolean boolean92 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray83);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(22, (int) (byte) -1, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-1), (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 62, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!hhhh!hhh!hhhh!h!hh!hhh");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray11, 35);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", (java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(189, 62, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(82, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-42), (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(101, (-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-39), 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-9), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi" + "'", str2, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", (java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(110, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi" + "'", str1, "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", "hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi" + "'", str3, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(28, 79, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!", charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (short) 1);
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0 };
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray6, (java.lang.Object) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray6, (java.lang.Object) strArray11, 10);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) "h", 100);
        java.lang.String[] strArray22 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj23 = null;
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray22, obj23, (int) '\n');
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray22, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray36 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray36);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray22, (java.lang.Object) charArray36, 100);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray36);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) "", (-9));
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray15);
        java.lang.String[] strArray46 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!");
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) strArray46, (-99));
        int int50 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray6, (java.lang.Object) (-99), (int) (byte) 1);
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 1, 87);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "h", 100);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj9 = null;
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, obj9, (int) '\n');
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray22 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray22);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray22, 100);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray22);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (-9));
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray32, (-99));
        java.lang.String[] strArray36 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray32, (java.lang.Object) strArray36, (-19));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) -1, 82, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 82");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!", (java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 35, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(25, (-999999999), 410);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 410");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, 22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\n', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 426 + "'", int1 == 426);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ii", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(40, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 47");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }
}

