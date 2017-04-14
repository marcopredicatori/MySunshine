package it.iochiamo.android.mysunshine;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> mForecastAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fakeData();
    }

    void fakeData() {

        String[] data = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"
        };

        List<String> weekForecast = new ArrayList<>(Arrays.asList(data));

        mForecastAdapter =
                new ArrayAdapter<String>(
                        this, // The current context (this activity)
                        R.layout.list_item_forecast, // The name of the layout ID.
                        R.id.list_item_forecast_textview, // The ID of the textview to populate.
                        weekForecast);

        Log.i("conta", Integer.toString(mForecastAdapter.getCount()));

        Log.i("x","1111111111111111111111");
        ListView listView = (ListView) findViewById(R.id.listview_forecast);
        Log.i("x","22222222222222222222222");

        listView.setAdapter(mForecastAdapter);
        Log.i("x","3333333333333333333333333");

    }
}
