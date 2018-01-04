package alfianagramerry.mobpro.tugasbesar.androidtutorial;

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
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson1;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson2;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson3;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson4;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson5;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson6;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson7;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson8;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson9;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson10;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Lesson.Lesson11;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Root.Utama;
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Root.Version;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private android.support.v7.widget.Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private FragmentManager fragmentManager;
    private Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.dibuka, R.string.ditutup);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            fragment = new Utama();
            callFragment(fragment);
        }
    }

    private void callFragment(android.app.Fragment fragment) {
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.home_page:
                fragment = new Utama();
                callFragment(fragment);
                break;
            case R.id.pelajaran1:
                fragment = new Lesson1();
                callFragment(fragment);
                break;
            case R.id.pelajaran2:
                fragment = new Lesson2();
                callFragment(fragment);
                break;
            case R.id.pelajaran3:
                fragment = new Lesson3();
                callFragment(fragment);
                break;
            case R.id.pelajaran4:
                fragment = new Lesson4();
                callFragment(fragment);
                break;
            case R.id.pelajaran5:
                fragment = new Lesson5();
                callFragment(fragment);
                break;
            case R.id.pelajaran6:
                fragment = new Lesson6();
                callFragment(fragment);
                break;
            case R.id.pelajaran7:
                fragment = new Lesson7();
                callFragment(fragment);
                break;
            case R.id.pelajaran8:
                fragment = new Lesson8();
                callFragment(fragment);
                break;
            case R.id.pelajaran9:
                fragment = new Lesson9();
                callFragment(fragment);
                break;
            case R.id.pelajaran10:
                fragment = new Lesson10();
                callFragment(fragment);
                break;
            case R.id.pelajaran11:
                fragment = new Lesson11();
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
                Intent intent = new Intent(this, Version.class);
                startActivity(intent);
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