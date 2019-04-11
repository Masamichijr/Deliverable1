/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3_gofish;


import org.junit.Test;

/**
 *
 * @author owner
 */
public class DeckTest {
    
    @Test
    //tests to see if a deck is shuffled
    public void testShuffle() {
        System.out.println("ShuffleGood");
        Deck instance = new Deck();
        instance.Shuffle();
    }
     @Test
    public void testShuffleBad() {
        System.out.println("ShuffleBad");
        Deck instance = new Deck();
    }

  
    
}
