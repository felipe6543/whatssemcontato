package com.example.appwhatssemcontato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button ButtonSelector;
    private TextInputLayout inputLayoutNumberoftelephone;
    private TextInputLayout inputLayoutTexttosend;
    private TextInputEditText inputTextNumberoftelephone;
    private TextInputEditText inputTextTexttosend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputLayoutNumberoftelephone = findViewById(R.id.input_layout_numberoftelephone);
        inputLayoutTexttosend = findViewById(R.id.input_layout_texttosend);

        inputTextNumberoftelephone = findViewById(R.id.input_text_numberoftelephone);
        inputTextTexttosend = findViewById(R.id.input_text_texttosend);

        ButtonSelector = findViewById(R.id.button_selector);
        ButtonSelector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = inputTextTexttosend.getText().toString();
                String phone = inputTextNumberoftelephone.getText().toString();
                message = message.replace("","%20");

                Uri webpage = Uri.parse("https://wa.me/"+phone+"/?text="+message);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
               startActivity(webIntent);
            }
        });



    }
}