package com.mini14.destiny;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalActivity extends AppCompatActivity {

    TextView finalGroupName;
    TextView send;
    String presentName;
    TextView textView;
    CardView cardView;
    public static final String SHARED_PREFS = "sharedprefs";
    ProgressBar progressBar;
    TextView aot;


    List<List<String>> table =
            new ArrayList<>();


 String  Cse[]={"Programming","Computers","Graphics designing","Animations","Data Protection","Artificial Intelligence ", "Making machines to think","Hacking","Windows","App development","App designing","Web designing","Internet based","Data science","Communication"};

    String   IT []={"Programming","Computers","Data security","Data Protection","Artificial intelligence ", "Making machines to think","Hacking","Online and Computers","Data science","Communication","Creating Internet based working things"};



    String ECE[]={"Robotics","Circuits ","Communication","Integrated circuits ","Creating Electronic devices","Networks ","Signals and systems","Electro magnetics","Wireless network communication","Programming","Testing Electronic devices","Electrical circuit creation"
            ,"How electrical devices work","How electronic devices are made","Creating Internet based working things"};



    String EEE[]={"Electricity basics","Electrical circuit creation","Electrical machines creation","Make power for electrical components","Electro magnetic fields","Circuits","Switching and Circuits","Electro magnetics","How electrical devices work"};



    String   MECH[]={"Mathematics ","Basic physical sciences ","Statistics and dynamics ","Material sciences and their structures","Solid mechanics","Interest in Material & engines development","Machine Modelling","Machine designing","Mechanical work","Kinematics","Playing with machines"};


    String CIVIL []={"Concrete technology ","Surveying ","Applied mathematics ","Transportation engineering ","Geotechnical engineering ","Environmental engineering ","Fluid mechanics ","Water resource engineering ","Statistics and dynamics ","Mathematics "};


    List<String> cse = Arrays.asList(Cse);
    List<String> ece = Arrays.asList(ECE);
    List<String> eee = Arrays.asList(EEE);
    List<String> mech = Arrays.asList(MECH);
    List<String> civ = Arrays.asList(CIVIL);
    List<String> it = Arrays.asList(IT);

    int[] groupsTable = {0,0,0,0,0,0};
    String[] groupNames = {"CSE","ECE","EEE","MECH","CIVIL","IT"};
    public static final String username = "username";

    String[] resultSet;
    ImageView logout;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        finalGroupName = findViewById(R.id.finalGroupName);
        textView = findViewById(R.id.finalName);
        send = findViewById(R.id.sendMail);
        cardView = findViewById(R.id.cardViewresult);
        logout = findViewById(R.id.logout);
        progressBar = findViewById(R.id.progressBarq);
        aot= findViewById(R.id.textViewq);

        progressBar.setVisibility(View.VISIBLE);
        aot.setVisibility(View.VISIBLE);


        table.add(cse);
        table.add(ece);
        table.add(eee);
        table.add(mech);
        table.add(civ);
        table.add(it);

         resultSet = getIntent().getStringArrayExtra("result");

        int i = 0;
        for(String onetopic : resultSet){
            for(List<String> presentGroup : table){
                if(presentGroup.contains(onetopic)){
                    groupsTable[i]++;
                }
                i++;
            }
            i=0;

        }
        int maxIndex = 0;
        int max = -99999;
        for(int k = 0 ; k< groupsTable.length; k++){
            if(groupsTable[k] > max){
                max = groupsTable[k];
                maxIndex = k;
            }

        }

        String result = "";
        int count = 0;
        for(int k = 0; k<groupsTable.length; k++){
            if(groupsTable[k] ==  groupsTable[maxIndex]){
                result+=groupNames[k]+"\n";
                count++;
            }
        }

        loadData();
        final Handler handler = new Handler();
        final int finalCount = count;
        final int finalMaxIndex = maxIndex;
        final String finalResult = result;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(finalCount == 1){
                    finalGroupName.setText("You may choose \n\n"+groupNames[+finalMaxIndex]);
                }else{
                    finalGroupName.setText("You may choose any one of \n\n"+ finalResult);
                }
                progressBar.setVisibility(View.INVISIBLE);
                aot.setVisibility(View.INVISIBLE);
            }
        }, 3000);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });


    }
    private void sendMail(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"naveensriram9999@gmail.com",
        "mooninthedarknight1999@gmail.com","charannaidubolisetti787@gmail.com",
        "sribrothers1999@gmail.com","wwwdotraju49@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"Still not sure about what to take ...");
        String message = "";
        for (String s : resultSet) {
            message += s + " , ";
        }
        intent.putExtra(Intent.EXTRA_TEXT,message);
        intent.setType("message/rfc822");
        startActivityForResult(Intent.createChooser(intent,"Choose any email app "),34);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 34){
            if(resultCode == RESULT_OK){
                Toast.makeText(getApplicationContext(),"Thanks for sharing your opinion , we will get back to you soon !!",Toast.LENGTH_LONG).show();

                //Thank you for sending your Query....We will get back to you in a while...! Thanks for choosing this App

            }
        }
    }
    private void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        presentName = sharedPreferences.getString("username","default");
        textView.setText("Dear " + presentName);
    }
    private  void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(username,"default");
        editor.apply();
        startActivity(new Intent(FinalActivity.this,MainActivity.class));
        SelectTopicsActivity.resultSet = new ArrayList<>();
        finishAffinity();
    }
    private  void makeAnimate(View view){
        Animation animation = AnimationUtils.loadAnimation(FinalActivity.this,R.anim.scaleanimationnow);
        view.startAnimation(animation);
    }
}
