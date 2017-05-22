package cs115;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by icyhot on 17/05/2017.
 */
public class MainTest {
    @Test
    public void main() throws Exception {
        ConnectFour cf = new ConnectFour();
        char result;

        cf.play('X', 0);
        cf.play('X', 0);
        cf.play('$', 0);
        cf.play('X', 0);
        cf.play('X', 0);
        cf.play('$', 0);
        result = cf.checkForWinner();
        assertEquals("X should be winning", 'N', result);

        cf.play('X', 1);
        cf.play('X', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('X', 1);
        result = cf.checkForWinner();
        assertEquals("Should be a tie", 'N', result);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('$', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 3);
        cf.play('$', 3);
        cf.play('$', 3);
        result = cf.checkForWinner();
        assertEquals("I don't know", 'T', result);
        cf.play('X', 3);
        cf.play('X', 3);
        cf.play('X', 3);
        cf.play('X', 3);
        cf.play('X', 3);
        cf.play('X', 3);
        cf.play('X', 4);
        cf.play('X', 4);
        cf.play('X', 4);
        cf.play('X', 4);
        cf.play('X', 4);
        cf.play('X', 4);
        cf.play('X', 5);
        cf.play('X', 5);
        cf.play('X', 5);
        cf.play('X', 5);
        cf.play('X', 5);
        cf.play('X', 5);
        cf.play('X', 6);
        cf.play('X', 6);
        cf.play('X', 6);
        cf.play('X', 6);
        cf.play('X', 6);
        cf.play('X', 6);
        result = cf.checkForWinner();
        assertEquals("Should be a tie", 'T', result);

        cf.printTable(result);
    }

}