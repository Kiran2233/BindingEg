package com.example.bindingeg;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.example.bindingeg.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mainBinding.rv1.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.rv1.setHasFixedSize(true);
        adapter = new RecyclerAdapter(this,prepareUser());
        mainBinding.rv1.setAdapter(adapter);
    }
    private List<Users> prepareUser()
    {
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.names));
        List<String> emails = Arrays.asList(getResources().getStringArray(R.array.emails));
        int[] imageId = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7};
        List<Users> Names = new ArrayList<>();
        int count = 0;
        for (String name: names
             ) {
            Names.add(new Users(name,emails.get(count),imageId[count]));
            count++;
        }

        return Names;
    }


}
