package com.example.precegabbysaina.driftshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashPage extends Activity {

    Button login,sign_up;

    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.splashpage);

        sign_up = findViewById(R.id.sign_up);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SplashPage.this,Login.class);
                startActivity(intent);
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SplashPage.this,Registration.class);
                startActivity(intent);
            }
        });

    }
}
