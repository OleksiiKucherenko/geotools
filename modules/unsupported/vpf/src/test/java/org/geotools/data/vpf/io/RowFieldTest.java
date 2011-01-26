/*
 * File is generated by 'Unit Tests Generator' developed under
 * 'Web Test Tools' project at http://sf.net/projects/wttools/
 * Copyright (C) 2001 "Artur Hefczyc" <kobit@users.sourceforge.net>
 * to all 'Web Test Tools' subprojects.
 *
 * No rigths to files and no responsibility for code generated
 * by this tool are belonged to author of 'unittestsgen' utility.
 *
 */
package org.geotools.data.vpf.io;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.geotools.data.vpf.ifc.DataTypesDefinition;

/**
 * File <code>RowFieldTest.java</code> is automaticaly generated by
 * 'unittestsgen' application. Code generator is created for java
 * sources and for 'junit' package by "Artur Hefczyc"
 * <kobit@users.sourceforge.net><br/>
 * You should fulfil test methods with proper code for testing
 * purpose. All methods where you should put your code are below and
 * their names starts with 'test'.<br/>
 * You can run unit tests in many ways, however prefered are:
 * <ul>
 *   <li>Run tests for one class only, for example for this class you
 *       can run tests with command:
 *     <pre>
 *       java -cp "jar/thisjarfile.jar;lib/junit.jar" org.geotools.vpf.RowFieldTest
 *     </pre>
 *   </li>
 *   <li>Run tests for all classes in one command call. Code generator
 *       creates also <code>TestAll.class</code> which runs all
 *       available tests:
 *     <pre>
 *       java -cp "jar/thisjarfile.jar;lib/junit.jar" TestAll
 *     </pre>
 *   </li>
 *   <li>But the most prefered way is to run all tests from
 *     <em>Ant</em> just after compilation process finished.<br/>
 *     To do it. You need:
 *     <ol>
 *       <li>Ant package from
 *         <a href="http://jakarta.apache.org/">Ant</a>
 *       </li>
 *       <li>JUnit package from
 *         <a href="http://www.junit.org/">JUnit</a>
 *       </li>
 *       <li>Put some code in your <code>build.xml</code> file
 *         to tell Ant how to test your package. Sample code for
 *         Ant's <code>build.xml</code> you can find in created file:
 *         <code>sample-junit-build.xml</code>. And remember to have
 *         <code>junit.jar</code> in CLASSPATH <b>before</b> you run Ant.
 *         To generate reports by ant you must have <code>xalan.jar</code>
 *         in your <code>ANT_HOME/lib/</code> directory.
 *       </li>
 *     </ol>
 *   </li>
 * </ul>
 * @source $URL$
 */
public class RowFieldTest extends TestCase
  implements DataTypesDefinition
{
  /**
   * Instance of tested class.
   */
  protected RowField varRowField;

  /**
   * Public constructor for creating testing class.
   */
  public RowFieldTest(String name) {
    super(name);
  } // end of RowFieldTest(String name)
  /**
   * This main method is used for run tests for this class only
   * from command line.
   */
  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  } // end of main(Stringp[] args)
  /**
   * This method is called every time before particular test execution.
   * It creates new instance of tested class and it can perform some more
   * actions which are necessary for performs tests.
   */
  protected void setUp() {
    // Initialize your variable(s) here
    // for example:
    // varRowField = new RowField(...);
    // But note that there is no default constructor in RowField
  } // end of setUp()
  /**
   * Returns all tests which should be performed for testing class.
   * By default it returns only name of testing class. Instance of this
   * is then created with its constructor.
   */
  public static Test suite() {
    return new TestSuite(RowFieldTest.class);
  } // end of suite()

  /**
   * Method for testing original source method:
   * double getAsDouble()
   * from tested class
   */
  public void testGetAsDouble() {
    double[] testVals = {Double.MAX_VALUE, Double.MIN_VALUE,
                         Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 0};
    for (int i = 0; i < testVals.length; i++)
    {
      varRowField = new RowField(new Double(testVals[i]), DATA_LONG_FLOAT);
      assertEquals("Test RowField for double value: "+testVals[i],
                   testVals[i], varRowField.doubleValue(), 0);
    } // end of for (int i = 0; i < testVals.length; i++)
  } // end of testGetAsDouble()

  /**
   * Method for testing original source method:
   * float getAsFloat()
   * from tested class
   */
  public void testGetAsFloat() {
    float[] testVals = {Float.MAX_VALUE, Float.MIN_VALUE,
                         Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0};
    for (int i = 0; i < testVals.length; i++)
    {
      varRowField = new RowField(new Float(testVals[i]), DATA_SHORT_FLOAT);
      assertEquals("Test RowField for float value: "+testVals[i],
                   testVals[i], varRowField.floatValue(), 0);
    } // end of for (int i = 0; i < testVals.length; i++)
  } // end of testGetAsFloat()

  /**
   * Method for testing original source method:
   * int getAsInt()
   * from tested class
   */
  public void testGetAsInt() {
    int[] testVals = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
    for (int i = 0; i < testVals.length; i++)
    {
      varRowField = new RowField(new Integer(testVals[i]), DATA_LONG_INTEGER);
      assertEquals("Testing RowField for integer value: "+testVals[i],
                   testVals[i], varRowField.intValue());
    } // end of for (int i = 0; i < testVals.length; i++)
  } // end of testGetAsInt()

  /**
   * Method for testing original source method:
   * long getAsLong()
   * from tested class
   */
  public void testGetAsLong() {
    long[] testVals = {Long.MAX_VALUE, Long.MIN_VALUE, 0};
    for (int i = 0; i < testVals.length; i++)
    {
      varRowField = new RowField(new Long(testVals[i]), DATA_LONG_INTEGER);
      assertEquals("Testing RowField for long value: "+testVals[i],
                   testVals[i], varRowField.longValue());
    } // end of for (int i = 0; i < testVals.length; i++)
  } // end of testGetAsLong()

  /**
   * Method for testing original source method:
   * short getAsShort()
   * from tested class
   */
  public void testGetAsShort() {
    short[] testVals = {Short.MAX_VALUE, Short.MIN_VALUE, 0};
    for (int i = 0; i < testVals.length; i++)
    {
      varRowField = new RowField(new Short(testVals[i]), DATA_SHORT_INTEGER);
      assertEquals("Testing RowField for short value: "+testVals[i],
                   testVals[i], varRowField.shortValue());
    } // end of for (int i = 0; i < testVals.length; i++)
  } // end of testGetAsShort()

  /**
   * Method for testing original source method:
   * java.lang.String getAsString()
   * from tested class
   */
  public void testGetAsString() {
    String[] testVals = {null, "" }; //, "\0", "\n", "                       " };
    for (int i = 0; i < testVals.length; i++)
    {
      varRowField = new RowField(testVals[i], DATA_TEXT);
      assertEquals("Testing RowField for String value: "+testVals[i],
                   testVals[i], varRowField.toString());
    } // end of for (int i = 0; i < testVals.length; i++)
  } // end of testGetAsString()

  public static final char[] TEST_TYPES =
  {
    DATA_TEXT, DATA_LEVEL1_TEXT,
    DATA_LEVEL2_TEXT, DATA_LEVEL3_TEXT,
    DATA_SHORT_FLOAT,
    DATA_LONG_FLOAT,
    DATA_SHORT_INTEGER,
    DATA_LONG_INTEGER,
    DATA_2_COORD_F,
    DATA_2_COORD_R,
    DATA_3_COORD_F,
    DATA_3_COORD_R,
    DATA_DATE_TIME,
    DATA_NULL_FIELD,
    DATA_TRIPLET_ID,
  };

  /**
   * Method for testing original source method:
   * char getType()
   * from tested class
   */
  public void testGetType() {
    for (int i = 0; i < TEST_TYPES.length; i++)
    {
      assertEquals("Cheking type "+TEST_TYPES[i],
                   TEST_TYPES[i],
                   new RowField("1", TEST_TYPES[i]).getType());
    } // end of for (int i = 0; i < TEST_TYPES.length; i++)
  } // end of testGetType()

  /**
   * Method for testing original source method:
   * java.lang.Object getValue()
   * from tested class
   */
  public void testGetValue() {
    String value = "1";
    assertSame("Cheking value.",
               value, new RowField(value, DATA_TEXT).getValue());
  } // end of testGetValue()

} // end of RowFieldTest
