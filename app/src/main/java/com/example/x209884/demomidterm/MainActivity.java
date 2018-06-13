package com.example.x209884.demomidterm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onLaunchDemo(View v) {
        Class<? extends Activity> selectedDemo = null;
        switch (v.getId()) {

            case R.id.btnStyles:
                selectedDemo = StylesActivity.class;
                break;
            case R.id.btnThemes:
                selectedDemo = ThemesActivity.class;
                break;
        }
        if (selectedDemo != null) {
            startActivity(new Intent(this, selectedDemo));
        } else {
            Toast.makeText(this, "Demo can't be found!", Toast.LENGTH_SHORT).show();
        }
    }

}
