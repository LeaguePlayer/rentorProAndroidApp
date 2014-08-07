package com.amobile.rentor;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class SignInActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.sign_in, menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sign_in, menu);

        ActionBar actionBar = getActionBar();
        actionBar.setSubtitle("какой то текст");
        actionBar.setTitle("vogella.com");
        actionBar.hide();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_refresh) {
            Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void loginButton_Click(View view) {
        Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT).show();
    }
}
