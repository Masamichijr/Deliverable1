/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3_gofish;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class GameTest {
    
    @Test
    //checks to see if one players books is greater then the others 
      public void testcheckGameOverGood(){
          System.out.println("testcheckGameOverGood");
          GoFishPlayer a = new GoFishPlayer(null);
          a.setBooks(3);
          GoFishPlayer b = new GoFishPlayer(null);
          b.setBooks(0);
          boolean expResult = true;
          boolean result = (a.getBooks() > b.getBooks());
          assertEquals(expResult, result);         
      }
        @Test
      public void testcheckGameOverBad(){
          System.out.println("testcheckGameOverBad");
          GoFishPlayer a = new GoFishPlayer(null);
          a.setBooks(3);
          GoFishPlayer b = new GoFishPlayer(null);
          b.setBooks(7);
          boolean expResult = false;
          boolean result = (a.getBooks() > b.getBooks());
          assertEquals(expResult, result);         
      }
        @Test
      public void testcheckGameOverBoundry(){
          System.out.println("testcheckGameOverBoundry");
          GoFishPlayer a = new GoFishPlayer(null);
          a.setBooks(7);
          GoFishPlayer b = new GoFishPlayer(null);
          b.setBooks(7);
          boolean expResult = false;
          boolean result = (a.getBooks() > b.getBooks());
          assertEquals(expResult, result);         
      }
   

   
}
