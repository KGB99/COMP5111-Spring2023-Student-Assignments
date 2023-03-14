package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!", (java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(17, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!h", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean13);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!hii!!" + "'", str1, "!!i!!!i!!!!hii!!");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) ' ');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int6, 13);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!!");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray10, 11);
        java.lang.Object obj13 = null;
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray10, obj13, (-11));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!i!!!!hii!!!i");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hi", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray6, (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-25), 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih", charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!!h", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "", (int) (short) 10);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (-19), (-20));
        char[] charArray19 = new char[] { '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray19);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray19, 710);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii", charArray19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(19, 214, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(101, 8, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-10));
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        char[] charArray19 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray19);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) boolean26, (-87));
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray8, 709);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!");
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass5 = charArray3.getClass();
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass5, 70);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray15, 10);
        char[] charArray22 = new char[] { '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray22);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray22);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray22);
        java.lang.Class<?> wildcardClass28 = charArray22.getClass();
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) wildcardClass28, 20);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) ' ', 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h", "hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(214, 68, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 68");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!hh", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!hh" + "'", str3, "hihi!!hh");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!", "!!i!!!i!!!!hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi", "!!i!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi" + "'", str3, "hihi!!!hi!!!hi");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, (-2), (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hi", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!!!h", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihi!!hhii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(62, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 700");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) -1, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(859, (-19), 214);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!", (java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(229, (int) (short) 100, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(260);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(2, 62, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '4', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hh" + "'", str1, "hihi!!hh");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(231, (int) (short) 1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        int[] intArray18 = new int[] { (-1), ' ', 10, (short) 10 };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) intArray18, 852);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray18);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 32, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hh", charArray5);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, 232);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 232");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(99, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihi!!hhii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!h", charArray7);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!" + "'", str1, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(42, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", "hii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 100, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!!i!!!i!!!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-97));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray9);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass21 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!!!hii!!!i", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", charArray8);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) ' ', (int) '#');
        java.lang.CharSequence charSequence8 = null;
        char[] charArray18 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence8, charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray18);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray18, (-84));
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(13, 84, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(99, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray11);
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
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), 227, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii", (java.lang.CharSequence) "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-20), 859, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 859");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        java.lang.Class<?> wildcardClass14 = charArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-11), 84, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-97), 213, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 213");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("!!i!!!i!!!!hii!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !!i!!!i!!!!hii!!!i! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!", "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!" + "'", str3, "hihii!!hii!");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "!!i!!!i!!!!hii!!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii", charArray5);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii" + "'", str1, "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", 222);
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray9, 214);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-90), 13, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 213");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) ' ', (int) '#');
        int[] intArray10 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean13, 100);
        char[] charArray17 = new char[] { '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, (int) (short) -1);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii", charArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(222, 0, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi", "hihi!!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(229, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(31, (-999999999), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-2), (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        char[] charArray5 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray7);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-13), 860, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 10.0d, (-20));
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj19 = null;
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray18, obj19, (int) ' ');
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) int21, 13);
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) "h", 62);
        int[] intArray31 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) intArray31, (int) (byte) -1);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray16);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray16, (-10));
        java.lang.Class<?> wildcardClass40 = strArray16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 10.0d, (-20));
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj19 = null;
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray18, obj19, (int) ' ');
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) int21, 13);
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) "h", 62);
        int[] intArray31 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) intArray31, (int) (byte) -1);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray16);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray16, (-10));
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", 29);
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!");
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray30, 709);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) 68, 6);
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) 100.0d, (-90));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!", "hihi!!hhii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", "!!i!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str2, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray10);
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
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(71, 8, 20);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-87), (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii", "!!i!!!i!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii" + "'", str3, "hihii!!hii");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(474, 232, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 68");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!hii!!!i!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", 42);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!", charArray3);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!!!i!!!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!");
        char[] charArray5 = new char[] { '4', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, 231);
        char[] charArray17 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean20, (int) '\n');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", "!!i!!!i!!!!h", "hihi!!!hi!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(851, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(219);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!hii!" + "'", str1, "!!i!!!i!!!!hii!");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!hh", charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        java.lang.Class<?> wildcardClass12 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(97, (-11), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(701, 0, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!", "!!i!!!i!!", "!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!" + "'", str3, "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), 42, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!hhii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!hhii is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii", (java.lang.CharSequence) "hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!" + "'", str1, "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(217, 859, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!!i!!!i!!!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, 227, 260);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 260");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int[] intArray7 = new int[] { (short) 1, 20, 71, 45, 71 };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray7);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray7, (-2));
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray7);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 20, 71, 45, 71]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        char[] charArray8 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        char[] charArray13 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!hh", charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hih" + "'", str1, "hih");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int[] intArray5 = new int[] { (-19), 62, (-10) };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray5, (int) (byte) 1);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-19, 62, -10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray5);
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
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
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
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(87, (-35), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(4, 11, 4);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-101), (-87), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih", "hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        int[] intArray6 = new int[] { ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass13, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii", charArray11);
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
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii", "hi", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!i" + "'", str3, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!i");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, 709);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 709");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!!", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!i!!!i!!!!hii!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(70, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!h", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hii!!");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean13, 5);
        java.lang.Class<?> wildcardClass16 = strArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray7);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        int[] intArray5 = new int[] { 71, (byte) 0, (-17), 19, 224 };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[71, 0, -17, 19, 224]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass16);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean15);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        // The following exception was thrown during execution in test generation
        try {
            int int38 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 22);
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
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray12, 71);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!i!!");
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
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int24, 999999999);
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!", "hihii!!hi", "hihii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!i!!" + "'", str3, "hihii!i!!");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!i!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(231);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(217, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(12, 217);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 217");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(222, 852, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!" + "'", str3, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(65, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        char[] charArray13 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean21, 708);
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray27 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj28 = null;
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray27, obj28, (int) ' ');
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, (java.lang.Object) int30, 13);
        java.lang.String[] strArray34 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, (java.lang.Object) "h", 62);
        int[] intArray40 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, (java.lang.Object) intArray40, (int) (byte) -1);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray40);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray40, 219);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), 17, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("!!i!!!i!!!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ! is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", (-32));
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!", "hihi!!!hi!!!hi!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!", "hihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!" + "'", str2, "!!");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hih", (java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", (int) (short) 10);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-19), (-20));
        char[] charArray20 = new char[] { '4' };
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray20);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray20);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray20, 710);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray20);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
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
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("!!i!!!i!!!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hii");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi", charArray10);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 227, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 227");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass12 = charArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        int[] intArray3 = new int[] { (-39) };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean7, 7);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        char[] charArray21 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray21);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray21);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray21);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray21);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray21);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray21);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) boolean27, 12);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 12, 221);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray16 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray16);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray16);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", charArray16);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!", charArray16);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray5, (-84));
        int[] intArray9 = new int[] { (-39) };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) boolean10, (int) ' ');
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj15 = null;
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, obj15, 10);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) 10, 97);
        comp5111.assignment.cut.Subject.StringTasks stringTasks20 = new comp5111.assignment.cut.Subject.StringTasks();
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) stringTasks20, (-100));
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks23 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray30 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray30);
        java.lang.Object[] objArray33 = new java.lang.Object[] { arrayTasks23, "hi!", 31 };
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) 20, 9);
        java.lang.String[] strArray38 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) strArray38, 10);
        char[] charArray49 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray49);
        boolean boolean51 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray49);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray49);
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray49);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) charArray49, 31);
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) objArray33, 9);
        int int59 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray5, 708);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 100, 31, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(232, 84, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        java.lang.String[] strArray23 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!!!", (-32));
        java.lang.String[] strArray27 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray30 = new char[] { '4' };
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray30);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray27, (java.lang.Object) charArray30, 20);
        java.lang.Object obj36 = new java.lang.Object();
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray27, obj36, 11);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj36, (-101));
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hi", charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-62), 474);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 474");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(15, 231, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 17);
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj6, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hihi!!hh", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!", 15);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i" + "'", str1, "!!i");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii", charArray8);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii", 39);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-32), 62, 217);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 217");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("!!i!!!i!!!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ! is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!h" + "'", str1, "hihi!!h");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 12, 25);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!!!i!!!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", "hihii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!" + "'", str3, "hihii!!hii!!");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        int[] intArray6 = new int[] { 30, 7, (-11), (short) -1, 'a', (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[30, 7, -11, -1, 97, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(227);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(214, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(999999999, 0, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-13));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi", "hihii!!hii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi" + "'", str3, "hihi!!!hi!!!hi");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!" + "'", str2, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!!", (java.lang.CharSequence) "!!i!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray6);
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
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!i!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray6);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hii!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        int[] intArray6 = new int[] { (-35), 0, 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean7, 31);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 39, 97);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-35, 0, 97, 32]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("!!i!!!i!!!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!hii!" + "'", str1, "!!i!!!i!!!!hii!");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
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
        java.lang.Class<?> wildcardClass24 = intArray18.getClass();
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray18, 851);
        char[] charArray36 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray36);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray36);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray36);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray36);
        java.lang.Class<?> wildcardClass42 = charArray36.getClass();
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray36, 0);
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!", "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!!!i!", "!", "!!i!!!i!!!!hii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!" + "'", str3, "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(99, (-99), 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", (java.lang.CharSequence) "hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-9), 708, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (byte) 1);
        int[] intArray6 = new int[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) wildcardClass8, 35);
        java.lang.CharSequence charSequence11 = null;
        char[] charArray19 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray19);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean22, (-42));
        java.lang.Class<?> wildcardClass25 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(860, (int) (byte) 1, 860);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 860");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) ' ');
        char[] charArray14 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        java.lang.Class<?> wildcardClass20 = charArray14.getClass();
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray14, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(260, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!" + "'", str1, "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(232, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(851);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!", "!!i!!!i", "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!" + "'", str3, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii!", charArray8);
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
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", "hihi!!!hi!!!h", "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", "hihi!!hh", "hihi!!!hi!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 712 + "'", int1 == 712);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        int[] intArray26 = new int[] { (-19), 62, (-10) };
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray26);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean27, (-25));
        char[] charArray39 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray39);
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray39);
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray39);
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray39);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray39);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean47, (-35));
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-19, 62, -10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", "!!i!!!i!!!!hii!!!i", "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 699 + "'", int1 == 699);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-97), 708, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 708");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!", charArray6);
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
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        char[] charArray2 = new char[] { '4' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi", "hii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi" + "'", str3, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!h", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) strArray17, (int) (byte) 1);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) (byte) 1, (int) ' ');
        java.lang.String[] strArray23 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj26 = null;
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, obj26, (int) ' ');
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) int28, 13);
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) "h", 62);
        int[] intArray38 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean39 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) intArray38, (int) (byte) -1);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) (byte) -1, 45);
        java.lang.Object obj46 = null;
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, obj46, (-99));
        java.lang.String[] strArray50 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray52 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj53 = null;
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray52, obj53, (int) ' ');
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) int55, 13);
        java.lang.String[] strArray59 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) "h", 62);
        int[] intArray65 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean66 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray65);
        boolean boolean67 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray65);
        boolean boolean68 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray65);
        int int70 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) intArray65, (int) (byte) -1);
        java.lang.String[] strArray72 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int74 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) "hi!!!", (-32));
        char[] charArray81 = new char[] { '4' };
        boolean boolean82 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray81);
        boolean boolean83 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray81);
        boolean boolean84 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray81);
        boolean boolean85 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray81);
        boolean boolean86 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray81);
        int int87 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray81);
        boolean boolean88 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray81);
        boolean boolean89 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray81);
        int int91 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) charArray81, (int) '\r');
        int int93 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) int91, 101);
        // The following exception was thrown during execution in test generation
        try {
            int int94 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[4]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }
}

