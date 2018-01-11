package alfianagramerry.mobpro.tugasbesar.androidtutorial;

/*
 * Created by Alfian Hadi Pratama on 17/12/2017.
 */

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Learning.Learning;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.LessonFragment;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Root.AboutUs;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Root.Utama;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Root.Version;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    private Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.dibuka, R.string.ditutup);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            fragment = new Utama();
            callFragment(fragment);
        }
    }

    private void callFragment(android.app.Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Bundle key = new Bundle();

        switch (id) {
            case R.id.home_page:
                fragment = new Utama();
                callFragment(fragment);
                break;

            case R.id.pelajaran1:
                fragment = new LessonFragment();
                key.putString("title","Two Activities");
                key.putString("pdf","TwoActivities.pdf");
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo1));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran2:
                fragment = new LessonFragment();
                key.putString("title","Keyboard Samples");
                key.putString("pdf","KeyboardSamples.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran3:
                fragment = new LessonFragment();
                key.putString("title","Phone Number Spinner");
                key.putString("pdf","PhoneNumberSpinner.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran4:
                fragment = new LessonFragment();
                key.putString("title","Alert Sample");
                key.putString("pdf","AlertSample.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran5:
                fragment = new LessonFragment();
                key.putString("title","Date Time Picker");
                key.putString("pdf","DateTimePicker.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran6:
                fragment = new LessonFragment();
                key.putString("title","Droid Cafe");
                key.putString("pdf","DroidCafe.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran7:
                fragment = new LessonFragment();
                key.putString("title","Tab Lateral");
                key.putString("pdf","TabLateral.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran8:
                fragment = new LessonFragment();
                key.putString("title","Recycler View");
                key.putString("pdf","RecyclerView.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran9:
                fragment = new LessonFragment();
                key.putString("title","Material Me");
                key.putString("pdf","MaterialMe.pdf");
                key.putString("app", "MaterialMe");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran10:
                fragment = new LessonFragment();
                key.putString("title","Async Task");
                key.putString("pdf","AsyncTask.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran11:
                fragment = new LessonFragment();
                key.putString("title","Who Write App");
                key.putString("pdf","WhoWriteApp.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran12:
                fragment = new LessonFragment();
                key.putString("title","Notify Me");
                key.putString("pdf","NotifyMe.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;
            case R.id.pelajaran13:
                fragment = new LessonFragment();
                key.putString("title","HelloSharedPreference");
                key.putString("pdf","SharedPreference.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;
            case R.id.pelajaran14:
                fragment = new LessonFragment();
                key.putString("title","WordListSql");
                key.putString("pdf","WordList.pdf");
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.about:
                fragment = new AboutUs();
                callFragment(fragment);
                break;

            default:
                Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
                break;
        }

        drawerLayout = findViewById(R.id.drawer);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        drawerLayout = findViewById(R.id.drawer);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tambahan, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.version_id:
                fragment = new Version();
                callFragment(fragment);
                return true;
            case R.id.rate_us:
                rateUs();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void rateUs() {
        try
        {
            Toast.makeText(getApplicationContext(), "Support Us to 5 star. Thanks !", Toast.LENGTH_SHORT).show();
            Intent rateIntent = rateIntentForUrl("market://details");
            startActivity(rateIntent);
        }
        catch (ActivityNotFoundException e)
        {
            Toast.makeText(getApplicationContext(), "Support Us to 5 star. Thanks !", Toast.LENGTH_SHORT).show();
            Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
            startActivity(rateIntent);
        }
    }

    private Intent rateIntentForUrl(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
        int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
        if (Build.VERSION.SDK_INT >= 21)
        {
            flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        }
        else
        {
            //noinspection deprecation
            flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
        }
        intent.addFlags(flags);
        return intent;
    }

}