package com.sinothk.switchbutton.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sinothk.widget.switchButton.SwitchButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchButton switchButton = (SwitchButton) findViewById(R.id.switch_button);
//        switchButton.setChecked(true);
//        switchButton.isChecked();
//        switchButton.toggle();     //switch state
//        switchButton.toggle(false);//switch without animation
//        switchButton.setShadowEffect(true);//disable shadow effect
//        switchButton.setEnabled(false);//disable button
//        switchButton.setEnableEffect(false);//disable the switch animation
        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                Toast.makeText(MainActivity.this, "" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
