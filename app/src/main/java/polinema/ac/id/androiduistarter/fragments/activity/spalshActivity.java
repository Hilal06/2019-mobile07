package polinema.ac.id.androiduistarter.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import polinema.ac.id.androiduistarter.R;

public class spalshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(spalshActivity.this, WelcomeActivity.class));
                finish();
            }
        }, 5000);
    }
}
