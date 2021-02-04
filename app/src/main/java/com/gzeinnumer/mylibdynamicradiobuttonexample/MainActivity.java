package com.gzeinnumer.mylibdynamicradiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.gzeinnumer.mylibdynamicradiobutton.DynamicRadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initWithPojo();
    }

    private void init() {
        DynamicRadioButton dynamicRadioButton = findViewById(R.id.dr_1);

        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Satu");
        listString.add("Dua");
        listString.add("Tiga");
        listString.add("Empat");

        dynamicRadioButton.setItemList(listString).setOnCheckedChangeListener(new DynamicRadioButton.OnCheckedChangeListener<String>() {
            @Override
            public void onCheckedChanged(String item) {
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initWithPojo() {
        DynamicRadioButton dynamicRadioButton = findViewById(R.id.dr_2);

        ArrayList<ExampleModel> listObject = new ArrayList<>();
        listObject.add(new ExampleModel(1, "Zein", "Balbar"));
        listObject.add(new ExampleModel(2, "Zein2", "Balbar2"));
        listObject.add(new ExampleModel(3, "Zein3", "Balbar3"));
        listObject.add(new ExampleModel(4, "Zein4", "Balbar4"));

        dynamicRadioButton.setItemList(listObject).setOnCheckedChangeListener(new DynamicRadioButton.OnCheckedChangeListener<ExampleModel>() {
            @Override
            public void onCheckedChanged(ExampleModel item) {
                Toast.makeText(MainActivity.this, item.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}