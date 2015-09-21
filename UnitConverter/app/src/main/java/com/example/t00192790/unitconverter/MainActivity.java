package com.example.t00192790.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button con;
    EditText km;
    EditText mpg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        km = (EditText) findViewById(R.id.editText2);
        mpg = (EditText) findViewById(R.id.editText);
        con = (Button) findViewById(R.id.button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void Convert(View v) {
        double conversion;
        String conv;
        if(km.getText().toString().equals("") && mpg.getText().toString().equals("") ) {
            Toast toast = Toast.makeText(getApplicationContext(), "Please Enter a Value", Toast.LENGTH_SHORT);
            toast.show();
        }

        else if(mpg.getText().toString().equals("") ) {
            conversion = Double.parseDouble(km.getText().toString()) * 0.42;
            //conv = String.valueOf(conversion);
            mpg.setText(String.format("%.2f", conversion));
        }

        else if(km.getText().toString().equals("")) {
            conversion = Double.parseDouble(mpg.getText().toString()) * 2.35;
            //conv = String.valueOf(conversion);
            km.setText(String.format("%.2f", conversion));
        }

        else
        {
            conversion = Double.parseDouble(km.getText().toString()) * 0.42;
            //conv = String.valueOf(conversion);
            mpg.setText(String.format("%.2f", conversion));
        }

        }
}
