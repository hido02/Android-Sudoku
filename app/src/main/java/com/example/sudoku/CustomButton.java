package com.example.sudoku;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class CustomButton extends FrameLayout { // Number Pad
    // Numberpad는 CustomButton 클릭하면 나타나야 함 ?
    // Numberpad의 visibility 속성을 visible/invisible
    // CustomButton 클릭 -> visible   Numberpad 클릭 -> invisible

    int row;
    int col;
    int value;

    TableLayout table;
    table = (TableLayout)findViewById(R.id.tableLayout);
    TableLayout tableRow = new TableLayout(this);

    public CustomButton(Context context, int row, int col) {
        textView = new TextView(context);
        addView(textView);
        setClickable(true);
        setBackgroundResource(R.drawable.button_selector);

        public void set(int a) {
            // FrameLayout에 TextView의 text 속성을 set
            // if (a == 0) text 속성을 삭제
            // value를 파라미터 a에 set
        }

        CustomButton[][] buttons = new CustomButton[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new CustomButton(this);
                tableRow.addView(buttons[i][j]);
            }
        }

    }


}
