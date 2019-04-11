/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3_gofish;


import static deliverable3_gofish.Suit.Hearts;
import static deliverable3_gofish.Value.Four;
import static deliverable3_gofish.Value.Jack;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class GoFishPlayerTest {

 
    @Test
    public void testPickCardGood() {
        System.out.println("pickCardGood");
        Value val = Jack;
        Player target = new Player(){};
        Card c = new Card(Hearts,Jack);
        target.addCard(c);
        GoFishPlayer instance = new GoFishPlayer("computer"){};
        String expResult = instance.getName()+" took "+target.getName()+"'s "+c.getValue()+"s";
        String result = instance.pickCard(val, target);
        assertEquals(expResult, result);
    }
       @Test
    public void testPickCardBad() {
        System.out.println("pickCardBad");
        Value val = Jack;
        Player target = new Player(){};
        Card c = new Card(Hearts,Four);
        target.addCard(c);
        GoFishPlayer instance = new GoFishPlayer("computer"){};
        String expResult = null;
        String result = instance.pickCard(val, target);
        assertEquals(expResult, result);
    }
    
}
