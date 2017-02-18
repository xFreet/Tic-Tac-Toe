package ga.jkowalczyk.tictactoe.GameEngine;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;

import ga.jkowalczyk.tictactoe.R;


public class Engine {
    boolean solution =false;
    public boolean check(ImageView imageView[], int status,TextView result)
    {
        Object s[] = new Object[9];
        for(int i=0;i<9;i++)
        {
            s[i]=imageView[i].getTag();
        }
        if(status==9)
        {
            result.setText("Draw ;D");
            Answers.getInstance().logCustom(new CustomEvent("Draw"));
            result.setVisibility(View.VISIBLE);
            solution =true;
            block(imageView);
        }
        if(((s[0]=="x")&&(s[1]=="x")&&(s[2]=="x"))||((s[0]=="x")&&(s[3]=="x")&&(s[6]=="x"))
                ||((s[1]=="x")&&(s[4]=="x")&&(s[7]=="x"))||((s[2]=="x")&&(s[5]=="x")&&(s[8]=="x"))
                ||((s[3]=="x")&&(s[4]=="x")&&(s[5]=="x"))||((s[6]=="x")&&(s[7]=="x")&&(s[8]=="x"))
                ||((s[0]=="x")&&(s[4]=="x") && (s[8] == "x")) || ((s[2] == "x") && (s[4] == "x") && (s[6] == "x")))
        {
            solution =true;
            block(imageView);
            result.setText("X win ;D");
            Answers.getInstance().logCustom(new CustomEvent("X win"));
            result.setVisibility(View.VISIBLE);
        }
        if(((s[0]=="o")&&(s[1]=="o")&&(s[2]=="o"))||((s[0]=="o")&&(s[3]=="o")&&(s[6]=="o"))
                ||((s[1]=="o")&&(s[4]=="o")&&(s[7]=="o"))||((s[2]=="o")&&(s[5]=="o")&&(s[8]=="o"))
                ||((s[3]=="o")&&(s[4]=="o")&&(s[5]=="o"))||((s[6]=="o")&&(s[7]=="o")&&(s[8]=="o"))
                ||((s[0]=="o")&&(s[4]=="o")&&(s[8]=="o"))||((s[2]=="o")&&(s[4]=="o")&&(s[6]=="o")))
        {
            solution =true;
            block(imageView);
            result.setText("O win ;D");
            Answers.getInstance().logCustom(new CustomEvent("O win"));
            result.setVisibility(View.VISIBLE);
            result.setTextColor(Color.parseColor("#00f76f"));
        }

        return solution;
    }
    public void block(ImageView[] imageView)
    {
        for(int i=0;i<9;i++)
        {
            imageView[i].setActivated(false);
            imageView[i].setClickable(false);
        }
    }
    public void unblock (ImageView[] imageView)
    {
        for(int i=0;i<9;i++)
        {
            imageView[i].setActivated(true);
            imageView[i].setClickable(true);
            imageView[i].setImageResource(R.drawable.nic);
            imageView[i].setTag("");
        }
        solution =false;
    }
    public void touch (ImageView imageView, int stan)
    {
        if(stan%2==0)
        {
            imageView.setImageResource(R.drawable.x);
            imageView.setClickable(false);
            imageView.setActivated(false);
            imageView.setTag("x");
        }
        else
        {
            imageView.setImageResource(R.drawable.o);
            imageView.setClickable(false);
            imageView.setActivated(false);
            imageView.setTag("o");
        }
    }
    public boolean main_status()
    {
        return solution;
    }
}
