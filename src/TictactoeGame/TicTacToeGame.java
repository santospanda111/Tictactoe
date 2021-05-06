package TictactoeGame;
import java.util.Scanner;
public class TicTacToeGame {
    private char board[]=new char[10]; //created a tictactoe board of size 10
    private char usersymbol,computersymbol;
    TicTacToeGame(){

        createboard(); //inside the constructor am calling createboard method
        tossForFirstPlay(); //making toss to start play
        takeUserInput();//inside the constructor am calling takeUserInput method
    }
    public void createboard(){  //created a method named createboard.
        for(int count=1;count<10;count++){ //it will iterate this forloop from 1 to 10
            board[count]=' '; //assigned empty space
        }
    }
    public void takeUserInput(){ //created a method named takeUserInput
        Scanner Sc=new Scanner(System.in);
        System.out.println("Your turn:(Choose x or o) ");
        String symbol=Sc.next(); // taking user input to check
        if (symbol=="x"){        //Comparing the user input
            usersymbol= 'x';
            computersymbol='o';
            System.exit(0);
        }else if (symbol=="o"){
            usersymbol='o';
            computersymbol='x';
            System.exit(0);
        }else{
            System.out.println("invalid option");
        }
    }
    //this showBoard method is showing the empty board of 3*3.
    public void showBoard(){
        String horizontalPart = "+---+---+---+";
        for (int i = 0; i < 3; i++) {
            System.out.println(horizontalPart);
            for (int j = 1; j < 4; j++) {
                System.out.print("| " + board[i * 3 + j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.print(horizontalPart);
        System.out.print("\n");
    }
    //this makeMove method will take user input from 1 to 9 place your move on the given input.
    public boolean makeMove() {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Make your move by choosing number 1-9 :- ");
        int i=Scan.nextInt();
        int player=1; //initiallized the player with 1
        while (true) {
            if (board[i] == ' ') {
                if (player == 0) {
                    System.out.println("Computer played: ");
                    board[i] = computersymbol; //if player==0 then it'll assign the value as given by computer
                } else {
                    System.out.println("Player played: ");
                    board[i] = usersymbol;
                }
                showBoard(); //it'll show the position in the board
                return false;
            } else {
                return true;
            }
        }
    }
    //this tossForFirstPlay method will get the input from user and check whether it's a head or tail by using random function
    public void tossForFirstPlay() {
        int player;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Toss (H or T):");
        String toss=sc.next();
        int i = (int) Math.round(Math.random()) % 2;
        if ((i == 1 && toss.equals("H")) || (i == 0 && toss.equals("T"))) {
            System.out.println("Congratulations! You've won the Toss.");
            player = 1;
        } else {
            System.out.println("You've lost Toss. Computer plays first.");
            player = 0;
        }
    }
    //this checkWin method will check all the possible winning chances...
    public void checkWin() {
        if ((board[1] == usersymbol && board[2] == usersymbol && board[3] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[4] == usersymbol && board[5] == usersymbol && board[6] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[7] == usersymbol && board[8] == usersymbol && board[9] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[1] == usersymbol && board[4] == usersymbol && board[7] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[2] == usersymbol && board[5] == usersymbol && board[8] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[3] == usersymbol && board[6] == usersymbol && board[9] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[1] == usersymbol && board[5] == usersymbol && board[9] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[3] == usersymbol && board[5] == usersymbol && board[7] == usersymbol)) {
            System.out.println("Player Wins!");
            System.exit(0);
        }
        if ((board[1] == computersymbol && board[2] == computersymbol && board[3] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[4] == computersymbol && board[5] == computersymbol && board[6] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[7] == computersymbol && board[8] == computersymbol && board[9] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[1] == computersymbol && board[4] == computersymbol && board[7] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[2] == computersymbol && board[5] == computersymbol && board[8] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[3] == computersymbol && board[6] == computersymbol && board[9] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[1] == computersymbol && board[5] == computersymbol && board[9] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
        if ((board[3] == computersymbol && board[5] == computersymbol && board[7] == computersymbol)) {
            System.out.println("Player Lost!");
            System.exit(0);
        }
    }


    public static void main(String[]args){
        TicTacToeGame tictactoe=new TicTacToeGame(); //created object for class TicTacToeGame
        tictactoe.showBoard();
        tictactoe.makeMove();
    }
}
