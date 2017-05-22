package cs115;

/**
 * Assignment1a
 * Names: John Diaz & Jordan Wells
 * Date: May 22, 2017
 * Description: Connect 4
 * Instructor: Brother Masterson
 */
public class Main {

    public static void main(String[] args) {
	    ConnectFour cf = new ConnectFour();

	    cf.play('X', 0);
	    cf.play('X', 0);
	    cf.play('X', 0);
	    cf.play('X', 0);
	    cf.play('X', 0);
	    cf.play('X', 0);
	    cf.play('X', 1);
        cf.play('X', 1);
        cf.play('X', 1);
        cf.play('X', 1);
        cf.play('X', 1);
        cf.play('X', 1);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('X', 2);
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


        cf.printTable(cf.checkForWinner());


        System.out.println();
    }

}
