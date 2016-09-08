package com.example.lenovo.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private final static String Name="name";
    private final static String Class="class";
    private final static String No="no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names={"张思含","解思琦","王娟","金霄"};
        String[] classs={"软工1401","软工1402","软工1401","软工1401"};
        String[] nos={"111111","222222","333333","444444"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<names.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(Name, names[i]);
            item.put(Class, classs[i]);
            item.put(No, nos[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{Name,Class,No},new int[]{R.id.txtName,R.id.txtClass,R.id.txtNo});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}

