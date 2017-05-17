package cs115;

public class Main {

    public static void main(String[] args) {
	    ConnectFour cf = new ConnectFour();

	    cf.play('$', 0);
	    cf.play('$', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('X', 1);
        cf.play('$', 1);
        cf.play('$', 1);
        cf.play('$', 2);
        cf.play('X', 2);
        cf.play('$', 2);
        cf.play('X', 2);
        cf.play('X', 2);
        cf.play('$', 2);
        cf.play('$', 3);
        cf.play('$', 4);
        cf.play('X', 3);
        cf.play('X', 4);
        cf.play('X', 5);
        cf.play('X', 5);
        cf.play('$', 3);
        cf.play('X', 3);

        cf.printTable();

        cf.checkForWinner();
        System.out.println();
    }


}
