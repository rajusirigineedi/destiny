package com.mini14.destiny;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    String presentName = "";

    public static final String SHARED_PREFS = "sharedprefs";
    public static final String username = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.login);
        editText = findViewById(R.id.entername);
        loadData();

        if(presentName.equals("default")){

        }else{
            startActivity(new Intent(MainActivity.this,PresentActivity.class));
            finish();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
                startActivity(new Intent(MainActivity.this,PresentActivity.class));
                finish();
            }
        });
    }
    private  void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(username,editText.getText().toString().trim());
        editor.apply();
    }
    private void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        presentName = sharedPreferences.getString(username,"default");
    }
}
