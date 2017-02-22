package com.example.afaf.amakenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class SignUpChooser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_chooser);
        ImageButton back = (ImageButton) findViewById(R.id.signUpchooserBack);
        CardView signUpUserCard = (CardView) findViewById(R.id.SignUpUserCard);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpChooser.this, MainActivity.class);
                startActivity(intent);
            }
        });
        signUpUserCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpChooser.this, SignUpUser.class);
                startActivity(intent);
            }
        });

    }
}
