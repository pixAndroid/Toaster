package com.example.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(View view) {

        /*Toast mToast;
        mToast = Toast.makeText(getApplicationContext(), "Welcome to Toaster", Toast.LENGTH_SHORT);
        mToast.setGravity(Gravity.TOP|Gravity.START, 0, 0);
        mToast.show();*/

         //Toast.makeText(this, "Test Message", Toast.LENGTH_SHORT).show();

        LayoutInflater inflater = getLayoutInflater();
        View customToastLayout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.root_layout));

        TextView txtMessage = customToastLayout.findViewById(R.id.txt_message);
        txtMessage.setText("Welcome to Toaster");

        Toast mToast = new Toast(getApplicationContext());
        mToast.setDuration(Toast.LENGTH_LONG);
        mToast.setView(customToastLayout);
        mToast.show();


    }
}