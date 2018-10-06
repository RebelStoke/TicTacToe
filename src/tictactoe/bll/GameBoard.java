/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.bll;
import tictactoe.gui.controller.TicTacViewController;
/**
 *
 * @author Stegger
 */
public class GameBoard implements IGameModel
{
    int x=0;
    int y;
    int winner;
    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    public int getNextPlayer()
    {   
        if(x == 0) 
    {
        x = 1;
        y = 0;
    }
    else if (x == 1)
    {
        x = 0;
        y = 1;
    }
        return y;
    }

    /**
     * Attempts to let the current player play at the given coordinates. It the
     * attempt is succesfull the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver == true
     * this method will always return false.
     */
    public boolean play(int col, int row)
    {
        //TODO Implement this method
        return true;
    }

    public boolean isGameOver()
    {
        int win = 0;
        
        if("X".equals(TicTacViewController.btn1.getText())&&
        "X".equals(TicTacViewController.btn2.getText())&&
        "X".equals(TicTacViewController.btn3.getText()))
       {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn1.getText())&&
        "O".equals(TicTacViewController.btn2.getText())&&
        "O".equals(TicTacViewController.btn3.getText()))
       {
        win = 1;
        winner = 0;
     }
   
     else if("X".equals(TicTacViewController.btn4.getText())&&
        "X".equals(TicTacViewController.btn5.getText())&&
        "X".equals(TicTacViewController.btn6.getText()))
      {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn4.getText())&&
        "O".equals(TicTacViewController.btn5.getText())&&
        "O".equals(TicTacViewController.btn6.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(TicTacViewController.btn7.getText())&&
        "X".equals(TicTacViewController.btn8.getText())&&
        "X".equals(TicTacViewController.btn9.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn7.getText())&&
        "O".equals(TicTacViewController.btn8.getText())&&
        "O".equals(TicTacViewController.btn9.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(TicTacViewController.btn1.getText())&&
        "X".equals(TicTacViewController.btn4.getText())&&
        "X".equals(TicTacViewController.btn7.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn1.getText())&&
        "O".equals(TicTacViewController.btn4.getText())&&
        "O".equals(TicTacViewController.btn7.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(TicTacViewController.btn2.getText())&&
        "X".equals(TicTacViewController.btn5.getText())&&
        "X".equals(TicTacViewController.btn8.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn2.getText())&&
        "O".equals(TicTacViewController.btn5.getText())&&
        "O".equals(TicTacViewController.btn8.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(TicTacViewController.btn3.getText())&&
        "X".equals(TicTacViewController.btn6.getText())&&
        "X".equals(TicTacViewController.btn9.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn3.getText())&&
        "O".equals(TicTacViewController.btn6.getText())&&
        "O".equals(TicTacViewController.btn9.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(TicTacViewController.btn1.getText())&&
        "X".equals(TicTacViewController.btn5.getText())&&
        "X".equals(TicTacViewController.btn9.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn1.getText())&&
        "O".equals(TicTacViewController.btn5.getText())&&
        "O".equals(TicTacViewController.btn9.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(TicTacViewController.btn3.getText())&&
        "X".equals(TicTacViewController.btn5.getText())&&
        "X".equals(TicTacViewController.btn7.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(TicTacViewController.btn3.getText())&&
        "O".equals(TicTacViewController.btn5.getText())&&
        "O".equals(TicTacViewController.btn7.getText()))
        {
        win = 1;
        winner = 0;
     }
     
        return win == 1;
    }

    /**
     * Gets the id of the winner, -1 if its a draw.
     *
     * @return int id of winner, or -1 if draw.
     */
    public int getWinner()
    {
        //TODO Implement this method
        return winner;
    }

    /**
     * Resets the game to a new game state.
     */
    public void newGame()
    {
        //TODO Implement this method
    }

}
