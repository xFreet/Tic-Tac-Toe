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

import ga.jkowalczyk.tictactoe.GameEngine.Engine;

public class TwoPlayerActivity extends AppCompatActivity {
    int status =0;

    TextView result;
    Engine engine;
    ImageView ar_imageView[]=new ImageView[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        for(int i=0;i<9;i++)
        {
            if(i==0)
            {
                ar_imageView[0]=(ImageView)findViewById(R.id.imageView);
            }
            else
            {
                String id="imageView"+(i+1);
                ar_imageView[i]=(ImageView)findViewById(getResources().getIdentifier(id,"id",getPackageName()));
            }
        }
        result = (TextView)findViewById(R.id.result);
        engine = new Engine();
        Button button2 = (Button)findViewById(R.id.bt_new_game2);
        MaterialRippleLayout.on(button2)
                .rippleColor(Color.GRAY)
                .rippleHover(true)
                .rippleOverlay(true)
                .rippleAlpha(0.2f)
                .create();
    }
    public void one(View view) {
        status++;
        engine.touch(ar_imageView[0], status);
        check2();
    }
    public void two(View view) {
        status++;
        engine.touch(ar_imageView[1], status);
        check2();
    }
    public void three(View view) {
        status++;
        engine.touch(ar_imageView[2], status);
        check2();
    }
    public void four(View view) {
        status++;
        engine.touch(ar_imageView[3], status);
        check2();
    }
    public void five(View view) {
        status++;
        engine.touch(ar_imageView[4], status);
        check2();
    }
    public void six(View view) {
        status++;
        engine.touch(ar_imageView[5], status);
        check2();
    }
    public void seven(View view) {
        status++;
        engine.touch(ar_imageView[6], status);
        check2();
    }
    public void eight(View view) {
        status++;
        engine.touch(ar_imageView[7], status);
        check2();
    }
    public void nine(View view) {
        status++;
        engine.touch(ar_imageView[8], status);
        check2();
    }
    public void check2()
    {
        engine.check(ar_imageView, status,result);
    }
    public void new_game(View view)
    {
        engine.unblock(ar_imageView);
        result.setVisibility(View.INVISIBLE);
        result.setTextColor(Color.parseColor("#FFFFFF"));
        status =0;
        Answers.getInstance().logLevelStart(new LevelStartEvent()
                .putLevelName("New game/two"));
    }
}
