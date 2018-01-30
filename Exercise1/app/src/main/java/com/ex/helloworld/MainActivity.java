package com.ex.helloworld;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        RelativeLayout myLayout = new RelativeLayout(this);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.WRAP_CONTENT,(int) RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        TextView textView = new TextView(this);
        textView.setText(R.string.text_name);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.ic_add_a_photo_black_36dp);
        imageView.setLayoutParams(params);


        myLayout.addView(imageView);
        myLayout.addView(textView);

        setContentView(myLayout);





    }
}
