package tictactoe;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 *
 * @author bladuk8617
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            char player = 'o';
        int row;
        int column;
        boolean winner = false;
        System.out.println("Tik-Tak-Toe Game ready!\n");
        drawScreen();
        while (winner = true) {
            getInput();
            drawScreen();
            checkWinning();
            cpuInput();
            drawScreen();
            checkWinning();
        }
    }
    
    public static int[][] getInput() {
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Choose Row: ");
        int row = Input.nextInt();
        System.out.print("Choose Column: ");
        int column=Input.nextInt();
        int[][] table = new int[1][1];
        table[0][0] = row;
        table[1][1] = column;
        return table; // Needs to Return corradants.
        // I'm trying to create a way to return corrordants to drawScreen() then change a blank to an "O".
    }
    
//    public static void changeBoard(char player, int row, int column) {
//        table[row][column]=player;
//    }
    
    public static void drawScreen() {
        
        char [][] table = new char[3][3];
        System.out.println("  0  " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
        System.out.println("     0 1 2 \n");
    }
       
    
    //Check Winning State
    public boolean checkWin() {
         if( table [0][0]==table[1][0] && table[1][0] == table[2][0] && (table [0][0]=='x' || table [0][0]=='o')) {
             return true;
         } else if( table [0][1]==table[1][1] && table[1][1] == table[2][1] && (table [0][1]=='x' || table [0][1]=='o')) {
             return true;
         } else if( table [0][2]==table[1][2] && table[1][2] == table[2][2] && (table [0][2]=='x' || table [0][2]=='o')) {
             return true;
         } else if( table [0][0]==table[0][1] && table[0][1] == table[0][2] && (table [0][0]=='x' || table [0][0]=='o')) {
             return true;
         } else if( table [1][0]==table[1][1] && table[1][1] == table[1][2] && (table [1][0]=='x' || table [1][0]=='o')) {
             return true;
         } else if( table [2][0]==table[2][1] && table[2][1] == table[2][2] && (table [2][0]=='x' || table [2][0]=='o')) {
             return true;
         } else if( table [0][0]==table[1][1] && table[1][1] == table[2][2] && (table [0][0]=='x' || table [0][0]=='o')) {
             return true;
         } else if( table [2][0]==table[1][1] && table[1][1] == table[0][2] && (table [2][0]=='x' || table [2][0]=='o')) {
             return true;
         } else {
             return false;
         }
    }
    
    public boolean checkTie() {
        //TODO: Check if game board is filled
        if ( table )
        return false;
    }
    
}