package com.sageone.codingtask2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button profileButton = (Button) findViewById(R.id.profile_button);
        final Button statusButton = (Button) findViewById(R.id.status_button);

        profileButton.setOnClickListener(this);
        statusButton.setOnClickListener(this);

        nameField = (EditText) findViewById(R.id.name_input);
    }

    @Override
    public void onClick(final View v) {
        final Editable text = nameField.getText();
        if (text == null || text.length() == 0) {
            Toast.makeText(this, "Enter a name", Toast.LENGTH_SHORT).show();
        } else {

            MyState.getInstance().setName(text.toString());

            final Class clazz;
            switch (v.getId()) {
                default:
                case R.id.profile_button:
                    clazz = ProfileActivity.class;
                    break;
                case R.id.status_button:
                    clazz = StatusActivity.class;
                    break;
            }

            startActivity(new Intent(this, clazz));
        }
    }
}
