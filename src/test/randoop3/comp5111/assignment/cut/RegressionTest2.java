package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii" + "'", str1, "hihii!!hii");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) -1, 62, (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!!", (java.lang.CharSequence) "hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray4, 20);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(10, (-100), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!!", (java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) ' ', 99, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-90), 7, (int) (short) 10);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(90, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi!!!hi!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(62, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 229 + "'", int1 == 229);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(101, 17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!!hi!!!hi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (-20));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihi!!!hi!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(17, 29, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", (java.lang.CharSequence) "hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "hi!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "h", "hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!hi!!", "hii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi!!!hi!!!hi!!" + "'", str2, "hihi!!!hi!!!hi!!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", "!!i!!!i!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str2, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", "hihii!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi!!!" + "'", str3, "hihi!!!hi!!!hi!!!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (int) '\000', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(10, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hi" + "'", str1, "hihii!!hi");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(229, 45, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\000', 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-97) + "'", int2 == (-97));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-2));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(65, (-1), (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) ' ');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks7 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) filenameTasks7, (int) (short) 1);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int9, (-84));
        java.lang.Class<?> wildcardClass12 = strArray1.getClass();
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 1, (-25), 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(6, 229, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-20), (-99), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!!i!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!h", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
            int int31 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int30);
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 71 + "'", int1 == 71);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihi!!!hi!!!hi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!h" + "'", str1, "hihii!!h");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!" + "'", str1, "hihii!!hii!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i", "hihii!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!!i!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!" + "'", str1, "!!i!!!i!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, (-39));
        char[] charArray14 = new char[] { '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean18, 100);
        java.lang.String[] strArray22 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj23 = null;
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray22, obj23, (int) ' ');
        java.lang.Class<?> wildcardClass26 = strArray22.getClass();
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray22, 9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(7, (-101), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!!hi!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!!hi!!!hi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, 100, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("!!i!!!i!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!" + "'", str1, "!!i!!!i!!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!!hi!!!hi!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\n', (-22), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-20), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hii!", "hi!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!", "hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii", "hi!!!", "hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hii" + "'", str3, "hii");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray7);
        java.lang.Class<?> wildcardClass17 = charArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-101), 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\000', 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!" + "'", str1, "hihii!!hii!!");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i" + "'", str1, "!!i!!!i");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 710 + "'", int1 == 710);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i", charArray6);
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
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hi!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!h" + "'", str1, "hihii!!h");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii!!", (java.lang.CharSequence) "hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '4', 3, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(29, (-42), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii", (java.lang.CharSequence) "hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "!!i!!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, (int) (short) 10, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(71);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-10), 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 709 + "'", int1 == 709);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-101), (int) (byte) -1, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!!!", "hihi!!!hi!!!hi!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 90, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(8, 229);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 229");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "!!i!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("!!i!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!!hi!!!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihi!!!hi!!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!!hi!!!hi!!" + "'", str1, "hihi!!!hi!!!hi!!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        // The following exception was thrown during execution in test generation
        try {
            int int56 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", (java.lang.CharSequence) "!!i!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-1), 709, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 709");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihi!!!hi!!!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-1), (-20), (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!!hi!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(12, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\r', 101, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!!hi!!!hi!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-1), 7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihii!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", "!!i!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h" + "'", str2, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(35, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii!!", (java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.Object obj26 = null;
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, obj26, 29);
        char[] charArray33 = new char[] { '4' };
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray33);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray33);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray33);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) boolean39, 3);
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
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass13 = charArray5.getClass();
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hii!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!hi!", "hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\n', '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        java.lang.Class<?> wildcardClass14 = charArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", (java.lang.CharSequence) "hii!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "!!i!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\n', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi!!!hi!!!hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        java.lang.Object obj26 = null;
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, obj26, 29);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 29);
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
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(9, 29, 709);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 709");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!h", "hii", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!h" + "'", str3, "hi!!h");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-3), 3, 710);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 710");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(4, (-45), 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(30, 709, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 709");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-999999999), 999999999, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-19), (int) '\r', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\000', '\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, (-39));
        char[] charArray14 = new char[] { '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean18, 100);
        java.lang.Class<?> wildcardClass21 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\r', '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("!!i!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(62, (int) (byte) 0, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 9, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!!hi!!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!!hi!!!hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('#', '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-35), (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, (-19), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-42), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi!", (java.lang.CharSequence) "hi!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("!!i!!!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(35, (int) (short) 0, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!hi!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi!", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(101, (int) '\r', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-20), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) ' ', '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", (java.lang.CharSequence) "hihii!!hii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii", charArray6);
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
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        int int2 = comp5111.assignment.cut.Subject.NumberTasks.compare((byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hi", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!h", charArray5);
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!h", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hi" + "'", str1, "hihii!!hi");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 214 + "'", int1 == 214);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(7, 100, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!", (java.lang.CharSequence) "hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('4', '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int[] intArray1 = new int[] { (-39) };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h", "hihii!!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii" + "'", str1, "hihii!!hii");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("!!i!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("!!i!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\n', ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!", "hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 100, 709);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 709");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!!h", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!" + "'", str2, "hi!!");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi", (java.lang.CharSequence) "hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\000', '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(45, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!!!hi!!!hi!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i", (java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) ' ', (int) '#');
        int[] intArray9 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) boolean12, 100);
        char[] charArray16 = new char[] { '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray16, (int) (short) -1);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray16);
        java.lang.Class<?> wildcardClass23 = charArray16.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, (-42), 214);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
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
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hi!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!h" + "'", str1, "hi!!h");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 100, 12, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '#', '\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii", "hihii!!hii!", "hii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii" + "'", str3, "hihii!!hii");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(29, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(16, 6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\n', '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!", "hihi!!!hi!!!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(101, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 701 + "'", int1 == 701);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi", (java.lang.CharSequence) "hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!");
        comp5111.assignment.cut.Subject.NumberTasks numberTasks2 = new comp5111.assignment.cut.Subject.NumberTasks();
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) numberTasks2, 100);
        java.lang.Class<?> wildcardClass5 = numberTasks2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 231 + "'", int1 == 231);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-101), (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 100, (int) (short) 1, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(15, (-20), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        java.lang.Class<?> wildcardClass28 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) strArray17, (int) (byte) 1);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass22 = objArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii!", (java.lang.CharSequence) "!!i!!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!", (java.lang.CharSequence) "hi!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i" + "'", str1, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), 231, (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\000', 22, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(71, 214, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 214");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(45);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 71, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihi!!!hi!!!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi", (java.lang.CharSequence) "hii!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) "hii!", 62);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '#', '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(25, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!!!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!h", "hii!!", "hi!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!h" + "'", str3, "hi!!h");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-90), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("!!i!!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!" + "'", str1, "!!i!!!i!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) ' ');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks7 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) filenameTasks7, (int) (short) 1);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int9, (-84));
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", (-10));
        char[] charArray20 = new char[] { '4' };
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray20);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean25, (-52));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!!i!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass17, 30);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", "hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii" + "'", str1, "hihii!!hii");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!!!i", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i" + "'", str3, "!!i!!!i");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!", "hii!!", "hi!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!hhii!" + "'", str3, "hihi!!hhii!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(214);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "!!i!!!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i!!" + "'", str3, "!!i!!!i!!");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("!!i!!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!" + "'", str1, "!!i!!!i!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!!h", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!" + "'", str2, "hi!!");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        int[] intArray4 = new int[] { (-1), ' ', 10, (short) 10 };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!!hi!!!hi!", (java.lang.CharSequence) "hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!", "hi!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        char[] charArray4 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass6 = charArray4.getClass();
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, 5, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi!!hhii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 230 + "'", int1 == 230);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihi!!!hi!!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str2, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-9), (-2), 231);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!" + "'", str1, "!!i!!!");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(710, 39, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(65, 30, 229);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        java.lang.Class<?> wildcardClass21 = stringTasks18.getClass();
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(45, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!h" + "'", str1, "hihii!!h");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!i!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '4', '\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-1), 101, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(12, (int) '\000', (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '#', (-35), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hi!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!hhii!", (java.lang.CharSequence) "hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-99), (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare(' ', '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hii!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(214, 11, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-2), (int) (short) 100, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-90), 35, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!" + "'", str3, "hihii!!hii!!");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-84), 19, 709);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihi!!!hi!!!hi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str2, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii" + "'", str2, "hihii!!hii");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        java.lang.String[] strArray23 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        char[] charArray32 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray32);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray32);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray32);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray32);
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) "hi!", (int) (short) 100);
        char[] charArray43 = new char[] { '4' };
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray43);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray43);
        boolean boolean46 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray43);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray43);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray43);
        int int50 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) boolean48, 0);
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int50, 999999999);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[4]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(16, 15, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!h", (java.lang.CharSequence) "!!i!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-39), 16, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.Class<?> wildcardClass21 = charArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray3);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

