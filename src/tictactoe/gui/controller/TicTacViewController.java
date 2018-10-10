/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.gui.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.IntStream;
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
    private Button rbtn;
    private boolean loop = false;
    
    public boolean vsPlayer = false;
    
    public int player;
    
    int counter;
    
public Button randomButton() {

    List<Button> randomValue = new ArrayList<>();
    randomValue.add(btn1);
    randomValue.add(btn2);
    randomValue.add(btn3);
    randomValue.add(btn4);
    randomValue.add(btn5);
    randomValue.add(btn6);
    randomValue.add(btn7);
    randomValue.add(btn8);
    randomValue.add(btn9);

    Random random = new Random();

    return randomValue.get(random.nextInt(randomValue.size()));
}

    @FXML
    private void handleButtonAction(ActionEvent event)
    { 
        loop = false;
        if(vsPlayer == true){
        try
        {
            Integer row = GridPane.getRowIndex((Node) event.getSource());
            Integer col = GridPane.getColumnIndex((Node) event.getSource());
            int r = (row == null) ? 0 : row;
            int c = (col == null) ? 0 : col;
            if (game.play(c, r))
            {
                {
                    if (game.isGameOver(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9))
                {
                    displayWinner(game.getWinner());
                }
                   else {Button btn = (Button) event.getSource();
                    if ("".equals(btn.getText())){
                    game.getNextPlayer();
                    int player1 = game.getNextPlayer();
                    String xOrO = player1 == 0 ? "O" : "X";
                    btn.setText(xOrO);
                    setPlayer();
                    }
                    }
                    if (game.isGameOver(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9))
                {
                    displayWinner(game.getWinner());
                }
                }
                
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    else if(vsPlayer == false) {
    
        try
        {
            Integer row = GridPane.getRowIndex((Node) event.getSource());
            Integer col = GridPane.getColumnIndex((Node) event.getSource());
            int r = (row == null) ? 0 : row;
            int c = (col == null) ? 0 : col;
            if (game.play(c, r))
            {
                {
                    if (game.isGameOver(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9))
                {
                    displayWinner(game.getWinner());
                }
                   else {Button btn = (Button) event.getSource();
                   
                    if ("".equals(btn.getText())){
                    player = game.getNextPlayer();
                    String xOrO = player == 0 ? "X" : "O";
                    btn.setText(xOrO);
                    setPlayer();
                    
                    
                    
                    while(!loop && counter < 4){
                    
                    rbtn = randomButton();   
                    if("".equals(rbtn.getText()))
                      {
                        String opposite = "X".equals(xOrO) ? "O" : "X";
                        rbtn.setText(opposite);
                        loop = true;
                        counter++;
                      }
                    
                   }
                    
                    
                      }
                    }
                    if (game.isGameOver(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9))
                {
                    displayWinner(game.getWinner());
                }
                }
                
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    }
    @FXML
    private void handleNewGame(ActionEvent event)
    {
       
        setPlayer();
        clearBoard();
        counter = 0;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        game = new GameBoard();
        game.getNextPlayer();
        setPlayer();
        counter = 0;
    }

    private void setPlayer()
    {
        String player1 = game.getNextPlayer() == 1 ? "X" : "O";
        lblPlayer.setText(TXT_PLAYER + player1);
    }
   

    private void displayWinner(int winner)
    {
        String message = "";
        String stringWinner = winner == 1 ? "X" : "O";
        switch (winner)
        {
            case -1:
                message = "It's a draw :-(";
                break;
            default:
                message = "Player " + stringWinner + " wins!!!";
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
    public void setVsPlayer() {
    vsPlayer = true;
    
        }
    }

