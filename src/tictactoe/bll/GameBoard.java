/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.bll;
import javafx.scene.control.Button;
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
    
   public Button btn1;
   public Button btn2;
   public Button btn3;
   public Button btn4;
   public Button btn5;
   public Button btn6;
   public Button btn7;
   public Button btn8;
   public Button btn9;
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


    

    public boolean isGameOver(Button btn1, Button btn2, Button btn3, Button btn4, Button btn5, Button btn6, Button btn7, Button btn8, Button btn9) 
{
int win = 0;
        
        if("X".equals(btn1.getText())&&
        "X".equals(btn2.getText())&&
        "X".equals(btn3.getText()))
       {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn1.getText())&&
        "O".equals(btn2.getText())&&
        "O".equals(btn3.getText()))
       {
        win = 1;
        winner = 0;
     }
   
     else if("X".equals(btn4.getText())&&
        "X".equals(btn5.getText())&&
        "X".equals(btn6.getText()))
      {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn4.getText())&&
        "O".equals(btn5.getText())&&
        "O".equals(btn6.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(btn7.getText())&&
        "X".equals(btn8.getText())&&
        "X".equals(btn9.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn7.getText())&&
        "O".equals(btn8.getText())&&
        "O".equals(btn9.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(btn1.getText())&&
        "X".equals(btn4.getText())&&
        "X".equals(btn7.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn1.getText())&&
        "O".equals(btn4.getText())&&
        "O".equals(btn7.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(btn2.getText())&&
        "X".equals(btn5.getText())&&
        "X".equals(btn8.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn2.getText())&&
        "O".equals(btn5.getText())&&
        "O".equals(btn8.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(btn3.getText())&&
        "X".equals(btn6.getText())&&
        "X".equals(btn9.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn3.getText())&&
        "O".equals(btn6.getText())&&
        "O".equals(btn9.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(btn1.getText())&&
        "X".equals(btn5.getText())&&
        "X".equals(btn9.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn1.getText())&&
        "O".equals(btn5.getText())&&
        "O".equals(btn9.getText()))
        {
        win = 1;
        winner = 0;
     }
     
     else if("X".equals(btn3.getText())&&
        "X".equals(btn5.getText())&&
        "X".equals(btn7.getText()))
        {
        win = 1;
        winner = 1;
     }
     
     else if("O".equals(btn3.getText())&&
        "O".equals(btn5.getText())&&
        "O".equals(btn7.getText()))
        {
        win = 1;
        winner = 0;
     }
     else if(!"".equals(btn1.getText())&&!"".equals(btn2.getText())&&!"".equals(btn3.getText())&&
             !"".equals(btn4.getText())&&!"".equals(btn5.getText())&&!"".equals(btn6.getText())&&
             !"".equals(btn7.getText())&&!"".equals(btn8.getText())&&!"".equals(btn9.getText())){
              win = 1;
              winner = -1;
     }
     
     
        return win == 1;
}

}
