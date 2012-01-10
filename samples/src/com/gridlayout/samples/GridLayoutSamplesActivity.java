package com.gridlayout.samples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GridLayoutSamplesActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SAMPLES));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = SAMPLES[position];
        if (item.equals(SAMPLE_SIMPLE)) {
            startActivity(new Intent(this, SimpleGridLayoutActivity.class));
        }
        else if (item.equals(SAMPLE_VISIBILITY)) {
            startActivity(new Intent(this, GridLayoutVisibilityActivity.class));
        }
    }

    private static final String SAMPLE_SIMPLE = "Simple GridLayout Activity";

    private static final String SAMPLE_VISIBILITY = "GridLayout Visibility Activity";

    private static final String[] SAMPLES = new String[] { SAMPLE_SIMPLE, SAMPLE_VISIBILITY };
}