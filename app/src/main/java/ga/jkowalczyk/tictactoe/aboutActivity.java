package ga.jkowalczyk.tictactoe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.ContentViewEvent;

public class aboutActivity extends AppCompatActivity {
int stan=0;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        context=getApplicationContext();
    }

    public void tosty(View view) {
        stan++;
        if((stan==2)||(stan==4)||(stan==6)||(stan==8)||(stan==10)||(stan==12))
        {
            CharSequence text2="1101 \n Jakub Kowalczyk \n Sebastian Smulski";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text2, duration);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            if( v != null) v.setGravity(Gravity.CENTER);
            toast.show();
        }
        else if (stan==13)
        {
            CharSequence text2="4e696520737a74756b6120706f776965647a6965633a206e6170727a6f642c20737a74756b6120706f776965647a696563207a61206d6e612e";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text2, duration);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            if( v != null) v.setGravity(Gravity.CENTER);
            toast.show();
            Answers.getInstance().logContentView(new ContentViewEvent()
                    .putContentName("View")
                    .putContentType("Secret"));
        }
        else {
            CharSequence text2 = "Jakub Kowalczyk \n Sebastian Smulski";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text2, duration);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            if (v != null) v.setGravity(Gravity.CENTER);
            toast.show();
        }}
}
