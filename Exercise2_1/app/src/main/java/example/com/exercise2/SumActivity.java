package example.com.exercise2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by anita_lin on 2018/1/30.
 */

public class SumActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    int mShowSum;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        final TextView mShowSumField = (TextView) findViewById(R.id.showSum);
        Button mBackButton = (Button) findViewById(R.id.backButton);


        Bundle mSumBundle = this.getIntent().getExtras();
        if (mSumBundle != null){
            mShowSum = mSumBundle.getInt("Sum");
            mShowSumField.setText(Integer.toString(mShowSum));
        }

        mBackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent mBackIntent = new Intent(SumActivity.this, MainActivity.class);
                Bundle toastBundle = new Bundle();
                toastBundle.putString("toastSum", Integer.toString(mShowSum));
                startActivity(mBackIntent.putExtras(toastBundle));

            }
        });

    }
}
