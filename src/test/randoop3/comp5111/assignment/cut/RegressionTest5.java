package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.Object[] objArray2 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence8, charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", charArray10);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray2, (java.lang.Object) charArray10, 710);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray10);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-99), (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-3), 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("!!i!!!i!!!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1L, 100);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hi");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hi", 7);
        int[] intArray13 = new int[] { (-1), ' ', 10, (short) 10 };
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray13, 214);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 32, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(708, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", "hii", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!" + "'", str3, "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 700 + "'", int1 == 700);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 260, 232);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 260");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-13), 3, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(220, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-35), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, (-39));
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks11 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray18 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        java.lang.Object[] objArray21 = new java.lang.Object[] { arrayTasks11, "hi!", 31 };
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray21, (java.lang.Object) 20, 9);
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray21, (java.lang.Object) strArray26, 10);
        char[] charArray36 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray36);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) boolean38, 101);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 101, (-97));
        int[] intArray45 = new int[] { '\000', '\r' };
        boolean boolean46 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray45);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray45, 16);
        java.lang.Class<?> wildcardClass49 = intArray45.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 13]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi" + "'", str1, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray9);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihi!!!hi!!!hi!!!", 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "!!i!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", (java.lang.CharSequence) "!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-3), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!", "hihi!!hhii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(708, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray14 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(1, 30, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '#', 0, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!h", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!", charArray9);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!" + "'", str1, "!!i!");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!hhii!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!", "hi!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!hhii!" + "'", str3, "hihi!!hhii!");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(8, 71, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 71");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!hhii!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) "hihi!!hhii!", (int) '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray6, 709);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(2, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(852, 229, 230);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 230");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!hhii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihi!!!hi!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-97), 7, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(42, 215);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 215");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "!!i!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("!!i!!!i!!!!hii!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '#', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii", "hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(859, 708, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 708");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!h", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-17), 90, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-42), (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        char[] charArray1 = new char[] {};
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(5, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!", "hii!!", "hii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!" + "'", str3, "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!hhi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 0, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(65, (-65), 233);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-25), 29, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(700, (int) (byte) 100, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-84));
        int[] intArray7 = new int[] { (-39) };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray7);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean8, (int) ' ');
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj13 = null;
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, obj13, 10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 10, 97);
        comp5111.assignment.cut.Subject.StringTasks stringTasks18 = new comp5111.assignment.cut.Subject.StringTasks();
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) stringTasks18, (-100));
        java.lang.Class<?> wildcardClass21 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!h", (java.lang.CharSequence) "hihii!!hii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi", (java.lang.CharSequence) "hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!h", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!", charArray8);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!", "!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi!!" + "'", str3, "hihi!!!hi!!!hi!!");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(15, 84, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(52, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihi!!hhii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks1 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        java.lang.Object[] objArray11 = new java.lang.Object[] { arrayTasks1, "hi!", 31 };
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) 20, 9);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) strArray16, 10);
        char[] charArray27 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray27);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray27);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray27);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray27);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) charArray27, 31);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) 230, 20);
        char[] charArray43 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray43);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) charArray43, 71);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi", charArray43);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        char[] charArray6 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (-97), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(39, (-20), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!hhii!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihi!!hhii!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!!hi!!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!", (java.lang.CharSequence) "hii!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 68 + "'", int1 == 68);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!", "hii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!" + "'", str2, "hihii!");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-20), 15, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(17, 68, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 68");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(99, (-100), 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, (-10), 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!" + "'", str2, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!hii!!!" + "'", str1, "!!i!!!i!!!!hii!!!");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-19));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.Object[] objArray0 = null;
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) (-35), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!hhii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi!!", (java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        char[] charArray18 = new char[] { '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray18);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray18, 710);
        java.lang.String[] strArray29 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!");
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!", 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi", "!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-17), 701, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 701");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-84));
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass16, (-22));
        java.lang.CharSequence charSequence20 = null;
        char[] charArray30 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray30);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray30);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray30);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray30);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence20, charArray30);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray30);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!!!", 9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(52, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!!" + "'", str3, "hi!!!");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "!!i!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks1 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        java.lang.Object[] objArray11 = new java.lang.Object[] { arrayTasks1, "hi!", 31 };
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) 20, 9);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) strArray16, 10);
        char[] charArray26 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray26);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray26);
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) boolean28, 101);
        char[] charArray43 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray43);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray43);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray43);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray43);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray43);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray43);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray43);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray43);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) charArray43, (int) '\000');
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!", charArray43);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "h", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!", (java.lang.CharSequence) "hihii!!hii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("!!i!!!i!!!!hii!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!", charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i", "!!i!!!i!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-19), 15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!!!", "hihi!!!hi!!!hi!!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!" + "'", str3, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!hii!!!i!" + "'", str1, "!!i!!!i!!!!hii!!!i!");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi", (java.lang.CharSequence) "!!i!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihi!!!hi!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(52, (-90), 710);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 710");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!" + "'", str1, "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(233, 10, 222);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 222");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        char[] charArray5 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii", charArray9);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "!!i!", "hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!!!i!!!!hii!!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", "!!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i!!!!hii!!!" + "'", str3, "!!i!!!i!!!!hii!!!");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi", "hihii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, 215, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!" + "'", str1, "hihii!!");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 219 + "'", int1 == 219);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hihii!!hii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih", (java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii", "!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!h" + "'", str2, "hihii!!h");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", (java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        char[] charArray2 = new char[] { '4' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(62, (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray7, (-39));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-39), (-84));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        char[] charArray2 = new char[] { '4' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii", (java.lang.CharSequence) "hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 860 + "'", int1 == 860);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihi!!!hi!!!h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray5, (-84));
        char[] charArray12 = new char[] { '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean17, (int) (short) 0);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (short) 0, 13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-101), (int) '\r', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(68);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        char[] charArray14 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(220, 708, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 708");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 1, 13, (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", "hihi!!hhi", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-52), 709, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 709");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray15, 10);
        char[] charArray25 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray25);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray25);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) boolean27, 101);
        char[] charArray42 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray42);
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray42);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray42);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray42);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray42);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray42);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray42);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray42);
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) charArray42, (int) '\000');
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks53 = new comp5111.assignment.cut.Subject.FilenameTasks();
        java.lang.Class<?> wildcardClass54 = filenameTasks53.getClass();
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) wildcardClass54, (int) (byte) 10);
        java.lang.Class<?> wildcardClass57 = strArray15.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) ' ');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int6, 13);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "h", 62);
        int[] intArray16 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray16);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray16, (int) (byte) -1);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(100, 12, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i", (java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(9, 97, 223);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 223");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!!!!hii!!!i!", (java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(30, 852, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 852");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!", (java.lang.CharSequence) "hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!" + "'", str1, "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!hhii!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!hhii!" + "'", str3, "hihi!!hhii!");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!!!hii!!!", "!!i!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!i!!!i!!!!h" + "'", str2, "!!i!!!i!!!!h");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!h");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!", "hi!!!", "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!" + "'", str3, "!!i!");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", "!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!", "!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(65);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 217 + "'", int1 == 217);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!", "hihi!!!hi!!!hi!", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("!!i!!!i!!!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, (-39));
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks11 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray18 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        java.lang.Object[] objArray21 = new java.lang.Object[] { arrayTasks11, "hi!", 31 };
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray21, (java.lang.Object) 20, 9);
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray21, (java.lang.Object) strArray26, 10);
        char[] charArray36 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray36);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) boolean38, 101);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 101, (-97));
        int[] intArray45 = new int[] { '\000', '\r' };
        boolean boolean46 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray45);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray45, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 13]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        int[] intArray2 = new int[] { '\000', '\r' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 13]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihi!!hhii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 1, 22, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(17, (-22), 229);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 229");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 260);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int[] intArray11 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray11);
        java.lang.Class<?> wildcardClass15 = intArray11.getClass();
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) intArray11, 97);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 97, (-97));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", "hihii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray3);
        java.lang.Class<?> wildcardClass11 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(14, (int) (byte) 100, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i!!!!hii!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 9, 215);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 215");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "!!i!!!i!!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!", (java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!!!i!!!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi!!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("!!i!!!i!!!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray14 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray14);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charSequence4, (-45));
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (short) -1, (-1));
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-1), (-39));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(97, (-32), 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(8, 4, 232);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 232");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.CharSequence charSequence7 = null;
        char[] charArray17 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray17);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray17, (-84));
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) strArray32, (-84));
        int[] intArray36 = new int[] { (-39) };
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray36);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray32, (java.lang.Object) boolean37, (int) ' ');
        java.lang.String[] strArray41 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj42 = null;
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray41, obj42, 10);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray32, (java.lang.Object) 10, 97);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int46, 84);
        java.lang.String[] strArray50 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!");
        char[] charArray56 = new char[] { '4' };
        boolean boolean57 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray56);
        boolean boolean58 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray56);
        boolean boolean59 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray56);
        boolean boolean60 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray56);
        boolean boolean61 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih", charArray56);
        int int63 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) charArray56, 859);
        int int65 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray56, 710);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!!i!!!i!!!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(215, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!hhii!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi", "hihi!!hhii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!" + "'", str3, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!", "hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, 0);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj7 = null;
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, obj7, (int) ' ');
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks12 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) filenameTasks12, (int) (short) 1);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) int14, (-84));
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "hi", (-10));
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int20, 0);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 100.0f, 30);
        java.lang.Class<?> wildcardClass26 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!" + "'", str1, "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hh", "!!i!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi!!hh" + "'", str2, "hihi!!hh");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi", "hi!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-35), 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str2, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        comp5111.assignment.cut.Subject.StringTasks stringTasks0 = new comp5111.assignment.cut.Subject.StringTasks();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) stringTasks0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 10, 69, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i!!!i!!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(97, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 71");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        int[] intArray10 = new int[] { '4', (-999999999), '#', 999999999, 9 };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray10);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int12, (int) (byte) 100);
        char[] charArray20 = new char[] { '4' };
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray20);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", charArray20);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[52, -999999999, 35, 999999999, 9]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!h", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-2), 219);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 219");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-84));
        int[] intArray7 = new int[] { (-39) };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray7);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean8, (int) ' ');
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj13 = null;
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, obj13, 10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 10, 97);
        comp5111.assignment.cut.Subject.StringTasks stringTasks18 = new comp5111.assignment.cut.Subject.StringTasks();
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) stringTasks18, (-100));
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks21 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray28 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray28);
        java.lang.Object[] objArray31 = new java.lang.Object[] { arrayTasks21, "hi!", 31 };
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray31, (java.lang.Object) 20, 9);
        java.lang.String[] strArray36 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray31, (java.lang.Object) strArray36, 10);
        char[] charArray47 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray47);
        boolean boolean49 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray47);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray47);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray47);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray31, (java.lang.Object) charArray47, 31);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) objArray31, 9);
        char[] charArray66 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean67 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray66);
        boolean boolean68 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray66);
        boolean boolean69 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray66);
        boolean boolean70 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray66);
        boolean boolean71 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray66);
        boolean boolean72 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray66);
        boolean boolean73 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray66);
        int int75 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean73, (-13));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray18 = new char[] { '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) charArray18, 20);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray15, 2);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) objArray10);
        java.lang.Class<?> wildcardClass27 = objArray10.getClass();
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) objArray10);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!hhi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!" + "'", str2, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihi!!!hi!!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hh", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(69, (-52), 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 475 + "'", int1 == 475);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 71");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) 'a', 29, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray12);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("!!i!!!i!!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii!", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(12, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hi", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi", "hihi!!!hi!!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hi" + "'", str3, "hihii!!hi");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-20), 35, 221);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihi!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 97, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hihii!", "hihii!!hii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(8, (-39), (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-45), 31, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "!!i!!!i!!!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!", "hii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!" + "'", str2, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!!h", "hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii!");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray5, 17);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int7, (-25));
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i!!!i!!!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi!!" + "'", str3, "hihi!!!hi!!!hi!!");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!" + "'", str1, "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, 10);
        java.lang.CharSequence charSequence7 = null;
        char[] charArray17 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray17);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean25, (-2));
        char[] charArray31 = new char[] { '4' };
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray31);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray31);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray31, 22);
        java.lang.String[] strArray39 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray39, (java.lang.Object) "hi", (-32));
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray39, (-22));
        // The following exception was thrown during execution in test generation
        try {
            int int45 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 9, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(859);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!!");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray12);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray12, 35);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 35, 1);
        java.lang.Class<?> wildcardClass21 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (-1.0d), 100L, (-1.0d), 1.0d, 10.0d };
        java.lang.Object obj9 = null;
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray8, obj9, 1);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray8, (java.lang.Object) (short) 10, 13);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        char[] charArray20 = new char[] { '4' };
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        char[] charArray26 = new char[] { '4' };
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray26);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray26);
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray26);
        java.lang.Object[] objArray32 = new java.lang.Object[] { strArray1, int14, strArray16, "", boolean21, boolean31 };
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray32, (java.lang.Object) (byte) 0, (int) (short) 10);
        char[] charArray45 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray45);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray45);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray45);
        boolean boolean49 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray45);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray45);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray45);
        boolean boolean52 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray45);
        int int54 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray32, (java.lang.Object) charArray45, 10);
        boolean boolean55 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray45);
        boolean boolean56 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray45);
        boolean boolean57 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray45);
        boolean boolean58 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray45);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[[], -1, [], , false, true]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!hhi", (java.lang.CharSequence) "!!i!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", (java.lang.CharSequence) "!!i!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, obj6, (int) ' ');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) int8, 13);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "h", 62);
        int[] intArray18 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) intArray18, (int) (byte) -1);
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hi!!!", (-32));
        char[] charArray34 = new char[] { '4' };
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray34);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray34);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray34);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray34);
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray34, (int) '\r');
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!", charArray34);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", charArray34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!", (java.lang.CharSequence) "!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.lang.Object[] objArray0 = null;
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!h", charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) boolean6, 220);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray14 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray14);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charSequence4, (-45));
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charSequence4, 7);
        java.lang.Class<?> wildcardClass25 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!!!i", "hihii!!hii", "!!i!!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i" + "'", str3, "!!i!!!i");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!h", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!", charArray9);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(852);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!!!h", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(223, (-52), 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(32, 0, 475);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!!!!h", (java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', (-1.0d), 100L, (-1.0d), 1.0d, 10.0d };
        java.lang.Object obj10 = null;
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray9, obj10, 1);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray9, (java.lang.Object) (short) 10, 13);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        char[] charArray21 = new char[] { '4' };
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray21);
        char[] charArray27 = new char[] { '4' };
        boolean boolean28 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray27);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray27);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray27);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray27);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray27);
        java.lang.Object[] objArray33 = new java.lang.Object[] { strArray2, int15, strArray17, "", boolean22, boolean32 };
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) (byte) 0, (int) (short) 10);
        char[] charArray46 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray46);
        boolean boolean48 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray46);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray46);
        boolean boolean50 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray46);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray46);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray46);
        boolean boolean53 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray46);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) charArray46, 10);
        boolean boolean56 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray46);
        boolean boolean57 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray46);
        boolean boolean58 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray46);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[[], -1, [], , false, true]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        char[] charArray2 = new char[] { '4' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!h", charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(233, 62, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        int[] intArray8 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean11, 100);
        char[] charArray15 = new char[] { '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, (int) (short) -1);
        int[] intArray19 = new int[] {};
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray19, (-45));
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean28 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray19);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", (java.lang.CharSequence) "!!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihii!!hii");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-25), (-87), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-52), 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(999999999, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!!!h", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "hihi!!!hi!!!hi!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(233, 0, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!", charArray12);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", "hi!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        java.lang.Class<?> wildcardClass18 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(42, (-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hii!!" + "'", str3, "hii!!");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("!!i!!!i!!!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        char[] charArray15 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!", charArray15);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-84));
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj10 = null;
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, obj10, (int) ' ');
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) int12, 13);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) "h", 62);
        int[] intArray22 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) intArray22, (int) (byte) -1);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) intArray22, (int) '#');
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!" + "'", str1, "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(475);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(12, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!" + "'", str1, "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int[] intArray4 = new int[] { (-1), ' ', 10, (short) 10 };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, (-39));
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) strArray14, (int) (byte) 1);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 1, (-45));
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 0L, 0);
        char[] charArray29 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray29);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray29);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean34, 5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ! is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-45), 11, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray7, (-39));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-39), (-84));
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!");
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass17, 213);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!!hi!!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray9, (-65));
        char[] charArray17 = new char[] { '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", (int) '\r');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hihi!!!hi!!!h", "!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(859, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        char[] charArray13 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!!!i!!!!h", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i!!!!h" + "'", str3, "!!i!!!i!!!!h");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-3), 217);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 217");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!!!!hii!!!", (java.lang.CharSequence) "hii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii" + "'", str1, "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-9), 859, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 859");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray5, 20);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!hhii", charArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(1, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(39, (-19), 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!h", "hihii!!hii", "hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!h" + "'", str3, "hi!!h");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-45), 999999999, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        char[] charArray6 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(69);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

