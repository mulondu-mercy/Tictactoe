/*This program creates the 5 by 5 Tic_tac_toe board.
* It also allows switching back to the 3 by 3 Tic_tac_toe board.*/

package com.example.android.tic_tac_toe;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/*Created by Mercy on 03/04/2018*/

public class JavaProfile extends AppCompatActivity
        implements
        View.OnClickListener {

    /*Declares and initializes the different params used*/
    private static
    boolean PlayerX = true;
    int Count = 0;

    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;

    Button b21;
    Button b22;
    Button b23;
    Button b24;
    Button b25;

    Button b31;
    Button b32;
    Button b33;
    Button b34;
    Button b35;

    Button b41;
    Button b42;
    Button b43;
    Button b44;
    Button b45;

    Button b51;
    Button b52;
    Button b53;
    Button b54;
    Button b55;

    Button reset;

    TextView player;

    int[][] board = new int[26][26];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_java);

        Button mBackToThree;
        mBackToThree = (Button) findViewById(R.id.backToThree);

        mBackToThree.setOnClickListener(new View.OnClickListener() {

            @Override
            /*Destroys the Java Profile allowing the user to go back to the Main Activity*/
            public void onClick(View view) {
                finish();
            }
        });
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);


        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);

        b31 = (Button) findViewById(R.id.b31);
        b32 = (Button) findViewById(R.id.b32);
        b33 = (Button) findViewById(R.id.b33);
        b34 = (Button) findViewById(R.id.b34);
        b35 = (Button) findViewById(R.id.b35);

        b41 = (Button) findViewById(R.id.b41);
        b42 = (Button) findViewById(R.id.b42);
        b43 = (Button) findViewById(R.id.b43);
        b44 = (Button) findViewById(R.id.b44);
        b45 = (Button) findViewById(R.id.b45);

        b51 = (Button) findViewById(R.id.b51);
        b52 = (Button) findViewById(R.id.b52);
        b53 = (Button) findViewById(R.id.b53);
        b54 = (Button) findViewById(R.id.b54);
        b55 = (Button) findViewById(R.id.b55);

        reset = (Button) findViewById(R.id.reset);
        player = (TextView) findViewById(R.id.player);

        reset.setOnClickListener(this);

        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);

        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);

        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);

        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);
        b45.setOnClickListener(this);

        b51.setOnClickListener(this);
        b52.setOnClickListener(this);
        b53.setOnClickListener(this);
        b54.setOnClickListener(this);
        b55.setOnClickListener(this);

        initializeBoard();

    }

    /*called when the buttons are clicked*/
    public void onClick(View view) {

        boolean resetButtonPressed = false;

        switch (view.getId()) {
            case R.id.b11:
                if (PlayerX) {
                    b11.setText("X");
                    board [1][1] = 1;
                } else {
                    b11.setText("0");
                    board [1][1] = 0;
                }
                b11.setEnabled(false);
                break;

            case R.id.b12:
                if (PlayerX) {
                    b12.setText("X");
                    board [1][2] = 1;
                } else {
                    b12.setText("0");
                    board [1][2] = 0;
                }
                b12.setEnabled(false);
                break;

            case R.id.b13:
                if (PlayerX) {
                    b13.setText("X");
                    board [1][3] = 1;
                } else {
                    b13.setText("0");
                    board [1][3] = 0;
                }
                b13.setEnabled(false);
                break;

            case R.id.b14:
                if (PlayerX) {
                    b14.setText("X");
                    board [1][4] = 1;
                } else {
                    b14.setText("0");
                    board [1][4] = 0;
                }
                b14.setEnabled(false);
                break;

            case R.id.b15:
                if (PlayerX) {
                    b15.setText("X");
                    board [1][5] = 1;
                } else {
                    b15.setText("0");
                    board [1][5] = 0;
                }
                b15.setEnabled(false);
                break;

            case R.id.b21:
                if (PlayerX) {
                    b21.setText("X");
                    board [2][1] = 1;
                } else {
                    b21.setText("0");
                    board [2][1] = 0;
                }
                b21.setEnabled(false);
                break;

            case R.id.b22:
                if (PlayerX) {
                    b22.setText("X");
                    board [2][2] = 1;
                } else {
                    b22.setText("0");
                    board [2][2] = 0;
                }
                b22.setEnabled(false);
                break;

            case R.id.b23:
                if (PlayerX) {
                    b23.setText("X");
                    board [2][3] = 1;
                } else {
                    b23.setText("0");
                    board [2][3] = 0;
                }
                b23.setEnabled(false);
                break;

            case R.id.b24:
                if (PlayerX) {
                    b24.setText("X");
                    board [2][4] = 1;
                } else {
                    b24.setText("0");
                    board [2][4] = 0;
                }
                b24.setEnabled(false);
                break;

            case R.id.b25:
                if (PlayerX) {
                    b25.setText("X");
                    board [2][5] = 1;
                } else {
                    b25.setText("0");
                    board [2][5] = 0;
                }
                b25.setEnabled(false);
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

            case R.id.b34:
                if (PlayerX) {
                    b34.setText("X");
                    board[3][4] = 1;
                } else {
                    b34.setText("0");
                    board[3][4] = 0;
                }
                b34.setEnabled(false);
                break;

            case R.id.b35:
                if (PlayerX) {
                    b35.setText("X");
                    board[3][5] = 1;
                } else {
                    b35.setText("0");
                    board[3][5] = 0;
                }
                b35.setEnabled(false);
                break;

            case R.id.b41:
                if (PlayerX) {
                    b41.setText("X");
                    board[4][1] = 1;
                } else {
                    b41.setText("0");
                    board[4][1] = 0;
                }
                b41.setEnabled(false);
                break;

            case R.id.b42:
                if (PlayerX) {
                    b42.setText("X");
                    board[4][2] = 1;
                } else {
                    b42.setText("0");
                    board[4][2] = 0;
                }
                b42.setEnabled(false);
                break;

            case R.id.b43:
                if (PlayerX) {
                    b43.setText("X");
                    board[4][3] = 1;
                } else {
                    b43.setText("0");
                    board[4][3] = 0;
                }
                b43.setEnabled(false);
                break;

            case R.id.b44:
                if (PlayerX) {
                    b44.setText("X");
                    board[4][4] = 1;
                } else {
                    b44.setText("0");
                    board[4][4] = 0;
                }
                b44.setEnabled(false);
                break;

            case R.id.b45:
                if (PlayerX) {
                    b45.setText("X");
                    board[4][5] = 1;
                } else {
                    b45.setText("0");
                    board[4][5] = 0;
                }
                b45.setEnabled(false);
                break;

            case R.id.b51:
                if (PlayerX) {
                    b51.setText("X");
                    board[5][1] = 1;
                } else {
                    b51.setText("0");
                    board[5][1] = 0;
                }
                b51.setEnabled(false);
                break;

            case R.id.b52:
                if (PlayerX) {
                    b52.setText("X");
                    board[5][2] = 1;
                } else {
                    b52.setText("0");
                    board[5][2] = 0;
                }
                b52.setEnabled(false);
                break;

            case R.id.b53:
                if (PlayerX) {
                    b53.setText("X");
                    board[5][3] = 1;
                } else {
                    b53.setText("0");
                    board[5][3] = 0;
                }
                b53.setEnabled(false);
                break;

            case R.id.b54:
                if (PlayerX) {
                    b54.setText("X");
                    board[5][4] = 1;
                } else {
                    b54.setText("0");
                    board[5][4] = 0;
                }
                b54.setEnabled(false);
                break;

            case R.id.b55:
                if (PlayerX) {
                    b55.setText("X");
                    board[5][5] = 1;
                } else {
                    b55.setText("0");
                    board[5][5] = 0;
                }
                b55.setEnabled(false);
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

            if (Count == 25) {
                result("Too bad. We don't have a winner. It's a Draw");
            }
            getWinner();
        }
    }

    /*Determining the winner*/
    private void
    getWinner() {

        //Checking the rows to determine the winner
        for (int i = 1; i < 26; i++) {

            if (board[i][1] == board[i][2] &&
                    board[i][1] == board[i][3] && board[i][1] == board[i][4] &&
                    board[i][1] == board[i][5]) {
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
        for (int i = 1; i < 26; i++) {

            if (board[1][i] == board[2][i] &&
                    board[1][i] == board[3][i] &&
                    board[1][i] == board[4][i] &&
                    board[1][i] == board[5][i]) {
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
        if (board[1][1] == board[2][2] && board[1][1] == board[3][3] &&
                board[1][1] == board[4][4] && board[1][1] == board[5][5]) {
            if (board[1][1] == 1) {
                result("Player X is the winner.\nCheck first Diagonal");
            } else if (board[1][1] == 0) {
                result("Player 0 is the winner.\nCheck first Diagonal");
            }
        }

        //Checking the second diagonal to determine the winner
        if (board[1][5] == board[2][4] && board[1][5] == board[3][3]
                && board[1][5] == board[4][2] && board[1][5] == board[5][1]) {
            if (board[1][5] == 1) {
                result("Player X is the winner\nCheck second Diagonal");
            } else if (board[1][5] == 0) {
                result("Player 0 is the winner\nCheck second Diagonal");
            }
        }

    }

    private void
    enableBoxes(boolean value) {
        b11.setEnabled(value);
        b12.setEnabled(value);
        b13.setEnabled(value);
        b14.setEnabled(value);
        b15.setEnabled(value);

        b21.setEnabled(value);
        b22.setEnabled(value);
        b23.setEnabled(value);
        b24.setEnabled(value);
        b25.setEnabled(value);

        b31.setEnabled(value);
        b32.setEnabled(value);
        b33.setEnabled(value);
        b34.setEnabled(value);
        b35.setEnabled(value);

        b41.setEnabled(value);
        b42.setEnabled(value);
        b43.setEnabled(value);
        b44.setEnabled(value);
        b45.setEnabled(value);

        b51.setEnabled(value);
        b52.setEnabled(value);
        b53.setEnabled(value);
        b54.setEnabled(value);
        b55.setEnabled(value);
    }

    private void
    result(String winner) {
        setInfo(winner);
        enableBoxes(false);
    }

 /*called when reset button is pressed*/
    private void
    resetBoard() {
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");

        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");

        b31.setText("");
        b32.setText("");
        b33.setText("");
        b34.setText("");
        b35.setText("");

        b41.setText("");
        b42.setText("");
        b43.setText("");
        b44.setText("");
        b45.setText("");

        b51.setText("");
        b52.setText("");
        b53.setText("");
        b54.setText("");
        b55.setText("");


        enableBoxes(true);

        PlayerX = true;
        Count = 0;

        initializeBoard();

        setInfo("Starting Tic-Tac-Toe Again");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }

    /*method to reset the board*/
    private void
    initializeBoard() {
        for (int i = 1; i < 26; i++) {

            for (int j = 1; j < 26; j++) {
                board[i][j] = -1;
            }
        }
    }

    private void
    setInfo(String text) {
        player.setText(text);
    }
}