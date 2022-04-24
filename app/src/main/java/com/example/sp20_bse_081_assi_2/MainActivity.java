package com.example.sp20_bse_081_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,clear,open;
public TextView code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button) findViewById(R.id.b0);
        clear=(Button) findViewById(R.id.clear);
        open=(Button) findViewById(R.id.open);
        code=(TextView) findViewById(R.id.code);
        code.setText("");

b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        code.setText(code.getText()+"1");

    }
});
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        code.setText(code.getText()+"2"); }
});
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"3"); }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"4"); }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"5"); }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"6"); }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"7"); }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"8"); }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"9"); }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.setText(code.getText()+"0"); }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String a= code.getText().toString().substring(0,code.length()-1);

                code.setText(a);
            }
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code.getText().equals("0000")){
                    Toast.makeText(MainActivity.this, "Welcome to your safe", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}