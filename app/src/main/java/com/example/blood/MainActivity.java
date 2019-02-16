package com.example.blood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText Editname;
    EditText EditPass;
    Button btnSubmit;
    TextView AlreayUser;
    TextView Blood_bank;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Editname=(EditText)findViewById(R.id.editText);
        EditPass=(EditText)findViewById(R.id.editText2);
        btnSubmit=(Button)findViewById(R.id.button);
        AlreayUser=(TextView)findViewById(R.id.textView4);
        Blood_bank=(TextView)findViewById(R.id.textView5);

        AlreayUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),signIn.class);

                startActivity(intent);

            }
        });

        Blood_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"blood bank",Toast.LENGTH_LONG).show();
            }
        });


    }
}
