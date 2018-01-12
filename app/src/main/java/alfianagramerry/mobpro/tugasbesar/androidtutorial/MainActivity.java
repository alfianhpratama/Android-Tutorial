package alfianagramerry.mobpro.tugasbesar.androidtutorial;

/*
 * Created by Alfian Hadi Pratama on 17/12/2017.
 */

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
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
import android.view.KeyEvent;
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

            case R.id.pelajaran11:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul1));
                key.putString("pdf",getResources().getString(R.string.materi1));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo1));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran12:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul2));
                key.putString("pdf",getResources().getString(R.string.materi2));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo2));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran13:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul3));
                key.putString("pdf",getResources().getString(R.string.materi3));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo3));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran21:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul4));
                key.putString("pdf",getResources().getString(R.string.materi4));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo4));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran41:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul5));
                key.putString("pdf",getResources().getString(R.string.materi5));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo5));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran42:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul6));
                key.putString("pdf",getResources().getString(R.string.materi6));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo6));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran43:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul7));
                key.putString("pdf",getResources().getString(R.string.materi7));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo7));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran44:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul8));
                key.putString("pdf",getResources().getString(R.string.materi8));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo8));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran52:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul9));
                key.putString("pdf",getResources().getString(R.string.materi9));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo9));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran53:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul10));
                key.putString("pdf",getResources().getString(R.string.materi10));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo10));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran61:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul11));
                key.putString("pdf",getResources().getString(R.string.materi11));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo11));
                fragment.setArguments(key);
                callFragment(fragment);
                break;

            case R.id.pelajaran71:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul12));
                key.putString("pdf",getResources().getString(R.string.materi12));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo12));
                fragment.setArguments(key);
                callFragment(fragment);
                break;
            case R.id.pelajaran81:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul13));
                key.putString("pdf",getResources().getString(R.string.materi13));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo13));
                fragment.setArguments(key);
                callFragment(fragment);
                break;
            case R.id.pelajaran91:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul14));
                key.putString("pdf",getResources().getString(R.string.materi14));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo14));
                fragment.setArguments(key);
                callFragment(fragment);
                break;
            case R.id.pelajaran112:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul15));
                key.putString("pdf",getResources().getString(R.string.materi15));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo15));
                fragment.setArguments(key);
                callFragment(fragment);
                break;
            case R.id.pelajaran131:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul16));
                key.putString("pdf",getResources().getString(R.string.materi16));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo16));
                fragment.setArguments(key);
                callFragment(fragment);
                break;
            case R.id.pelajaran132:
                fragment = new LessonFragment();
                key.putString("title",getResources().getString(R.string.judul17));
                key.putString("pdf",getResources().getString(R.string.materi17));
                key.putStringArray("data", getResources().getStringArray(R.array.judul_demo17));
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
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            //moveTaskToBack(false);

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Do you want to exit application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {

                        finish();
                        //close();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();

    }

}