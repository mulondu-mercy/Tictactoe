/*This program creates the 3 by 3 Tic_tac_toe board.
 It also allows switching into the 5 by 5 Tic_tac_toe board.*/

package com.example.android.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/*Created by Mercy on 03/04/2018*/

public class MainActivity extends AppCompatActivity
        implements
        View.OnClickListener {

    private static
    boolean PlayerX = true;
    int Count = 0;

    Button b11;
    Button b12;
    Button b13;

    Button b21;
    Button b22;
    Button b23;

    Button b31;
    Button b32;
    Button b33;

    Button reset;

    TextView player;

    int[][] board = new int[4][4];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mToFive;
        mToFive = (Button) findViewById(R.id.toFive);

        mToFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Creating an object of intent through which we can go from MainActivity to Profile Java
                Intent intent;
                intent = new Intent(getApplicationContext(), JavaProfile.class);
                startActivity(intent);
            }
        });

        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);


        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);

        b31 = (Button) findViewById(R.id.b31);
        b32 = (Button) findViewById(R.id.b32);
        b33 = (Button) findViewById(R.id.b33);

        reset = (Button) findViewById(R.id.reset);
        player = (TextView) findViewById(R.id.player);

        reset.setOnClickListener(this);

        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);

        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);

        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);

        initializeBoard();
    }

    /*called when the buttons are clicked*/
    public void onClick(View view) {
        boolean resetButtonPressed = false;

        switch (view.getId()) {
            case R.id.b11:
                if (PlayerX) {
                    b11.setText("X");
                    board[1][1] = 1;
                } else {
                    b11.setText("0");
                    board[1][1] = 0;
                }
                b11.setEnabled(false);
                break;

            case R.id.b12:
                if (PlayerX) {
                    b12.setText("X");
                    board[1][2] = 1;
                } else {
                    b12.setText("0");
                    board[1][2] = 0;
                }
                b12.setEnabled(false);
                break;

            case R.id.b13:
                if (PlayerX) {
                    b13.setText("X");
                    board[1][3] = 1;
                } else {
                    b13.setText("0");
                    board[1][3] = 0;
                }
                b13.setEnabled(false);
                break;

            case R.id.b21:
                if (PlayerX) {
                    b21.setText("X");
                    board[2][1] = 1;
                } else {
                    b21.setText("0");
                    board[2][1] = 0;
                }
                b21.setEnabled(false);
                break;

            case R.id.b22:
                if (PlayerX) {
                    b22.setText("X");
                    board[2][2] = 1;
                } else {
                    b22.setText("0");
                    board[2][2] = 0;
                }
                b22.setEnabled(false);
                break;

            case R.id.b23:
                if (PlayerX) {
                    b23.setText("X");
                    board[2][3] = 1;
                } else {
                    b23.setText("0");
                    board[2][3] = 0;
                }
                b23.setEnabled(false);
                break;

            case R.id.b31:
                if (PlayerX) {
                    b31.setText("X");
                    board[3][1] = 1;
                } else {
                    b31.setText("0");
                    board[3][1] = 0;
                }
                b31.setEnabled(false);
                break;

            case R.id.b32:
                if (PlayerX) {
                    b32.setText("X");
                    board[3][2] = 1;
                } else {
                    b32.setText("0");
                    board[3][2] = 0;
                }
                b32.setEnabled(false);
                break;

            case R.id.b33:
                if (PlayerX) {
                    b33.setText("X");
                    board[3][3] = 1;
                } else {
                    b33.setText("0");
                    board[3][3] = 0;
                }
                b33.setEnabled(false);
                break;

            case R.id.reset:
                resetButtonPressed = true;
                break;
            default:
                break;
        }
        if (resetButtonPressed) {
            resetBoard();
        } else {
            Count++;
            PlayerX = !PlayerX;
            if (PlayerX) {
                setInfo("Player X turn");
            } else {
                setInfo("Player 0 turn");
            }

            if (Count == 9) {
                result("Too bad. We don't have a winner. It's a Draw");
            }
            getTheWinner();
        }
    }

    /* Determining the winner*/
    private void
    getTheWinner() {

        //Checking the rows to determine the winner
        for (int i = 1; i < 4; i++) {

            if (board[i][1] == board[i][2] &&
                    board[i][1] == board[i][3]) {
                if (board[i][1] == 1) {
                    result("Player X is the winner.\nCheck " + (i) + " row");
                    break;
                } else if (board[i][1] == 0) {
                    result("Player 0 is the winner.\nCheck" + (i) + " row");
                    break;
                }
            }
        }

        //Checking the columns to determine the winner
        for (int i = 1; i < 4; i++) {

            if (board[1][i] == board[2][i] &&
                    board[1][i] == board[3][i]) {
                if (board[1][i] == 1) {
                    result("Player X is the winner.\n Check " + (i) + " column");
                    break;
                } else if (board[1][i] == 0) {
                    result("Player 0 is the winner.\nCheck " + (i) + " column");
                    break;
                }
            }
        }

        //Checking the first diagonal to determine the winner
        if (board[1][1] == board[2][2] && board[1][1] == board[3][3]) {
            if (board[1][1] == 1) {
                result("Player X is the winner.\nCheck first Diagonal");
            } else if (board[1][1] == 0) {
                result("Player 0 is the winner.\nCheck first Diagonal");
            }
        }

        //Checking the second diagonal to determine the winner
        if (board[1][3] == board[2][2] && board[1][3] == board[3][1]) {
            if (board[1][3] == 1) {
                result("Player X is the winner\nCheck second Diagonal");
            } else if (board[1][3] == 0) {
                result("Player 0 is the winner\nCheck second Diagonal");
            }
        }

    }

    private void
    enableBoxes(boolean value) {

        b11.setEnabled(value);
        b12.setEnabled(value);
        b13.setEnabled(value);

        b21.setEnabled(value);
        b22.setEnabled(value);
        b23.setEnabled(value);

        b31.setEnabled(value);
        b32.setEnabled(value);
        b33.setEnabled(value);
    }

    private void
    result(String winner) {

        setInfo(winner);
        enableBoxes(false);
    }

    /*method to reset the board*/
    private void
    resetBoard() {

        b11.setText("");
        b12.setText("");
        b13.setText("");

        b21.setText("");
        b22.setText("");
        b23.setText("");

        b31.setText("");
        b32.setText("");
        b33.setText("");

        enableBoxes(true);

        PlayerX = true;
        Count = 0;

        initializeBoard();

        setInfo("Starting Tic-Tac-Toe Again");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }

    private void
    setInfo(String text) {
        player.setText(text);
    }

    private void
    initializeBoard() {
        for (int i = 1; i < 4; i++) {

            for (int j = 1; j < 4; j++) {
                board[i][j] = -1;
            }
        }
    }
}