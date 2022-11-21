package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout table;
        table = (TableLayout)findViewById(R.id.tableLayout);

        TableRow[] tableRow = new TableRow[9];
        Button[][] buttons = new Button[9][9];
        for (int i = 0; i < 9; i++) {
            tableRow[i] = new TableRow(this);
            table.addView(tableRow[i]);
            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new Button(this);

                TableRow.LayoutParams layoutParams =
                        new TableRow.LayoutParams(
                                TableRow.LayoutParams.WRAP_CONTENT,
                                TableRow.LayoutParams.WRAP_CONTENT,
                                1.0f);
                layoutParams.setMargins(1, 1, 1, 1);
                buttons[i][j].setLayoutParams(layoutParams);

                tableRow[i].addView(buttons[i][j]);

                BoardGenerator board = new BoardGenerator();

                if ((int)((100*Math.random()) + 1) < 60) {
                    int number = board.get(i, j);
                    buttons[i][j].setText(Integer.toString(number));
                }

            }
        }

    }
}





