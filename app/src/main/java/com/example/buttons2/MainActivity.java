package com.example.buttons2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText editText;
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.textView);
        editText=(EditText)findViewById(R.id.edit2);
        button1=(Button)findViewById(R.id.button4);
        button2=(Button)findViewById(R.id.button5);
        button3=(Button)findViewById(R.id.button6);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button4: txt.setText(editText.getText().toString());break;
                    case R.id.button5: txt.setText("Ничего не пишу");break;


                }
            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);



    }
    public void clickButton3(View view){
        finish();
    }
}