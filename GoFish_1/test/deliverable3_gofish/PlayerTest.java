/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3_gofish;


import static deliverable3_gofish.Suit.Hearts;
import static deliverable3_gofish.Value.Ace;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class PlayerTest {
    

    @Test
    public void testAddCardGood() {
        System.out.println("addCardGood");
        Card c = new Card(Hearts,Ace);
        Player instance = new Player() {};
        instance.addCard(c);
        
    }

    /**
     * Test of checkHandEmpty method, of class Player.
     */
    @Test
    public void testCheckHandEmptyBad() {
        System.out.println("checkHandEmptyGood");
        Player instance = new Player() {};
        Card c = new Card(Hearts,Ace);
        instance.addCard(c);
        Boolean expResult = false;
        Boolean result = instance.checkHandEmpty();
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testAddCardBad() {
        System.out.println("addCardBad");
        Card c = null;
        Player instance = new Player() {};
        instance.addCard(c);
        
    }

    /**
     * Test of checkHandEmpty method, of class Player.
     */
    @Test
    public void testCheckHandEmptyGood() {
        System.out.println("checkHandEmptyBad");
        Player instance = new Player() {};
        Boolean expResult = true;
        Boolean result = instance.checkHandEmpty();
        assertEquals(expResult, result);
        
    }
    }

