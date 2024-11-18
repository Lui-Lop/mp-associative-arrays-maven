package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Your Name Here
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
  } // alwaysPass()

  @Test
  public void lopezLuisTest1() throws Exception {
    AssociativeArray<String, String> doubleUp = new AssociativeArray<String, String>();
    doubleUp.set("up", "up");
    assertEquals("up", doubleUp.get("up"), "Can update value of an already existing pair.");
    doubleUp.set("up", "New");
    assertEquals("New", doubleUp.get("up"), "Can update value of an already existing pair.");
    doubleUp.remove("up");
    doubleUp.set("up", "NEWER");
    assertEquals("NEWER", doubleUp.get("up"), "Can put a pair with the same key after removal.");
  } // testlopezLuisTest1()

  @Test
  public void lopezLuisTest2() throws Exception {
    AssociativeArray<Character, String> charString = new AssociativeArray<Character, String>();
    charString.set('a', "A String");
    charString.remove('a');
    assertEquals(0, charString.size(), "Can make an array empty");
    charString.set('b', "Fill");
    charString.set('c', "Another");
    assertEquals(2, charString.size(), "Can fill an array that's been emptied");
  } // testlopezLuisTest2()

  @Test
  public void lopezLuisEdge1() throws Exception {
    AssociativeArray<String, int[]> strArr = new AssociativeArray<String, int[]>();
    int[] orignal = {1, 3 , 5, 7};
    strArr.set("up", orignal);
    assertEquals(3, strArr.get("up")[1], "Can set a value in pair to be an array and access its elements");
    strArr.get("up")[1] = 21;
    assertEquals(21, strArr.get("up")[1], "Can update the array in a pair");
  } // testopezLuisEdge1
} // class TestsFromSam
