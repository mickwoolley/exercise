package com.mickw.mickw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mickw.mickw.query.JsonRequestTask;
import com.mickw.mickw.query.JsonResponseProcessor;


public class StartActivity extends Activity {

    public static final String EXERCISE_URL =
            "https://www.bespokeoffers.co.uk/mobile-api/v1/offers.json?page_size=10&page=1";
    public static final String JSON = "jsonData";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClickStartExerciseActivity(View view) {
        JsonRequestTask requestor = new JsonRequestTask(
                new JsonResponseProcessor() {
                    public void process(String json) {
                        Intent exercise = new Intent(StartActivity.this, OrderItemListActivity.class);
                        exercise.putExtra(JSON, json);
                        startActivity(exercise);
                    }
                }
        );
        requestor.execute(EXERCISE_URL);

    }
}
