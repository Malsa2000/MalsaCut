package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Toolbar;

import java.util.ArrayList;

public class RecycellView extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList<product> product;
    Spinner spinner;
    TextView fliter ;
     story_Adapter storyAdapter1;
    ToggleButton view;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycell_view);

        setSupportActionBar(toolbar);


        recyclerView = findViewById(R.id.recycellView);
        fliter = findViewById(R.id.filter);
        spinner = findViewById(R.id.spanerr);
        view = findViewById(R.id.view);


        //spanerr

        ArrayAdapter<CharSequence> adapter1 =
                ArrayAdapter.createFromResource(this, R.array.order_By, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(this);

//Recycell View

        view.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (view.isChecked()) {
                    adapter = new MyAdapter(getApplicationContext(), product);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    view.setBackground(getDrawable(R.drawable.malsa));


                } else {
                    storyAdapter1 = new story_Adapter(getApplicationContext(), product);
                    recyclerView.setAdapter(storyAdapter1);
                    recyclerView.setHasFixedSize(true);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    view.setBackground(getDrawable(R.drawable.listi));

                }
            }
        });






    //add to array :
        if (getIntent().hasExtra("shose")) {
            product = new ArrayList<>();
            Toast.makeText(this, "shose section", Toast.LENGTH_SHORT).show();
            addtoshose();
        } else if (getIntent().hasExtra("foods")) {
            product = new ArrayList<>();
            addtofood();
        } else if (getIntent().hasExtra("computer")) {
            product = new ArrayList<>();
            addtocomputer();
        } else if (getIntent().hasExtra("fashion")) {
            product = new ArrayList<>();
            addtocloths();
        } else if (getIntent().hasExtra("cellphone")) {
            product = new ArrayList<>();
            addcellphone();
        } else if (getIntent().hasExtra("electroin")) {
            product = new ArrayList<>();
            adddivice();
        } else if (getIntent().hasExtra("books")) {
            product = new ArrayList<>();
            addbook();

        } else {
            product = new ArrayList<>();
            addoffic();
        }


    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case  0 :
                break;
            case 1:
                spinner.setBackgroundColor(Color.WHITE);
                break;
            case 2:
                spinner.setBackgroundColor(Color.WHITE);
                break;
            case 3:
                spinner.setBackgroundColor(Color.WHITE);
                break;

            case 4:
                spinner.setBackgroundColor(Color.WHITE);
                break;
            case 5:
                spinner.setBackgroundColor(Color.WHITE);
                break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    // menu item :

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.recycell , menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.bagshpping) {

            return true;
        }
        else if(id == R.id.searsh) {
            SearchView searchView = (SearchView) item.getActionView();
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {

                    Intent intent1 = new Intent(getApplicationContext(), nave_fragment.class);
                    intent1.putExtra(newText, 0);
                    startActivity(intent1);
                    Toast.makeText(getApplicationContext(),newText,Toast.LENGTH_SHORT).show();
                    return false;
                }
            });
        }
        return true;
    }
    public void addtoshose(){
        product.add(new product(R.drawable.sh1  , " Shose", "$25000", "652(.30%)"));
        product.add(new product(R.drawable.sh2    , "Running Shose", "$89600", "6666(.40%)"));
        product.add(new product(R.drawable.sh3    , "sport Shose", "$123000", "5666(.50%)"));
        product.add(new product(R.drawable.sh8  , " Shose", "$25000", "652(.30%)"));
        product.add(new product(R.drawable.sh5    , "Running Shose", "$89600", "6666(.40%)"));
        product.add(new product(R.drawable.sh6    , "sport Shose", "$123000", "5666(.50%)"));
        product.add(new product(R.drawable.sh3    , "sport Shose", "$123000", "5666(.50%)"));
        product.add(new product(R.drawable.sh5    , "Running Shose", "$89600", "6666(.40%)"));



    }
public void addtofood(){
    product.add(new product(R.drawable.food1 ,
                     "helhty food", "$10000", "7777(.20%)"));
    product.add(new product(R.drawable.food2 ,
            "main food", "$50000", "7447(.20%)"));
    product.add(new product(R.drawable.food3,
            "maxico food", "$80000", "2077(.20%)"));

    product.add(new product(R.drawable.food4,
            "spisy food", "$60000", "4447(.70%)"));

    product.add(new product(R.drawable.food1,
            "maxico food", "$80000", "2077(.20%)"));

    product.add(new product(R.drawable.food2,
            " food", "$50000", "2077(.20%)"));
    product.add(new product(R.drawable.food4,
            "spisy food", "$60000", "4447(.70%)"));

    }


    public void addtocloths(){
        product.add(new product(R.drawable.cl1,
                " dress", "$60000", "524(.20%)"));
        product.add(new product(R.drawable.cl2,
                " Dress 2", "$40000", "574(.20%)"));
        product.add(new product(R.drawable.cl3,
                " shert", "$8952", "235(.20%)"));

        product.add(new product(R.drawable.cl4,
                " sheat Read", "$77952", "235(.20%)"));
        product.add(new product(R.drawable.cl2,
                " Dress 2", "$40000", "574(.20%)"));
        product.add(new product(R.drawable.cl1,
                " dress", "$60000", "524(.20%)"));



    }
public void addtocomputer(){
    product.add(new product(R.drawable.co1,
                    "computer 2", "$60000", "524(.20%)"));
    product.add(new product(R.drawable.co3,
                    "labtop", "$40000", "520(.30%)"));
    product.add(new product(R.drawable.co2,
                    "computer Mac", "$80000", "5020(.50%)"));
    product.add(new product(R.drawable.co4,
                    "computer 7x", "$8952", "6004(.20%)"));
    product.add(new product(R.drawable.co7,
            "computer 2", "$60000", "524(.20%)"));
    product.add(new product(R.drawable.co9,
            "computer 2", "$60000", "524(.20%)"));
}

public void addcellphone(){
    product.add(new product(R.drawable.ph1,
                    "galaxy J7 x", "$20000", "5555(.20%)"));
    product.add(new product(R.drawable.ph2,
                    "hawawy", "$20070", "1110(10%)"));
    product.add(new product(R.drawable.ph3,
                    "i phone", "70000", "82205"));
    product.add(new product(R.drawable.ph4,
                    "galaxy J5", "7896", "24521"));
    product.add(new product(R.drawable.ph5,
            "galaxy", "7896", "24521"));
    product.add(new product(R.drawable.ph7,
            "i phone", "7896", "24521"));
    product.add(new product(R.drawable.ph8,
            "galaxy prime x", "7896", "24521"));
    product.add(new product(R.drawable.ipon1,
            "i phone 5", "7896", "24521"));
    product.add(new product(R.drawable.ipon2,
            "i phone 6", "7896", "24521"));
}

public void addbook() {
    product.add(new product(R.drawable.bo2,
            "boy name", "$60000", "524(.20%)"));
    product.add(new product(R.drawable.bo3,
            "Name jar", "$40000", "520(.30%)"));
    product.add(new product(R.drawable.bo1,
            "baby Name", "$80000", "5020(.50%)"));
    product.add(new product(R.drawable.bo3,
            "hous of name", "$8952", "6004(.20%)"));
    product.add(new product(R.drawable.bo3,
            "Name jar", "$40000", "520(.30%)"));
}

    public void addoffic(){
        product.add(new product(R.drawable.of1,
                    "office 12", "$8062", "20(50%.2)"));
        product.add(new product(R.drawable.of2,
                    "office 50", "$8000", "120(%20.0)"));
        product.add(new product(R.drawable.of3,
                    "office 80", "$5000", "(%50.0)"));
        product.add(new product(R.drawable.of1,
                    "office 60", "$70000", "(%10.0)"));
    }

    public void adddivice(){
        product.add(new product(R.drawable.divice2,
                "ear phone ", "$8062", "(10.0)"));
        product.add(new product(R.drawable.flay1,
                "Plane", "$8000", "(50.%)"));
        product.add(new product(R.drawable.co9,
                " divice 4", "$5000", "(80.%)"));

}}