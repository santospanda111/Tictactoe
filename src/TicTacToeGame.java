public class TicTacToeGame {
    char board[]=new char[10];
    TicTacToeGame(){
        createboard();
    }
    void createboard(){
        for(int count=1;count<10;count++){
            board[count]=' ';
        }
    }
    public static void main(String[]args){
        TicTacToeGame component=new TicTacToeGame();
    }
}
