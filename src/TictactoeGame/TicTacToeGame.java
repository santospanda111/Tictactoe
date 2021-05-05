package TictactoeGame;

public class TicTacToeGame {
    char board[]=new char[10]; //created a tictactoe board of size 10
    TicTacToeGame(){

        createboard(); //inside the constructor am calling createboard method
    }
    void createboard(){  //created a method named createboard.
        for(int count=1;count<10;count++){
            board[count]=' '; //assigned empty space
        }
    }
    public static void main(String[]args){
        TicTacToeGame component=new TicTacToeGame(); //created object for class TicTacToeGame.
    }
}
