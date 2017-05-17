package cs115;

import org.junit.Test;

/**
 * Created by icyhot on 15/05/2017.
 */
public class ConnectFour {

    private char[][] board;
    char result;

    public ConnectFour() {
        board = new char[6][7];

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                board[row][col] = '-';
            }
        }
        System.out.println();
    }

    public void play(char choice, int col) {
        //if col is valid
        if (col <= board[0].length-1 && col >= 0) {
            for(int row = board.length-1; row >= 0; row--) {
                if(board[row][col] == '-') {
                    board[row][col] = choice;
                    break;
                }
            }
        }
    }

    public char checkForWinner() {
        char VResult = checkVertical();
        char HResult = checkHorizontal();
        char DResult = checkDiagonal();
        result = ' ';

//        System.out.printf("VResult: %s%n", VResult);
//        System.out.printf("HResult: %s%n", HResult);
//        System.out.printf("DResult: %s%n", DResult);


        if(VResult == 'N' && HResult == 'N' && DResult == 'N')
            result = 'N';
        else if(VResult == 'T' || HResult == 'T' || DResult == 'T')
            result = 'T';
        else if(VResult != 'T' && VResult != 'N') {
            if(HResult != 'T' && HResult != 'N' && HResult != VResult)
                result = 'T';
            else if(DResult != 'T' && DResult != 'N' && DResult != VResult)
                result = 'T';
            else
                result = VResult;
        }
        else if(HResult != 'T' && HResult != 'N') {
            if(DResult != 'T' && DResult != 'N' && DResult != HResult)
                result = 'T';
            else
                result = HResult;
        }
        else
            result = DResult;


        //N - nobody won yet
        //T - a tie
        //Anything else - the char that won

        return result;

    }

    public char checkDiagonal() {
        char result = 'N';
        char cell;

        //ascending order, from bottom left to top right
        for(int col = 0; col < board[0].length-3; col++) {
            for(int row = board.length-1; row >= board.length-3; row--) {
                cell = board[row][col];
                //if the four diagonals are the same
                if(cell != '-' && cell == board[row-1][col+1] && cell == board[row-2][col+2] && cell == board[row-3][col+3]) {
                    if(result != 'N' && cell != result) {
                        result = 'T';
                        return result;
                    }
                    else
                        result = cell;
                }
            }
        }

        //descending order, from top left to bottom right
        for(int col = 0; col < board[0].length-3; col++) {
            for(int row = 0; row < board.length-3; row++) {
                cell = board[row][col];
                //if the four diagonals are the same
                if(cell != '-' && cell == board[row+1][col+1] && cell == board[row+2][col+2] && cell == board[row+3][col+3]) {
                    if(result != 'N' && cell != result) {
                        result = 'T';
                        return result;
                    }
                    else
                        result = cell;
                }
            }
        }

        return result;
    }

    public char checkVertical() {
        int count = 0;
        char temp = ' ';
        char result = 'N';

        for (int col = 0; col < board[0].length; col++) {
            for (int row = board.length - 1; row >= 0; row--) {
                if (board[row][col] == '-') {
                    count = 0; //streak broken, reset
                    temp = ' '; //reset
                }
                else if (board[row][col] == temp) { //if current is same as last
                    count = count + 1;
                }
                else { //current is different than last
                    temp = board[row][col];
                    count = 1;
                }

                if (count == 4) {
                    if(result != 'N' && result != temp) { //if it's a tie
                        result = 'T';
                        return result;
                    }
                    else {
                        result = temp;
                    }

                }
            }
            count = 0; //because you move from very top to the very bottom
        }

        return result;
    }

    public char checkHorizontal() {
        int count = 0;
        char temp = ' ';
        char result = 'N';

        for (int row = board.length - 1; row >= 0; row--) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '-') {
                    count = 0;
                    temp = ' ';
                }
                else if (board[row][col] == temp) {
                    count = count + 1;
                }
                else {
                    temp = board[row][col];
                    count = 1;
                }

                if (count == 4) {
                    //if it's a tie
                    if(result != 'N' && result != temp) {
                        result = 'T';
                        return result;
                    }
                    else {
                        result = temp;
                    }
                }
            }
            count = 0;
        }

        return result;
    }

    public void printTable() {
        for(int row = 0; row < board.length; row++) {
            for(int c = 0; c < board[0].length; c++) {
                System.out.printf("%s ",board[row][c]);
            }
            System.out.println();
        }



        System.out.printf("FINAL RESULT: %s%n%n", result);
    }

}
