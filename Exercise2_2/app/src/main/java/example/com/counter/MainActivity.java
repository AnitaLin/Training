package example.com.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView mResult;
    Button mCounterButton;
    EditText mMyEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult = (TextView) findViewById(R.id.counterResult);
        mCounterButton = (Button) findViewById(R.id.counterButton);
        mMyEditText = (EditText) findViewById(R.id.editText);

        mResult.setText(String.valueOf(count));

        mCounterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count++;
                mResult.setText(String.valueOf(count));

            }
        });
    }
}
