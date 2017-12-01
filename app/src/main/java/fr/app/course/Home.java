package fr.app.course;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private int i = 1;
    private ListView listView;
    private Button buttonAdd;
    private Button buttonDelAll;
    private List<String> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView            = findViewById(R.id.activity_home_list_view);
        buttonAdd           = findViewById(R.id.activity_home_button_add);
        buttonDelAll        = findViewById(R.id.activity_home_button_delete_all);
    }


    @Override
    protected void onStart() {
        super.onStart();
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movies.add("Film " +i);
                ArrayAdapter<String> coursesAdapter = new ArrayAdapter<>(Home.this, android.R.layout.simple_list_item_1, movies);
                listView.setAdapter(coursesAdapter);
                i++;
            }
        });

        buttonDelAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movies.removeAll(movies);
                ArrayAdapter<String> coursesAdapter = new ArrayAdapter<>(Home.this, android.R.layout.simple_list_item_1, movies);
                listView.setAdapter(coursesAdapter);
                i = 1;
            }
        });
    }
}
