package alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.HelloWorld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld_activity_main);

        setTitle("Hello World");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
