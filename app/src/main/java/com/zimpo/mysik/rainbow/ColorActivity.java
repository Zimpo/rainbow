package com.zimpo.mysik.rainbow;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class ColorActivity extends AppCompatActivity {

    @Override
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        init();

        restartGame();
    }

    ImageView heart1;
    ImageView heart2;
    ImageView heart3;
    TextView scoreTV;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;

    ArrayList<ColorObject> colorTrue;
    ArrayList<ColorObject> colorFalse;

    RelativeLayout restartRL;
    TextView restartScoreTV;
    TextView restartBestScoreTV;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void init()
    {
        //HEADER
        heart1 = (ImageView) findViewById(R.id.heart1);
        heart2 = (ImageView) findViewById(R.id.heart2);
        heart3 = (ImageView) findViewById(R.id.heart3);
        scoreTV = (TextView) findViewById(R.id.scoreTV);

        //GAME
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button1);
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button2);
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button3);
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button4);
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button5);
            }
        });
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button6);
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button7);
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button8);
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button9);
            }
        });
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button10);
            }
        });
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button11);
            }
        });
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button12);
            }
        });
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button13);
            }
        });
        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button14);
            }
        });
        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton(button15);
            }
        });

        colorTrue = new ArrayList<>();
        colorTrue.add(new ColorObject("rouge", 0));
        colorTrue.add(new ColorObject("rose", 1));
        colorTrue.add(new ColorObject("orange", 2));
        colorTrue.add(new ColorObject("jaune", 3));
        colorTrue.add(new ColorObject("mauve", 4));
        colorTrue.add(new ColorObject("vert", 5));
        colorTrue.add(new ColorObject("bleu", 6));
        colorTrue.add(new ColorObject("marron", 7));
        colorTrue.add(new ColorObject("blanc", 8));
        colorTrue.add(new ColorObject("gris", 9));

        colorFalse = new ArrayList<>();
        colorFalse.add(new ColorObject("rouge", 9));
        colorFalse.add(new ColorObject("rose", 8));
        colorFalse.add(new ColorObject("orange", 7));
        colorFalse.add(new ColorObject("jaune", 6));
        colorFalse.add(new ColorObject("mauve", 5));
        colorFalse.add(new ColorObject("vert", 4));
        colorFalse.add(new ColorObject("bleu", 3));
        colorFalse.add(new ColorObject("marron", 2));
        colorFalse.add(new ColorObject("blanc", 1));
        colorFalse.add(new ColorObject("gris", 0));
        colorFalse.add(new ColorObject("rouge", 6));
        colorFalse.add(new ColorObject("rose", 3));
        colorFalse.add(new ColorObject("orange", 8));
        colorFalse.add(new ColorObject("jaune", 2));
        colorFalse.add(new ColorObject("mauve", 3));
        colorFalse.add(new ColorObject("vert", 9));
        colorFalse.add(new ColorObject("bleu", 10));
        colorFalse.add(new ColorObject("marron", 9));
        colorFalse.add(new ColorObject("blanc", 5));
        colorFalse.add(new ColorObject("gris", 6));

        buttonTrue = new ArrayList<>();
        buttonFalse = new ArrayList<>();

        //RESTART
        restartRL = (RelativeLayout) findViewById(R.id.restartRL);
        restartScoreTV = (TextView) findViewById(R.id.scoreLooseTV);
        restartBestScoreTV = (TextView) findViewById(R.id.bestScoreLooseTV);

        restartRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartRL.setVisibility(View.GONE);
                restartGame();
            }
        });
    }

    ArrayList<Button> buttonTrue;
    ArrayList<Button> buttonFalse;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void newRound()
    {
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button7.setVisibility(View.INVISIBLE);
        button8.setVisibility(View.INVISIBLE);
        button9.setVisibility(View.INVISIBLE);
        button10.setVisibility(View.INVISIBLE);
        button11.setVisibility(View.INVISIBLE);
        button12.setVisibility(View.INVISIBLE);
        button13.setVisibility(View.INVISIBLE);
        button14.setVisibility(View.INVISIBLE);
        button15.setVisibility(View.INVISIBLE);

        buttonTrue.clear();
        buttonFalse.clear();

        Random rand = new Random();
        int randLevel = rand.nextInt(level);

        for (int i = 0; i < level; i++)
        {
            int randRow = rand.nextInt(3);
            int randColorTrue = rand.nextInt(10);
            int randColorFalse = rand.nextInt(20);

            if (i == 0)
            {
                if (i == randLevel)
                {
                    if (randRow == 0)
                        setButton(button1, colorTrue.get(randColorTrue), true);
                    else if (randRow == 1)
                        setButton(button2, colorTrue.get(randColorTrue), true);
                    else if (randRow == 2)
                        setButton(button3, colorTrue.get(randColorTrue), true);
                }
                else
                {
                    if (randRow == 0)
                        setButton(button1, colorFalse.get(randColorFalse), false);
                    else if (randRow == 1)
                        setButton(button2, colorFalse.get(randColorFalse), false);
                    else if (randRow == 2)
                        setButton(button3, colorFalse.get(randColorFalse), false);
                }
            }
            else if (i == 1)
            {
                if (i == randLevel)
                {
                    if (randRow == 0)
                        setButton(button4, colorTrue.get(randColorTrue), true);
                    else if (randRow == 1)
                        setButton(button5, colorTrue.get(randColorTrue), true);
                    else if (randRow == 2)
                        setButton(button6, colorTrue.get(randColorTrue), true);
                }
                else
                {
                    if (randRow == 0)
                        setButton(button4, colorFalse.get(randColorFalse), false);
                    else if (randRow == 1)
                        setButton(button5, colorFalse.get(randColorFalse), false);
                    else if (randRow == 2)
                        setButton(button6, colorFalse.get(randColorFalse), false);
                }
            }
            else if (i == 2)
            {
                if (i == randLevel)
                {
                    if (randRow == 0)
                        setButton(button7, colorTrue.get(randColorTrue), true);
                    else if (randRow == 1)
                        setButton(button8, colorTrue.get(randColorTrue), true);
                    else if (randRow == 2)
                        setButton(button9, colorTrue.get(randColorTrue), true);
                }
                else
                {
                    if (randRow == 0)
                        setButton(button7, colorFalse.get(randColorFalse), false);
                    else if (randRow == 1)
                        setButton(button8, colorFalse.get(randColorFalse), false);
                    else if (randRow == 2)
                        setButton(button9, colorFalse.get(randColorFalse), false);
                }
            }
            else if (i == 3)
            {
                if (i == randLevel)
                {
                    if (randRow == 0)
                        setButton(button10, colorTrue.get(randColorTrue), true);
                    else if (randRow == 1)
                        setButton(button11, colorTrue.get(randColorTrue), true);
                    else if (randRow == 2)
                        setButton(button12, colorTrue.get(randColorTrue), true);
                }
                else
                {
                    if (randRow == 0)
                        setButton(button10, colorFalse.get(randColorFalse), false);
                    else if (randRow == 1)
                        setButton(button11, colorFalse.get(randColorFalse), false);
                    else if (randRow == 2)
                        setButton(button12, colorFalse.get(randColorFalse), false);
                }
            }
            else if (i == 4)
            {
                if (i == randLevel)
                {
                    if (randRow == 0)
                        setButton(button13, colorTrue.get(randColorTrue), true);
                    else if (randRow == 1)
                        setButton(button14, colorTrue.get(randColorTrue), true);
                    else if (randRow == 2)
                        setButton(button15, colorTrue.get(randColorTrue), true);
                }
                else
                {
                    if (randRow == 0)
                        setButton(button13, colorFalse.get(randColorFalse), false);
                    else if (randRow == 1)
                        setButton(button14, colorFalse.get(randColorFalse), false);
                    else if (randRow == 2)
                        setButton(button15, colorFalse.get(randColorFalse), false);
                }
            }
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void setButton(Button button, ColorObject colorObject, boolean bool)
    {
        button.setText(colorObject.name);
        button.setBackgroundColor(colorObject.getColor(getApplicationContext()));
        button.setTextColor(colorObject.getTextColor(getApplicationContext()));
        button.setVisibility(View.VISIBLE);

        if (bool)
            buttonTrue.add(button);
        else
            buttonFalse.add(button);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void checkButton(Button button)
    {
        for (int i = 0; i < buttonTrue.size(); i++)
        {
            if (buttonTrue.get(i) == button)
            {
                score++;
                scoreTV.setText("SCORE : " + score);

                if (level < 5)
                    level ++;

                newRound();
                return;
            }
        }

        for (int j = 0; j < buttonFalse.size(); j++)
        {
            if (buttonFalse.get(j) == button)
            {
                if (nbHeart == 3)
                    heart3.setBackground(getResources().getDrawable(R.drawable.like_empty));
                else if (nbHeart == 2)
                    heart2.setBackground(getResources().getDrawable(R.drawable.like_empty));
                else if (nbHeart == 1)
                    heart1.setBackground(getResources().getDrawable(R.drawable.like_empty));
                else if (nbHeart == 0)
                {
                    restartRL.setVisibility(View.VISIBLE);
                    restartScoreTV.setText(String.valueOf(score));

                    //BEST SCORE
                    if (score > AppInformation.getScore(getApplicationContext()))
                        AppInformation.setScore(getApplicationContext(), score);
                    restartBestScoreTV.setText(String.valueOf(AppInformation.getScore(getApplicationContext())));

                    return;
                }

                if (level > 2)
                    level --;

                nbHeart --;
                newRound();
                return;
            }
        }
    }


    int level;
    int nbHeart;
    int score;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void restartGame()
    {
        level = 2;
        nbHeart = 3;
        score = 0;

        heart1.setBackground(getResources().getDrawable(R.drawable.like_filled));
        heart2.setBackground(getResources().getDrawable(R.drawable.like_filled));
        heart3.setBackground(getResources().getDrawable(R.drawable.like_filled));
        scoreTV.setText("SCORE : " + String.valueOf(score));

        newRound();
    }
}