package com.sageone.codingtask2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by neil.wilkinson on 25/01/16.
 */
public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.profile_activity);

        ((TextView)findViewById(R.id.name)).setText(MyState.getInstance().getName());
    }
}
