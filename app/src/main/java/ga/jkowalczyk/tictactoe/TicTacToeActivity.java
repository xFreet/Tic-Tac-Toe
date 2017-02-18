package ga.jkowalczyk.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;

import io.fabric.sdk.android.Fabric;

public class TicTacToeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_tic_tac_toe);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        layout();
    }

    public void one_player(View view) {
        Answers.getInstance().logContentView(new ContentViewEvent()
                .putContentName("View")
                .putContentType("one player"));
        Intent intent = new Intent(this, OnePlayerActivity.class);
        startActivity(intent);

    }

    public void two_player(View view) {
        Answers.getInstance().logContentView(new ContentViewEvent()
                .putContentName("View")
                .putContentType("two player"));
        Intent intent = new Intent(this, TwoPlayerActivity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Answers.getInstance().logContentView(new ContentViewEvent()
                .putContentName("View")
                .putContentType("about"));
        Intent intent = new Intent(this, aboutActivity.class);
        startActivity(intent);

    }

    public void quit(View view) {
        Answers.getInstance().logContentView(new ContentViewEvent()
                .putContentName("View")
                .putContentType("exit"));
        System.exit(0);
    }

    public void layout() {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "CALIBRIB.TTF");
        TextView tw = (TextView) findViewById(R.id.title);
        TextView tw2 = (TextView) findViewById(R.id.textview);
        TextView tw3 = (TextView) findViewById(R.id.textview2);
        TextView tw4 = (TextView) findViewById(R.id.textview3);
        TextView tw5 = (TextView) findViewById(R.id.textview4);
        tw.setTypeface(typeface);
        tw2.setTypeface(typeface);
        tw3.setTypeface(typeface);
        tw4.setTypeface(typeface);
        MaterialRippleLayout.on(tw2)
                .rippleColor(Color.GRAY)
                .rippleHover(true)
                .rippleAlpha(0.2f)
                .create();
        MaterialRippleLayout.on(tw3)
                .rippleColor(Color.GRAY)
                .rippleHover(true)
                .rippleAlpha(0.2f)
                .create();
        MaterialRippleLayout.on(tw4)
                .rippleColor(Color.GRAY)
                .rippleHover(true)
                .rippleAlpha(0.2f)
                .create();
        MaterialRippleLayout.on(tw5)
                .rippleColor(Color.GRAY)
                .rippleHover(true)
                .rippleAlpha(0.2f)
                .create();
    }
}