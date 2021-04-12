package com.sample1.foodorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Order order;
    TextView total;
    double total_price;
    TextView delivery;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order = new Order();
        total = findViewById(R.id.textView2);
        delivery = findViewById(R.id.switch1);

        button = (Button) findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUs();
            }
        });
    }

    public void openAboutUs() {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void onCheckboxClicked(View view) {
        //checked
        boolean checked = ((CheckBox) view).isChecked();
        //code
        switch (view.getId()){
            case R.id.checkBox:
                if(checked)
                    order.setBurger(50);
                else
                    order.setBurger(0);
                break;
            case R.id.checkBox2:
                if(checked)
                    order.setPasta(100);
                else
                    order.setPasta(0);
                break;
            case R.id.checkBox3:
                if(checked)
                    order.setCola(45);
                else
                    order.setCola(0);
                break;
            case R.id.checkBox4:
                if(checked)
                    order.setCoffee(35);
                else
                    order.setCoffee(0);
                break;

        }
        total.setText("TOTAL PRICE: " + calculate_total() + "PHP");
    }
    private double calculate_total() {
        total_price = order.getBurger()+order.getCoffee()+order.getCola()+order.getPasta();
        return total_price;
}
    public void onSwitchClicked(View view) {
        Switch swButton = (Switch) view;
        if (swButton.isChecked()) {
            delivery.setText("Yes");
        } else
            delivery.setText("");

}}
