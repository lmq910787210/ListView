package com.example.helloworld;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String PRODUCT="product";
    private final static String PRICE="price";
    private final static String CONFIGURATION="configuration";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] products={"学生1","学生2","学生3","学生4"};
        String[] prices={"201","202","203","204"};
        String[] configurations={"卢梦琪 ，计科1506，女，19970402","毛锐气 ，计科1506，女,19970813","赵月，计科1506，女,19970510","洋芋肖 ，计科1506，女，19970321"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<products.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(PRODUCT, products[i]);
            item.put(PRICE, prices[i]);
            item.put(CONFIGURATION, configurations[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{PRODUCT,PRICE,CONFIGURATION},new int[]{R.id.txtProduct,R.id.txtPrice,R.id.txtConfiguration});

        ListView list=(ListView)findViewById(R.id.listview1);

        list.setAdapter(adapter);
         }
    }

