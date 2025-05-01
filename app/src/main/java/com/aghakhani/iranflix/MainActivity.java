package com.aghakhani.iranflix;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    String fruitNames[] = {"Banana", "Grape", "Guava", "Mango", "Orange", "Watermelon"};
    String fruitMessage[] = {"Banana is very Good", "Grape is very Good", "Guava is very Good", "Mango is very Good", "Orange is very Good", "Watermelon is very Good"};

    int fruitImageIds[] = {R.drawable.banana,
            R.drawable.grape,
            R.drawable.guava,
            R.drawable.mango,
            R.drawable.orange,
            R.drawable.watermelon};
    ListView listViewCategories,listViewMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        listViewCategories = findViewById(R.id.listViewCategories);
        ArrayList listCategories = new ArrayList();
        for ( int i = 0; i < fruitImageIds.length; i++) {

            HashMap<String, Object> map = new HashMap<>();
            map.put("fruitName", fruitNames[i]);
            map.put("fruitImage", fruitImageIds[i]);
            map.put("fruitMessage", fruitMessage[i]);
            listCategories.add(map);
        }
        String[] fromCategories = {"fruitName","fruitMessage", "fruitImage"};
        int toCategories[] = {R.id.textViewTitle,R.id.textViewMessage, R.id.imageView};

        SimpleAdapter simpleAdapterCategories = new SimpleAdapter(this, listCategories, R.layout.listview_items,fromCategories,toCategories);
        listViewCategories.setAdapter(simpleAdapterCategories);




         }
}