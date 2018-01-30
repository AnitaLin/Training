package example.com.exercise2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate");

//        // (2)Launch Phone App
//        TextView mPhoneNumber = (TextView) findViewById(R.id.phoneNumber);
//        mPhoneNumber.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mLaunchPhone = getPackageManager().getLaunchIntentForPackage("com.htc.contacts");
//                startActivity(mLaunchPhone);
//
//
//
//            }
//        });

        // (3)Implicit intent for camera
//        Intent mLaunchCamera= new Intent("android.media.action.IMAGE_CAPTURE");
//        startActivity(mLaunchCamera);

        //(4) Two activity interaction
        final EditText mNumberA = (EditText) findViewById(R.id.numberA);
        final EditText mNumberB = (EditText) findViewById(R.id.numberB);
        Button mSumButton = (Button) findViewById(R.id.sumButton);

        mSumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int mNumA = Integer.parseInt(mNumberA.getText().toString());
                int mNumB = Integer.parseInt(mNumberB.getText().toString());
                int mSum = mNumA + mNumB;

                Intent mSumIntent = new Intent(MainActivity.this, SumActivity.class);
                mSumIntent.putExtra("Sum", mSum);
                startActivity(mSumIntent);

            }
        });

        if(this.getIntent().getStringExtra("toastSum")!=null) {
            Toast.makeText(this, this.getIntent().getExtras().getString("toastSum"), Toast.LENGTH_LONG).show();
        }




    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}
