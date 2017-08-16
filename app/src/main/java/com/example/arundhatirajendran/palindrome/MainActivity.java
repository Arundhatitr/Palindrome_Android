package com.example.arundhatirajendran.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

import static com.example.arundhatirajendran.palindrome.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    EditText Input;
    Button Result;
    String s="";
    String r="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input=(EditText) findViewById(R.id.Input);
        Result=(Button) findViewById(R.id.Result);

        Result.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                s = Input.getText().toString();
                r = new StringBuffer(s).reverse().toString();
                if (Objects.equals(s, r)) {
                    Toast.makeText(getBaseContext(), "Palindrome", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(), "Not Palindrome", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

}
