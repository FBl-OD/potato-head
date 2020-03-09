package com.example.dressing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dressing();

    }

    @Override
    public void onConfigurationChanged (Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_main);
        dressing();
    }


    public void dressing(){
        CheckBox hat=findViewById(R.id.cb_hat);
        CheckBox glasses=findViewById(R.id.cb_glasses);
        CheckBox arms=findViewById(R.id.cb_arms);
        CheckBox ears=findViewById(R.id.cb_ears);
        CheckBox eyebrows=findViewById(R.id.cb_eyebrows);
        CheckBox eyes=findViewById(R.id.cb_eyes);
        CheckBox mouth=findViewById(R.id.cb_mouth);
        CheckBox mustache=findViewById(R.id.cb_mustache);
        CheckBox nose=findViewById(R.id.cb_nose);
        CheckBox shoes=findViewById(R.id.cb_shoes);
        final ImageView iv_hat=findViewById(R.id.iv_hat);
        final ImageView iv_glasses=findViewById(R.id.iv_glasses);
        final ImageView iv_arms=findViewById(R.id.iv_arms);
        final ImageView iv_ears=findViewById(R.id.iv_ears);
        final ImageView iv_eyebrows=findViewById(R.id.iv_eyebrows);
        final ImageView iv_eyes=findViewById(R.id.iv_eyes);
        final ImageView iv_mouth=findViewById(R.id.iv_mouth);
        final ImageView iv_mustache=findViewById(R.id.iv_mustache);
        final ImageView iv_nose=findViewById(R.id.iv_nose);
        final ImageView iv_shoes=findViewById(R.id.iv_shoes);

        hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_hat.setVisibility(View.VISIBLE);
                }else{
                    iv_hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_glasses.setVisibility(View.VISIBLE);
                }else{
                    iv_glasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        arms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_arms.setVisibility(View.VISIBLE);
                }else{
                    iv_arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_ears.setVisibility(View.VISIBLE);
                }else{
                    iv_ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_eyebrows.setVisibility(View.VISIBLE);
                }else{
                    iv_eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });
        eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_eyes.setVisibility(View.VISIBLE);
                }else{
                    iv_eyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_mouth.setVisibility(View.VISIBLE);
                }else{
                    iv_mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_mustache.setVisibility(View.VISIBLE);
                }else{
                    iv_mustache.setVisibility(View.INVISIBLE);
                }
            }
        });

        nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_nose.setVisibility(View.VISIBLE);
                }else{
                    iv_nose.setVisibility(View.INVISIBLE);
                }
            }
        });

        shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    iv_shoes.setVisibility(View.VISIBLE);
                }else{
                    iv_shoes.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
