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

        cf.play('X', 0);
        cf.play('X', 0);
        cf.play('$', 0);
        cf.play('X', 0);
        cf.play('X', 0);
        cf.play('$', 0);
        assertEquals("X should be winning", 'N', cf.checkForWinner());

        cf.play('X', 1);
        cf.play('X', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('X', 1);
        assertEquals("Should be a tie", 'N', cf.checkForWinner());
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('$', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 3);
        cf.play('$', 3);
        cf.play('$', 3);
        assertEquals("I don't know", 'T', cf.checkForWinner());
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
        assertEquals("Should be a tie", 'T', cf.checkForWinner());

        cf.printTable();
    }

}