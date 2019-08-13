package com.zimpo.mysik.rainbow;


import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

public class ColorObject {

    String name;
    int color;
    int textColor;

    public ColorObject(String name, int color)
    {
        this.name = name;
        this.color = color;
    }

    public int getTextColor(Context context)
    {
        if (color == 0 || color == 1 || color == 2 || color == 4 || color == 5 || color == 6 || color == 7 || color == 10)
           return context.getResources().getColor(R.color.colorWhite);
        else if (color == 3 || color == 8 || color == 9)
            return context.getResources().getColor(R.color.colorBlack);
        else
            return context.getResources().getColor(R.color.colorBlack);
    }

    public int getColor(Context context) {
        switch (color)
        {
            case 0:
                return context.getResources().getColor(R.color.colorRed);
            case 1:
                return context.getResources().getColor(R.color.colorPink);
            case 2:
                return context.getResources().getColor(R.color.colorOrange);
            case 3:
                return context.getResources().getColor(R.color.colorYellow);
            case 4:
                return context.getResources().getColor(R.color.colorPurple);
            case 5:
                return context.getResources().getColor(R.color.colorGreen);
            case 6:
                return context.getResources().getColor(R.color.colorBlue);
            case 7:
                return context.getResources().getColor(R.color.colorBrown);
            case 8:
                return context.getResources().getColor(R.color.colorWhite);
            case 9:
                return context.getResources().getColor(R.color.colorGray);
            case 10:
                return context.getResources().getColor(R.color.colorBlack);
            default:
                break;
        }
        return -1;
    }
}
