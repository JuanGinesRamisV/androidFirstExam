package com.example.examenjuanginesramis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button sizeButton;
    private Button colorButton;

    private EditText editText;

    private TextView textFragment2;

    private SeekBar sizeSeekBar;
    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;

    private int rojo=0;
    private int azul=0;
    private int verde=0;
    private int size=10;

    //<editor-fold desc="Getteres and setters">
    public void setSize(int size) {
        this.size = size;
    }

    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        this.verde = verde;
    }
    //</editor-fold>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
        addLogicButtons();
        this.textFragment2.setText(this.editText.getText());
        addLogicSeekBar();
    }

    public void loadViews(){
        sizeButton= findViewById(R.id.sizeBtn);
        this.colorButton = findViewById(R.id.changeColorBtn);

        this.editText = findViewById(R.id.editableText);

        textFragment2 = findViewById(R.id.fragment2Text);

        this.sizeSeekBar= findViewById(R.id.seekBarTamaño);
        this.redSeekBar = findViewById(R.id.redSeekBar);
        this.greenSeekBar = findViewById(R.id.greenSeekBar);
        this.blueSeekBar = findViewById(R.id.blueSeekBar);
    }

    public void addLogicButtons(){
        this.sizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText();

            }
        });

        this.colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeColor();
            }
        });
    }

    public void addLogicSeekBar(){
        this.sizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                setSize(sizeSeekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        this.blueSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                setAzul(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                setVerde(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        redSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                setRojo(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void changeText(){
        this.textFragment2.setText(this.editText.getText());
        textFragment2.setTextSize(this.size);
    }

    public void changeColor(){
        int color = Color.rgb(rojo,verde,azul);
        this.textFragment2.setTextColor(color);
    }

}