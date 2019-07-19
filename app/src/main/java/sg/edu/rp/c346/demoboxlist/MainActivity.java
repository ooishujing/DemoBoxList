package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvColours = findViewById(R.id.listViewColours);
        ArrayList<Colours> alColours = new ArrayList<Colours>();

        alColours.add(new Colours("Blue"));
        alColours.add(new Colours("Orange"));
        alColours.add(new Colours("Brown"));


        CustomAdapter caColour =new CustomAdapter(this, R.layout.row, alColours);
        lvColours.setAdapter(caColour);
    }
    }
