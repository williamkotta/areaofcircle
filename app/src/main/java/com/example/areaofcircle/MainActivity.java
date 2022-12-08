package com.example.areaofcircle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textV;
    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //initilize the button
        button  = findViewById(R.id.button);
        editTextNumber  = findViewById(R.id.editTextNumber);
        textV = findViewById(R.id.textv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = editTextNumber.getText().toString();
                Double r = Double.parseDouble(s);
                try{
                    if (editTextNumber.getText().toString().isEmpty()){
                        textV.setText("Please try again");
                    }
                    else {
                        Double area = 3.14 * r * r;
                        textV.setText("Area of the circle are: " + " " + area + " " + "unit^2");
                    }
                }
                catch(Exception e){
                    Log.e("e", "invalid try again");
                }
            }
        });

    }

}