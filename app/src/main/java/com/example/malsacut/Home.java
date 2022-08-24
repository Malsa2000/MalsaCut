package com.example.malsacut;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.mikhaellopez.circularimageview.CircularImageView;

public class Home extends AppCompatActivity {

    DrawerLayout drawer;
    NavigationView nav;
    Toolbar toolbar;

    final static int p =1;

    CircularImageView userimg;
    Uri img_url;
RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


   //     userimg =(ImageView) findViewById(R.id.userimg);
//        userimg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent gallery = new Intent();
//                gallery.setType("image/*");
//                gallery.setAction(Intent.ACTION_GET_CONTENT);
//                startActivityForResult(Intent.createChooser(gallery,"select image"),p);
//            }
//        });

        toolbar = findViewById(R.id.toolBar1);
        nav = findViewById(R.id.nav_view);
             setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle togel = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.open, R.string.close);

        drawer.addDrawerListener(togel);
        togel.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(Home.this, Home.class);
                        startActivity(intent);
                        return true;
                    case R.id.catog:
                        Intent i = new Intent(Home.this, button_act.class);
                        startActivity(i);
                        return true;
                    case R.id.order:
                        Intent in = new Intent(Home.this, Selling_thinghs.class);
                        startActivity(in);
                        return true;
                    case R.id.wish:
                        Intent in1 = new Intent(Home.this, lovelist.class);
                        startActivity(in1);
                        return true;
                    case R.id.setting:
                        Intent in2 = new Intent(Home.this, Setting.class);
                        startActivity(in2);
                        return true;

                    case R.id.notif:
                        Intent intent7 = new Intent(Home.this, MyOrder.class);
                        startActivity(intent7);
                        break;
                    case R.id.feed:
//                        Intent intent8 = new Intent(Home.this, Home.class);
//                        startActivity(intent8);
                        break;

                }

                return true;
            }
        });




    BottomNavigationView bottomnav = findViewById(R.id.bottom_nav);
        bottomnav.setOnNavigationItemSelectedListener(navlisener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contener, new nave_fragment()).commit();


    }


    private BottomNavigationView.OnNavigationItemSelectedListener navlisener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selected = null;
                    switch (item.getItemId()) {
                        case R.id.bagshpping:
                            selected = new nave_fragment();
                            break;
                        case R.id.searsh:
                             selected = new deliveryFragment();
                            break;
                        case R.id.bag:
                            selected = new bagFragment();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contener,
                            selected).commit();
                    return true;
                }
            };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_nav, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.bagshpping) {
            return true;
        }

        else if(id == R.id.searsh){

SearchView searchView = (SearchView) item.getActionView();
searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
    @Override
    public boolean onQueryTextSubmit(String query) {

        Bundle bundle = new Bundle();
        bundle.putString("query",query);
// set Fragmentclass Arguments
        nave_fragment fragobj = new nave_fragment();
        fragobj.setArguments(bundle);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

     Intent intent1 = new Intent(getApplicationContext(), nave_fragment.class);
     intent1.putExtra("newText",newText);
     startActivity(intent1);




     //   Toast.makeText(getApplicationContext(),newText,Toast.LENGTH_SHORT).show();
        return false;
    }
});
        }



        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == p && resultCode == RESULT_OK){

            img_url = data.getData();
            try {

                Bitmap b = MediaStore.Images.Media.getBitmap(getContentResolver(),img_url);
                userimg.setImageBitmap(b);
            }catch (Exception e){
                e.printStackTrace();
            }

        }}
    }
