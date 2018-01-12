package alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.TwoActivities;

/*
 * Edited by Merry on 04/01/2018.
 */


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.util.Log;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.GitLink;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;


public class TwoActivities extends AppCompatActivity {

    //private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private EditText mMessageEditText;

    public static final int TEXT_REQUEST = 1;
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoactivities_activity_main);

        setTitle("Two Activities");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mMessageEditText = findViewById(R.id.editText_main);
        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);
    }

    public void launchSecondActivity(View view) {
        //Log.d(LOG_TAG, "Button clicked!");
        Toast.makeText(TwoActivities.this, "Message Sent!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, SecondActivity.class);

        String message = mMessageEditText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);

                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyTextView.setText(reply);
                mReplyTextView.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.git_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String GIT_URL = GitLink.TWOACT;
        switch (item.getItemId()) {
            case R.id.github:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(GIT_URL));
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
