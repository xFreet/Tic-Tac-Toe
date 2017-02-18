package ga.jkowalczyk.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;
import com.crashlytics.android.answers.LevelStartEvent;

import ga.jkowalczyk.tictactoe.GameEngine.Bot;
import ga.jkowalczyk.tictactoe.GameEngine.Engine;

public class OnePlayerActivity extends AppCompatActivity {
    int status=0;
    ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9;
    TextView result;
    Engine engine;
    Bot bot;
    Boolean finish;
    ImageView ar_imageView[]=new ImageView[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);
       /* imageView = (ImageView)findViewById(R.id.imageViewv2);
        imageView2 = (ImageView)findViewById(R.id.imageView2v2);
        imageView3 = (ImageView)findViewById(R.id.imageView3v2);
        imageView4 = (ImageView)findViewById(R.id.imageView4v2);
        imageView5 = (ImageView)findViewById(R.id.imageView5v2);
        imageView6 = (ImageView)findViewById(R.id.imageView6v2);
        imageView7 = (ImageView)findViewById(R.id.imageView7v2);
        imageView8 = (ImageView)findViewById(R.id.imageView8v2);
        imageView9 = (ImageView)findViewById(R.id.imageView9v2);*/


        for(int i=0;i<9;i++)
        {
            if(i==0)
            {
                ar_imageView[0]=(ImageView)findViewById(R.id.imageViewv2);
            }
            else
            {
                String id="imageView"+(i+1)+"v2";
                ar_imageView[i]=(ImageView)findViewById(getResources().getIdentifier(id,"id",getPackageName()));
            }
        }

        ar_imageView[0]=(ImageView)findViewById(R.id.imageViewv2);
        result = (TextView)findViewById(R.id.resultv2);
        engine = new Engine();
        bot= new Bot();
        Button button = (Button)findViewById(R.id.bt_new_game);
        MaterialRippleLayout.on(button)
                .rippleColor(Color.GRAY)
                .rippleHover(true)
                .rippleOverlay(true)
                .rippleAlpha(0.2f)
                .create();
    }
    public void one(View view) {
        status++;
        engine.touch(ar_imageView[0], status);
        check1();
        bot();
    }

    public void two(View view) {
        status++;
        engine.touch(ar_imageView[1], status);
        check1();
        bot();
    }

    public void three(View view) {
        status++;
        engine.touch(ar_imageView[2], status);
        check1();
        bot();
    }

    public void four(View view) {
        status++;
        engine.touch(ar_imageView[3], status);
        check1();
        bot();
    }

    public void five(View view) {
        status++;
        engine.touch(ar_imageView[4], status);
        check1();
        bot();
    }

    public void six(View view) {
        status++;
        engine.touch(ar_imageView[5], status);
        check1();
        bot();
    }

    public void seven(View view) {
        status++;
        engine.touch(ar_imageView[6], status);
        check1();
        bot();
    }

    public void eight(View view) {
        status++;
        engine.touch(ar_imageView[7], status);
        check1();
        bot();
    }

    public void nine(View view) {
        status++;
        engine.touch(ar_imageView[8], status);
        check1();
        bot();
    }
    public void check1()
    {
        engine.check(ar_imageView, status, result);
    }
    public void new_game(View view)
    {
        engine.unblock(ar_imageView);
        result.setVisibility(View.INVISIBLE);
        result.setTextColor(Color.parseColor("#FFFFFF"));
        status =0;
        Answers.getInstance().logLevelStart(new LevelStartEvent()
                .putLevelName("New game/one"));

    }
    public void bot ()
    {
        finish=engine.main_status();
        if(!finish)
        {
            bot.bot(ar_imageView, result, status);
            status++;
        }
    }

}
