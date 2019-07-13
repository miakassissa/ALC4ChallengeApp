package bervillon.glenn.miakassissa.alc4_challenge_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btn_abt = findViewById(R.id.about_alc_button);
        btn_abt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                launchAboutPage();
            }
        });

        View btn_profile = findViewById(R.id.my_profile_button);
        btn_profile.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                launchMyProfilePage();
            }
        });

    }

    private void launchAboutPage(){
        Intent intent = new Intent(this, AboutPageActivity.class);
        startActivity(intent);
    }

    private void launchMyProfilePage(){
        Intent intent = new Intent(this, MyProfileActivity.class);
        startActivity(intent);
    }
}