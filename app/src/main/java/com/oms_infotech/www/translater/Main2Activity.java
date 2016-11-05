package com.oms_infotech.www.translater;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;


public class Main2Activity extends AppCompatActivity {

    ListView lv;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv=(ListView)findViewById(R.id.listView);
        ArrayList<String> tr=new ArrayList<>();
        tr=getIntent().getStringArrayListExtra("Trans");
        lv.setAdapter(new CustomAdapter(this,getIntent().getStringArrayListExtra("Numbers"),getIntent().getStringArrayListExtra("Trans"),getIntent().getIntegerArrayListExtra("Images")));

        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i!=TextToSpeech.ERROR){
                    textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });
        final ArrayList<String> finalTr = tr;
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), finalTr.get(i),Toast.LENGTH_LONG).show();
                textToSpeech.speak(finalTr.get(i),TextToSpeech.QUEUE_FLUSH,null);
            }
        });


    }
}
