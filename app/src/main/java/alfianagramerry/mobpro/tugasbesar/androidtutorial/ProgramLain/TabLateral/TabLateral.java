package alfianagramerry.mobpro.tugasbesar.androidtutorial.ProgramLain.TabLateral;

/*
 * Created by Alfian Hadi Pratama on 03/01/2018.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import alfianagramerry.mobpro.tugasbesar.androidtutorial.R;

public class TabLateral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablateral_activity_main);

        setTitle("Tab Lateral");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //	Create	an	instance	of	the	tab	layout	from	the	view.
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        //	Set	the	text	for	each	tab.
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label1));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label2));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_label3));
        //	Set	the	tabs	to	fill	the	entire	layout.
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //	Use	PagerAdapter	to	manage	page	views	in	fragments.

        //	Using	PagerAdapter	to	manage	page	views	in	fragments.
        // 	Each	page	is	represented	by	its	own	fragment.
        // 	This	is	another	example	of	the	adapter	pattern.
        final ViewPager viewPager = findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        //	Setting	a	listener	for	clicks.

        //	Setting	a	listener	for	clicks.
        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new	TabLayout.OnTabSelectedListener()	{
            @Override
            public void onTabSelected(TabLayout.Tab	tab)	{
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected (TabLayout.Tab tab){
            }
            @Override
            public void onTabReselected (TabLayout.Tab tab){
            }
        });
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
