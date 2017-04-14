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

        ArrayList<String> weekForecastArray = new ArrayList<>();

        int i = 0;
        while (i<40) {
            weekForecastArray.add("Weather Forecast for day "+Integer.toString(i+1));
            //Log.i("Inserted arraylist el. "+Integer.toString(i),weekForecastArray.get(i));
            i++;
        }

        mForecastAdapter =
                new ArrayAdapter<String>(
                        this, // The current context (this activity)
                        R.layout.list_item_forecast, // The name of the layout ID.
                        R.id.list_item_forecast_textview, // The ID of the textview to populate.
                        weekForecastArray);

        ListView listView = (ListView) findViewById(R.id.listview_forecast);

        listView.setAdapter(mForecastAdapter);

    }
}
