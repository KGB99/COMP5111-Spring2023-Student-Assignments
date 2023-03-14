package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\000', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('4', '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        int int2 = comp5111.assignment.cut.Subject.NumberTasks.compare((byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(19, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\n', (-65), (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 0, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, (-101), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!!hh!!hh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(65, (int) '#', (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-90), (-42), (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhi!!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("h!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!!!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 45, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!", "hhi!!!", "hhhi!!hhhi!!hhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!" + "'", str3, "hhi!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!!", (java.lang.CharSequence) "hhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (byte) 10);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray8, 0);
        java.lang.Class<?> wildcardClass11 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhi!!hhi!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!!hhi!!i" + "'", str1, "hhi!!hhi!!i");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 100, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!!hh!!hh!!i!", "i!!", "hhhi!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!hh!!hh!!i!" + "'", str3, "hh!!hh!!hh!!i!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) -1, 999999999, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhi!!hhhi!!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!hhi!!i", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhhi!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(19, 7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(2, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhi!" + "'", str2, "hhhhhi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (byte) 10);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!");
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) (-10), (int) (short) 1);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray8);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray8, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh" + "'", str1, "hhhh");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-42), (-2), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh" + "'", str1, "hh");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!!", "hi!", "hhhhhi!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!!" + "'", str3, "i!!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!", "hhhi!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(29);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(16, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhi!!hhhi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hh" + "'", str1, "hhhi!!hhhi!!hh");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi!!" + "'", str1, "hhhhhhi!!");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(25, 7, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!!!", charArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!!!", "h!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhi" + "'", str2, "hhhhi");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-25), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhi!!", "hhhhi", "hhhhhhi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhi!!!!" + "'", str3, "hhhhhhi!!!!");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-42), 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhhi!!", "hhi!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhi!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhi!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "hhhhhhi!!", "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!!hhhi!!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi!!hhhi!!hhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhh", "hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhi!!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!!!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass11 = charArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 1, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 100, (-22), (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhhi!!", "hhi!!!", "hhhi!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhi!!" + "'", str3, "hhhhhhi!!");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi", (java.lang.CharSequence) "i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(65, 30, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 100, 31, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h!", (java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean7, (-9));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!hhi!!i", (java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!hhhi!!hhhi!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-39), (-90));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hhhi!!", "hhhi!!hhhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-10), (int) (short) 1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1L, (-62));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi!!" + "'", str1, "hhhhhhi!!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi!" + "'", str1, "hhhhhhi!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\n', 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!", "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\000', '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        char[] charArray8 = new char[] { ' ', '#' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(87, (-100), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int4, (-13));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi!!!!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!", (java.lang.CharSequence) "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhhi!", (java.lang.CharSequence) "hhhhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi" + "'", str1, "hhhhi");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 0, 35, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhhi!!hhhi!!hhhi!!", "hhhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!!", "hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!", "hi!!", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!" + "'", str3, "hhhi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(99, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(65, 8, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        int int2 = comp5111.assignment.cut.Subject.NumberTasks.compare((byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-84), (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        char[] charArray7 = new char[] { ' ', '#' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-13), 25, (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hh!!hh!!hh!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!!hh!!hh!!i!" + "'", str1, "hh!!hh!!hh!!i!");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-19));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i!", (java.lang.CharSequence) "hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-65), 99, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhhi!!!!", "hhi!!", "hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhh!!" + "'", str3, "hhhhhhhh!!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(32, (-10), 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh" + "'", str1, "hh");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\r', '\000');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhi!!hhhi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!hhhi!!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!!hh!!hh!!i!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hh! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '4', (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 0, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhh" + "'", str1, "hhhhh");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-1), (-101), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhi!!hhhi!!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhhhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!!hh!!hh!!i!", (java.lang.CharSequence) "hhhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi!" + "'", str1, "hhhhhhi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 10, 0, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 10);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 31, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!", "hhhi!!hhhi!!hhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '#', 31, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: i!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hh!!hh!!hh!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!!hh!!hh!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) -1, 87, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!", (java.lang.CharSequence) "hhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) -1, 25, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhi!!!!" + "'", str1, "hhhhi!!!!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.lang.Object[] objArray0 = null;
        char[] charArray2 = new char[] { '\000' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray2, (-84));
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\000]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhhi!", (java.lang.CharSequence) "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) '\n');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhi!!hhi!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-13));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!!", charArray4);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hh!!hh!!hh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhhhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i", charArray7);
        java.lang.Class<?> wildcardClass17 = charArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", (java.lang.CharSequence) "hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(10, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi!" + "'", str1, "hhhhhhi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] { '4', '\n' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(18, 87, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!!!", (java.lang.CharSequence) "hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) strArray2, (int) (short) 1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) (short) 0, (int) '\r');
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) 22, 3);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) 22, (int) ' ');
        java.lang.Class<?> wildcardClass15 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!hhi!!i", "hhhi!!hhhi!!hhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi", "hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi" + "'", str2, "hhi");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!hhi!!i", (java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!!hh!!hh!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!", charArray4);
        java.lang.Class<?> wildcardClass11 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-42), (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhh", (java.lang.CharSequence) "hhhhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhhi!!", (java.lang.CharSequence) "hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 10);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 31, (int) (byte) 10);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!!hh!!hh!!i!");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hh!!hh!!hh!!i!", 39);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhi!!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 16, 11);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-87), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(22, (int) 'a', 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 10, (-3), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhi!!!", (java.lang.CharSequence) "hhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!", "hhhi!!hhhi!!hhhi!!i!", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!" + "'", str3, "hh!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 5, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-62), 18, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhi!!hhi!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhi!!hhi!!i is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi", (java.lang.CharSequence) "hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhhi!!", "hhhi!!", "hhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhh!!" + "'", str3, "hhhhhhhhhhh!!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(10, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-2), 25, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!" + "'", str1, "hhhi!!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhi!!hhi!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!hhi!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhi!!hhhi!!hhhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhhhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!hhi!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhi!!", "hhhi!!", "hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhi" + "'", str3, "hhhhhhi");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-11));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!hhi!!i!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\r', '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-19), (-101), 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(19, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!hhi!!i!", "hhi!!hhi!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(31, 65, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i", (java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhhi!!!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhhhhh!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!i", "hhhi", "hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i" + "'", str3, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi", "hhhh", "hhhhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi" + "'", str3, "hhhi");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(22, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhhi!!hhhi!!hhhi!!i!", "hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!", "hhhhhhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhi!!", "hh!!hh!!hh!!i!", "hhhhhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhi!!" + "'", str3, "hhhhi!!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hhhhh", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(20, 9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(99, (-90), 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!!hhi!!i", "hhi!!", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi" + "'", str3, "hhi");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-10), (int) (short) 1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhi!!hhhi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!hhhi!!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(9, (int) (byte) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhi!!hhhi!!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 100, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '\r', '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-17), 30, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhh", "hhhhhhi!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 10, 31, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) ' ', '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhhi!", "hhhhi!!", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhi!" + "'", str3, "hhhhhhi!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!hhi!!i", (java.lang.CharSequence) "hhhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(1, 19, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhhhi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhi!!!!" + "'", str1, "hhhhhhi!!!!");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!", "hhi!!hhi!!i!", "hi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!" + "'", str3, "hi!!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(39, (int) (short) 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh", "hhhh", "hhhhhhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhi!" + "'", str3, "hhhhhhi!");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!i!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhh" + "'", str1, "hhh");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi!!hhi!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!hhi!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhhi!", "hhi!!hhi!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 90, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(32, (int) (short) 10, 16);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\000', (-11), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhi!", "hhhhhi!!", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhi!" + "'", str3, "hhhhhi!");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray2);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, (-84), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhhi", "hhhi!!hhhi!!hhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhh!!" + "'", str1, "hhhhhhhhhhh!!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(3, 0, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 10, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) '#', 999999999);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi!!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 62);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray10, (-62));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-13), 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) 'a');
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray10, 45);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!", "hhhi", "hhhi!!hhhi!!hhhi!!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!" + "'", str3, "hi!!");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhh", "hhhi!!hhhi!!hhhi!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray2);
        java.lang.Class<?> wildcardClass7 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!!", "hhhi!!hhhi!!hhhi!!i!", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!!" + "'", str3, "hhi!!");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!hhi!!i", "hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!!hhi!!" + "'", str2, "hhi!!hhi!!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhhhi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-11), 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\n', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!", "hhhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray5, 10);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int7, 4);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray11, (-101));
        char[] charArray18 = new char[] { ' ', '#' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray18);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) int21, (-3));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , #]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!hhi!!i", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!!", "hhhi!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhh", charArray2);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray2);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!!hhhi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi!!hhhi!!hh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(19, (-13), 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhi", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(19, 25, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-84), 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean15);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(20, 22, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!!", (java.lang.CharSequence) "hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhh", "hh!!hh!!hh!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhi!!hhi!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhhhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhi!!!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(101);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-2), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(87, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi!!hhhi!!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-2), (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi!!!");
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
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int21, (-22));
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "h!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-22), (-2), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!" + "'", str1, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = new char[] {};
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence7, charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray8, (-62));
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhi!!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhi!!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhhhhhhhh!!", charArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhi!!hhhi!!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int[] intArray6 = new int[] { 97, 9, (-3), 11, (-101), (-22) };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 9, -3, 11, -101, -22]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi", "hhhi!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!!!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhi!!hhhi!!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        java.lang.String[] strArray33 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) strArray33, 0);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) int35, (int) '\r');
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhhhhhhhh!!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi!!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!", "hhhhi!!", "hhhhhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!" + "'", str3, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '#', 90, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!hhi!!i", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhi!!!!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(31, (-97), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-97), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!" + "'", str1, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhhhhh!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhhi!!!", (java.lang.CharSequence) "hhhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhh", (java.lang.CharSequence) "hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhi!!hhhi!!hhh", "hhhhhi!", "hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhi!!hhhi!!hhh" + "'", str3, "hhhi!!hhhi!!hhh");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi", (java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhi!!", "hhhi", "hhhhi!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhi!!!!!!" + "'", str3, "hhhhhi!!!!!!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-3), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhhi!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhi!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, 0, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhi!!hhi!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!hhi!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhh!!" + "'", str1, "hhhhhhhh!!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-1), (-101), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhhi!!hhhi!!hhh", "hhhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\000', 97, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\n', 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-84), 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hhhhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 100, 19, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-999999999), (-42), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(30, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhi!!!!!!", "i", "hhhhi!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhi!!!!!!!!!" + "'", str3, "hhhhhhhhhi!!!!!!!!!");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-90), (-87), (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", (java.lang.CharSequence) "hhhhhhhhhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(45, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhi!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!!hhi!!" + "'", str1, "hhi!!hhi!!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhi!!!", "i", "hhhi!!hhhi!!hhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhi!!hhhi!!hhhi!!!" + "'", str3, "hhhhhhhhi!!hhhi!!hhhi!!!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhhi!", "hhh", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!" + "'", str3, "hi!hhi!");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 100, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-999999999), (int) '\000', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!!hh!!hh!!i!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(42);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhhi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = new char[] {};
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass7 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!hhi!!", "hhhi!!hhhi!!hhhi!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(90);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!hhi!!i!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) strArray2, (int) (short) 1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 999999999, 6);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(11, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '4', (-2), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\000', '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhh", (java.lang.CharSequence) "hhhi!!hhhi!!hhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhhi!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(7, (int) 'a', (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhhhi!!");
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray19, 84);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!hhhi!!hhh", (java.lang.CharSequence) "hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(25, (int) (short) 0, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(99, (int) '\n', (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhi!!", (java.lang.CharSequence) "hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhhi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhh!" + "'", str1, "hhhhhhhhhhh!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhhhi!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-90), 29, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhi!!hhhi!!hh", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhi!!hhi!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-45), (-17), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi!!hhi!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray7, (-62));
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray7);
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
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.lang.Object[] objArray0 = null;
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) "hhhhhhhhhi!!!!!!!!!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '4', (int) (short) 1, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.lang.Object[] objArray0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhh", charArray3);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray3, 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!!", (java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i" + "'", str1, "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(29, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhi!!!!", (java.lang.CharSequence) "hhhhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi!!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhi!!!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhhi!!!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        char char2 = comp5111.assignment.cut.Subject.CharTasks.toChar((java.lang.Character) '#', '\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhhhi!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray5);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean10, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-25), 11, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhi!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhi!!hhi!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!", (java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhi!!hhi!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhh", "hhhhi!!!", "hhhhhhhhhhh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhh" + "'", str3, "hhhhh");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(65, 16, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!hhhi!!hhhi!!hhhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i", (java.lang.CharSequence) "hhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) '#', 999999999);
        java.lang.CharSequence charSequence11 = null;
        char[] charArray12 = new char[] {};
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) "h", 4);
        java.lang.Class<?> wildcardClass21 = strArray5.getClass();
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) wildcardClass21, 5);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass21, (int) (byte) 0);
        int[] intArray31 = new int[] { 'a', 32, '\n', 9, (-99) };
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean36 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray31);
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean38, (int) '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
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
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[97, 32, 10, 9, -99]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhi!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhi!!hhhi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhi!!", "hhhhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhhhhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int int2 = comp5111.assignment.cut.Subject.CharTasks.compare('\000', '\000');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhi!!!!", "hhhi!!!!", "hhhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhi!" + "'", str3, "hhhhi!");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!!", "hhhi!!hhhi!!hhh", "hhhi!!hhhi!!hhhi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!!" + "'", str3, "hhi!!");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) (byte) -1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!!!");
        int[] intArray8 = new int[] { (short) 100 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) intArray8, 11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 20);
        java.lang.String[] strArray20 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhi!!");
        java.lang.Class<?> wildcardClass21 = strArray20.getClass();
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) strArray20, (int) (byte) 10);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray20, (java.lang.Object) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!", "hhhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}

