package com.oms_infotech.www.translater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    //String[] name={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    //String[] trans={"Ek","Do","Teen","Char","Panch","Che","Saat","Aath","Nau","Dus"};
    //int imgs[]={R.drawable.ic_filter_1_black_24dp,R.drawable.ic_filter_2_black_24dp,R.drawable.ic_filter_3_black_24dp,R.drawable.ic_filter_4_black_24dp,R.drawable.ic_filter_5_black_24dp,R.drawable.ic_filter_6_black_24dp,R.drawable.ic_filter_7_black_24dp,R.drawable.ic_filter_8_black_24dp,R.drawable.ic_filter_9_black_24dp,R.drawable.ic_filter_9_plus_black_24dp};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> name=new ArrayList<>();
                ArrayList<String> trans=new ArrayList<>();
                ArrayList<Integer> imgs=new ArrayList<>();
                name.add("One");
                name.add("Two");
                name.add("Three");
                name.add("Four");
                name.add("Five");
                name.add("Six");
                name.add("Seven");
                name.add("Eight");
                name.add("Nine");
                name.add("Ten");

                trans.add("Ek");
                trans.add("Doo");
                trans.add("Teen");
                trans.add("Charr");
                trans.add("Panch");
                trans.add("Chey");
                trans.add("Saat");
                trans.add("Aathh");
                trans.add("Nau");
                trans.add("Dus");

                imgs.add(R.drawable.ic_filter_1_black_24dp);
                imgs.add(R.drawable.ic_filter_2_black_24dp);
                imgs.add(R.drawable.ic_filter_3_black_24dp);
                imgs.add(R.drawable.ic_filter_4_black_24dp);
                imgs.add(R.drawable.ic_filter_5_black_24dp);
                imgs.add(R.drawable.ic_filter_6_black_24dp);
                imgs.add(R.drawable.ic_filter_7_black_24dp);
                imgs.add(R.drawable.ic_filter_8_black_24dp);
                imgs.add(R.drawable.ic_filter_9_black_24dp);
                imgs.add(R.drawable.ic_filter_9_plus_black_24dp);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putStringArrayListExtra("Numbers",name);
                intent.putStringArrayListExtra("Trans",trans);
                intent.putIntegerArrayListExtra("Images",imgs);
                startActivity(intent);

            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> name=new ArrayList<>();
                ArrayList<String> trans=new ArrayList<>();
                ArrayList<Integer> imgs=new ArrayList<>();
                name.add("GrandFather");
                name.add("Grandmother");
                name.add("Father");
                name.add("Mother");
                name.add("Uncle");
                name.add("Aunty");
                name.add("Brother");
                name.add("Sister");

                trans.add("Dada");
                trans.add("Dadi");
                trans.add("Papa");
                trans.add("Mummy");
                trans.add("Chacha");
                trans.add("Chachi");
                trans.add("Bhai");
                trans.add("Behen");

                imgs.add(R.drawable.familyicon);
                imgs.add(R.drawable.familyicon);
                imgs.add(R.drawable.familyicon);
                imgs.add(R.drawable.familyicon);
                imgs.add(R.drawable.familyicon);
                imgs.add(R.drawable.familyicon);
                imgs.add(R.drawable.familyicon);
                imgs.add(R.drawable.familyicon);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putStringArrayListExtra("Numbers",name);
                intent.putStringArrayListExtra("Trans",trans);
                intent.putIntegerArrayListExtra("Images",imgs);
                startActivity(intent);

            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> name=new ArrayList<>();
                ArrayList<String> trans=new ArrayList<>();
                ArrayList<Integer> imgs=new ArrayList<>();
                name.add("Violet");
                name.add("Blue");
                name.add("Green");
                name.add("Yellow");
                name.add("Orange");
                name.add("Black");
                name.add("Red");
                name.add("White");

                trans.add("Bengani");
                trans.add("Neela");
                trans.add("Hara");
                trans.add("Peela");
                trans.add("Santri");
                trans.add("Kaala");
                trans.add("Lal");
                trans.add("Safaid");

                imgs.add(R.color.Violet);
                imgs.add(R.color.colorPrimary);
                imgs.add(R.color.Green);
                imgs.add(R.color.Yellow);
                imgs.add(R.color.Orange);
                imgs.add(R.color.Black);
                imgs.add(R.color.Red);
                imgs.add(R.color.White);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putStringArrayListExtra("Numbers",name);
                intent.putStringArrayListExtra("Trans",trans);
                intent.putIntegerArrayListExtra("Images",imgs);
                startActivity(intent);
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> name=new ArrayList<>();
                ArrayList<String> trans=new ArrayList<>();
                ArrayList<Integer> imgs=new ArrayList<>();
                name.add("Orange");
                name.add("Grapes");
                name.add("Apple");
                name.add("Pinapple");
                name.add("Peer");
                name.add("Guava");
                name.add("Banana");
                name.add("Pomegranate");

                trans.add("Santra");
                trans.add("Angoor");
                trans.add("Saeb");
                trans.add("Ananas");
                trans.add("Nashpati");
                trans.add("Amrood");
                trans.add("Kela");
                trans.add("Anaar");

                imgs.add(R.drawable.orange);
                imgs.add(R.drawable.grapes);
                imgs.add(R.drawable.apple);
                imgs.add(R.drawable.pineapple);
                imgs.add(R.drawable.pear);
                imgs.add(R.drawable.lime);
                imgs.add(R.drawable.banana);
                imgs.add(R.drawable.pomegranate);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putStringArrayListExtra("Numbers",name);
                intent.putStringArrayListExtra("Trans",trans);
                intent.putIntegerArrayListExtra("Images",imgs);
                startActivity(intent);

            }
        });
    }
}
