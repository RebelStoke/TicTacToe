/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import tictactoe.bll.GameBoard;
import tictactoe.bll.IGameModel;

/**
 *
 * @author Stegger
 */
public class TicTacViewController implements Initializable
{
    int winner;
    @FXML
    private Label lblPlayer;

    @FXML
    private Button btnNewGame;

    @FXML
    private GridPane gridPane;
    
    private static final String TXT_PLAYER = "Player: ";
    private IGameModel game;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;

    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        try
        {
            Integer row = GridPane.getRowIndex((Node) event.getSource());
            Integer col = GridPane.getColumnIndex((Node) event.getSource());
            int r = (row == null) ? 0 : row;
            int c = (col == null) ? 0 : col;
            if (game.play(c, r))
            {
                {
                    if (isGameOver())
                {
                    displayWinner(winner);
                }
                   else {Button btn = (Button) event.getSource();
                    if ("".equals(btn.getText())){
                    game.getNextPlayer();
                    int player = game.getNextPlayer();
                    String xOrO = player == 0 ? "X" : "O";
                    btn.setText(xOrO);
                    setPlayer();
                    }
                    }
                    if (isGameOver())
                {
                    displayWinner(winner);
                }
                }
                
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void handleNewGame(ActionEvent event)
    {
        game.newGame();
        setPlayer();
        clearBoard();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        game = new GameBoard();
        setPlayer();
    }

    private void setPlayer()
    {
        lblPlayer.setText(TXT_PLAYER + game.getNextPlayer());
    }
   

    private void displayWinner(int winner)
    {
        String message = "";
        switch (winner)
        {
            case -1:
                message = "It's a draw :-(";
                break;
            default:
                message = "Player " + winner + " wins!!!";
                break;
        }
        lblPlayer.setText(message);
    }

    private void clearBoard()
    {
        for(Node n : gridPane.getChildren())
        {
            Button btn = (Button) n;
            btn.setText("");
        }
    }
    public boolean isGameOver()
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
