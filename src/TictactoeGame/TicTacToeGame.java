package TictactoeGame;
import java.util.Scanner;
public class TicTacToeGame {
    private char board[]=new char[10]; //created a tictactoe board of size 10
    private String usersymbol,computersymbol;
    TicTacToeGame(){

        createboard(); //inside the constructor am calling createboard method
        takeuserinput();
    }
    public void createboard(){  //created a method named createboard.
        for(int count=1;count<10;count++){
            board[count]=' '; //assigned empty space
        }
    }
    public void takeuserinput(){ //created a method named
        Scanner Sc=new Scanner(System.in);
        System.out.println("Your turn: ");
        String symbol=Sc.next(); // taking user input to check
        if (symbol=="x"){
            usersymbol= "x";
            computersymbol="o";
        }else if (symbol=="o"){
            usersymbol="o";
            computersymbol="x";
        }
    }
    public static void main(String[]args){
        TicTacToeGame component=new TicTacToeGame(); //created object for class TicTacToeGame.

    }
}
