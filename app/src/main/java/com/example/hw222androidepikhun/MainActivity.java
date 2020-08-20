package com.example.hw222androidepikhun;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//import android.widget.Toolbar;
//import android.support.v7.app.AppCompatActivity;
//import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        /*

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();

            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);

            return true;
        }

        */
        switch (id) {

            case R.id.action_open_notes:
                Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();

                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
                break;
            case R.id.action_open_paymet:
                Toast.makeText(MainActivity.this, "Отркыть ОПЛАТА", Toast.LENGTH_LONG).show();

                 intentNotes = new Intent(MainActivity.this, PayMetActivity.class);
                startActivity(intentNotes);
                break;

            case R.id.action_open_addrbook:
                Toast.makeText(MainActivity.this, "Отркыть АДРЕСНУЮ книжку", Toast.LENGTH_LONG).show();

                 intentNotes = new Intent(MainActivity.this, PayMetActivity.class);
                startActivity(intentNotes);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}