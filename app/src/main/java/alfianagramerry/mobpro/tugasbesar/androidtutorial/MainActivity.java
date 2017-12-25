package alfianagramerry.mobpro.tugasbesar.androidtutorial;

import android.app.Fragment;
import android.app.FragmentManager;
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
import alfianagramerry.mobpro.tugasbesar.androidtutorial.Root.Utama;

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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home_page) {
            fragment = new Utama();
            callFragment(fragment);
        } else if (id == R.id.pelajaran1) {
            fragment = new Lesson1();
            callFragment(fragment);
        } else if (id == R.id.pelajaran2) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran3) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran4) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran5) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran6) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran7) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran8) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran9) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pelajaran10) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.about) {
            Toast.makeText(getApplicationContext(), "On Progress", Toast.LENGTH_SHORT).show();
        }

        drawerLayout = findViewById(R.id.drawer);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}