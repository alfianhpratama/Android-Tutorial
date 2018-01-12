package alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.AlertSample;

/*
 * Created by Agra on 02/01/2018.
 */

/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.GitLink;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

/**
 * This app shows a button to trigger a standard alert dialog.
 */
public class AlertSample extends AppCompatActivity {

    /**
     * Creates the view.
     *
     * @param savedInstanceState The saved instance.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alertsample_activity_main);
        setTitle("Alert Sample");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /**
     * Builds a standard alert dialog,
     * using setTitle to set its title, setMessage to set its message,
     * and setPositiveButton and setNegativeButton to set its buttons.
     * Defines toast messages to appear depending on which alert
     * button is clicked.
     * Shows the alert.
     *
     * @param view The activity's view in which the alert will appear.
     */
    public void onClickShowAlert(View view) {
        // Build the alert dialog.
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(AlertSample.this);
        // Set the dialog title.
        myAlertBuilder.setTitle(R.string.alert_title);
        // Set the dialog message.
        myAlertBuilder.setMessage(R.string.alert_message);
        // Add the buttons.
        myAlertBuilder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // User clicked OK button.
                Toast.makeText(getApplicationContext(), R.string.pressed_ok,
                        Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // User clicked the CANCEL button.
                Toast.makeText(getApplicationContext(), R.string.pressed_cancel,
                        Toast.LENGTH_SHORT).show();
            }
        });

        myAlertBuilder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.git_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String GIT_URL = GitLink.ALERT;
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