package alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.PhoneNumberSpinner;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class PhoneNumberSpinner extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private static final String TAG = PhoneNumberSpinner.class.getSimpleName();
    // Define mSpinnerLabel for the label (the spinner item that the user chooses).
    private String mSpinnerLabel = "";

    /**
     * Set the content view, create the spinner, and create the array adapter for the spinner.
     * @param savedInstanceState    Saved instance.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonenumberspinner_activity_main);

        setTitle("Phone Number Spinner");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }

    /**
     * Retrieves the text and spinner item and shows them in text_phonelabel.
     * @param view  The view containing editText_main.
     */
    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.editText_main);
        if (editText != null) {
            // Assign to showString both the entered string and mSpinnerLabel.
            String showString = (editText.getText().toString() + " - " + mSpinnerLabel);
            // Assign to phoneNumberResult the view for text_phonelabel to prepare to show it.
            TextView phoneNumberResult = (TextView) findViewById(R.id.text_phonelabel);
            // Show the showString in the phoneNumberResult.
            if (phoneNumberResult != null) phoneNumberResult.setText(showString);
        }
    }

    /**
     * Retrieves the selected item in the spinner using getItemAtPosition,
     * and assigns it to mSpinnerLabel.
     * @param adapterView   The adapter for the spinner, where the selection occurred.
     * @param view          The view within the adapterView that was clicked.
     * @param pos             The position of the view in the adapter.
     * @param id             The row id of the item that is selected (not used here).
     */
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        mSpinnerLabel = adapterView.getItemAtPosition(pos).toString();
        showText(view);
    }

    /**
     * Logs the fact that nothing was selected in the spinner.
     * @param adapterView The adapter for the spinner, where the selection should have occurred.
     */
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, getString(R.string.nothing_selected));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.git_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.github:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/merrymarst/KeyboardSamples/"));
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
