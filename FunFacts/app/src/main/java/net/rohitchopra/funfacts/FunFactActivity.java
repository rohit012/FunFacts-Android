package net.rohitchopra.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Random;


public class FunFactActivity extends ActionBarActivity {

    public static final String TAG = FunFactActivity.class.getSimpleName();
    FactBook mFactbook = new FactBook();
    ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        //Declare views and assign views from layout

        final TextView factLabel;
        factLabel = (TextView)findViewById(R.id.textView);

        final Button showFactButton;
        showFactButton = (Button)findViewById(R.id.showFact);

        final RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.activity_screen);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Set to new dynamic fact
                factLabel.setText(mFactbook.getFact());
                int color = colorWheel.getColor();

                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

                Log.d(TAG,"logging from main activity");
            }
        };


        //Toast.makeText(this,"welcome toast",Toast.LENGTH_LONG).show();
        Log.d(TAG,"logging from main activity");
        showFactButton.setOnClickListener(listener);

    }



}
