package com.gridlayout.samples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.gridlayout.GridLayout;

public class GridLayoutVisibilityActivity extends Activity {

    private GridLayout mGridLayout;
    private TextView mTextView1;
    private TextView mTextView2;
    
    int cycle = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gridlayout_visibility);

        mGridLayout = (GridLayout) findViewById(R.id.grid_layout);
        mTextView1 = (TextView) findViewById(R.id.textview1);
        mTextView2 = (TextView) findViewById(R.id.textview2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (cycle == 0) {
                    mTextView1.setVisibility(View.GONE);
                    mGridLayout.notifyChildVisibilityChanged();
                    cycle++;
                }
                else if (cycle == 1) {
                    mTextView2.setVisibility(View.GONE);
                    mGridLayout.notifyChildVisibilityChanged();
                    cycle++;
                }
                else {
                    mTextView1.setVisibility(View.VISIBLE);
                    mTextView2.setVisibility(View.VISIBLE);
                    mGridLayout.notifyChildVisibilityChanged();
                    cycle = 0;
                }
            }
        });
    }
}
