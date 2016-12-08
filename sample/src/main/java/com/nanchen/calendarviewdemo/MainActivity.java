package com.nanchen.calendarviewdemo;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Toast;

import com.nanchen.calendarview.ClickDataListener;
import com.nanchen.calendarview.MyCalendarView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        //        final AlertDialog dialog = new AlertDialog.Builder(this).create();
        final AlertDialog dialog = new AlertDialog.Builder(this, R.style.dialog_style).create();
        dialog.show();
        Window window = dialog.getWindow();

        window.setContentView(R.layout.layout_calendar_dialog);
        window.setLayout(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        window.setWindowAnimations(R.style.AnimBottom);
        window.setGravity(Gravity.BOTTOM);

        MyCalendarView calendarView = (MyCalendarView) window.findViewById(R.id.calendarView);
        calendarView.setClickDataListener(new ClickDataListener() {
            @Override
            public void clickData(int year, int month, int day) {
                date = String.format(Locale.CHINA, "%04d-%02d-%02d", year, month, day);
                ToastUtil.showToast(MainActivity.this,date);
                dialog.cancel();
            }
        });
    }
}
