package com.nanchen.calendarviewdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * @author nanchen
 * @fileName CalendarViewDemo
 * @packageName com.nanchen.calendarviewdemo
 * @date 2016/12/08  11:06
 */

public class ToastUtil {
    private static Toast mToast;

    public static void showToast(Context context,String desc){
        if (mToast == null){
            mToast = Toast.makeText(context.getApplicationContext(),desc,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(desc);
        }
        mToast.show();
    }
}
