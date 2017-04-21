package it.iochiamo.android.mysunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        This part starts the fragment
         */
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    public static class PlaceholderFragment extends Fragment {


        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            // Inflate the layout for this fragment
            ArrayList<String> weekForecastArray = new ArrayList<>();

            int i = 0;
            while (i < 40) {
                weekForecastArray.add("Weather Forecast for day " + Integer.toString(i + 1));
                i++;
            }
            ArrayAdapter<String> mForecastAdapter;

            mForecastAdapter =
                    new ArrayAdapter<String>(
                            getContext(), // The current context (this activity)
                            R.layout.list_item_forecast, // The name of the layout ID.
                            R.id.list_item_forecast_textview, // The ID of the textview to populate.
                            weekForecastArray);

            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

            listView.setAdapter(mForecastAdapter);


            return rootView;
        }
    }

}
