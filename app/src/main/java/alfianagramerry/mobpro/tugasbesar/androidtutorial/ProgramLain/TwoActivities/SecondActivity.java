package alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.TwoActivities;

/*
 * Edited by Merry on 04/01/2018.
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoactivities_activity_second);
        mReply = findViewById(R.id.editText_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(TwoActivities.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);


    }

    public void returnReply(View view) {
        Toast.makeText(SecondActivity.this, "Reply Sent!", Toast.LENGTH_SHORT).show();


        Intent replyIntent = new Intent();
        String reply = mReply.getText().toString();

        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
