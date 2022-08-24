package com.example.malsacut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Locale;

public class Searsh_activity extends AppCompatActivity {

    LinearLayout linearLayout;
    SearchView simpleSearchView;
    ImageView imageView;
ListView listView;
    private  int refreshCount = 0;
    ArrayList<String> searshArray;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searsh_activity);

        linearLayout =(LinearLayout) findViewById(R.id.lineSearsh);
         simpleSearchView = (SearchView) findViewById(R.id.simpleSearchView);
         imageView = findViewById(R.id.searshimg);
        listView = findViewById(R.id.listsearsh);

        searshArray = new ArrayList<>();


        ArrayAdapter<String> adep = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,searshArray);
        listView.setAdapter(adep);
        adep.notifyDataSetChanged();



        CharSequence queryHint = simpleSearchView.getQueryHint();
        boolean isIconfied=simpleSearchView.isIconfiedByDefault();
        simpleSearchView.setIconifiedByDefault(false);
        simpleSearchView.setQueryHint("Search View");
        simpleSearchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
            }
        });


        simpleSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {


                refreshCount++;
                searshArray.add(refreshCount++ +  "-"+ query );
                listView.setVisibility(View.VISIBLE);


                if(query.equals("foods") | query.equals("shoes") |query.equals("cellphone")
                        |query.equals("books") |query.equals("electroin") |query.equals("office") |
                        query.equals("fashion") |query.equals("collection"  )){

                    Intent i = new Intent(getApplicationContext(),Home.class );
                    i.putExtra("q",query);
                    startActivity(i);
                }

                else{

                         imageView.setVisibility(View.VISIBLE);
                         listView.setVisibility(View.GONE);
                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
//                if(newText == "foods" |newText == "shoes" |newText == "cellphone"
//                        |newText == "books" |newText == "electroin" |newText == "office"
//                        |newText == "fashion" |newText == "collection"  ){
//                    Intent i = new Intent(this,Home.class );

                            return false;
            }
        });
    }
}
