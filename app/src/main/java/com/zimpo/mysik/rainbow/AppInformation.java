package com.zimpo.mysik.rainbow;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.List;

public class AppInformation {

    /////////////////////INFORMATION SAVED IN MYSIK/////////////////////////
    static final String PREF_SCORE = "score";

    public static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void clearSave(Context ctx)
    {
        getSharedPreferences(ctx).edit().clear();
    }

    public static void setScore(Context ctx, int score)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putInt(PREF_SCORE, score);
        editor.commit();
    }

    public static int getScore(Context ctx)
    {
        return getSharedPreferences(ctx).getInt(PREF_SCORE, 0);
    }
}
