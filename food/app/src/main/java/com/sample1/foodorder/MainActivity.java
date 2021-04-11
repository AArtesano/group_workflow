package com.sample1.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Order order;
    TextView total;
    double total_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order = new Order();
        total = findViewById(R.id.textView2);

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

    }

}
