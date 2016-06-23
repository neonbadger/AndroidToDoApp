package com.example.android.simpletodoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

// import android.view.Menu;

public class EditItemActivity extends AppCompatActivity {
    EditText etToDoItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etToDoItem = (EditText) findViewById(R.id.etToDoItem);
        String toDoItem = getIntent().getStringExtra("itemList");
        etToDoItem.setText(toDoItem);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_item, menu);
        return true;
    }

    public void onEditItem(View view) {
        String editToDo = etToDoItem.getText().toString();
        Intent data = new Intent();
        data.putExtra("itemList", editToDo);
        setResult(RESULT_OK, data);
        finish();
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
