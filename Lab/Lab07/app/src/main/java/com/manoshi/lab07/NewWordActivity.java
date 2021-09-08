package com.manoshi.lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.manoshi.lab07.REPLY";
    public static final String EXTRA_REPLY_ID = "com.manoshi.lab07.REPLY_ID";

    private EditText mEditWordView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);

        mEditWordView = findViewById(R.id.edit_word);
        int id = -1;

        final Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String word = extras.getString(EXTRA_DATA_UPDATE_WORD, "");
            if (!word.isEmpty()) {
                mEditWordView.setText(word);
                mEditWordView.setSelection(word.length());
                mEditWordView.requestFocus();
            }
        }
    }
}