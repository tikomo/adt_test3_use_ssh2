package com.example.sharedpreferencestest;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void buttonRead_onClick(View view) {
		// Toast.makeText(getApplicationContext(), "Read", Toast.LENGTH_SHORT).show();
		
		// Read
		
	    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    String str = sp.getString("allon", "‚Í‚¢");
	    
	    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
	    
		/*
		EditText editText = (EditText)findViewById(R.id.EditText01);
	    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    editText.setText(sp.getString("SaveString", null), BufferType.NORMAL);
	    */
	}

	public void buttonSave_onClick(View view) {
		Toast.makeText(getApplicationContext(), "Save", Toast.LENGTH_SHORT).show();
		
		// Save
		
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        sp.edit().putString("allon", "‚¨‚Í‚æ‚¤‚³‚ñ").commit();
        
		/*
		EditText editText = (EditText)findViewById(R.id.EditText01);
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        sp.edit().putString("allonSTring", editText.getText().toString()).commit();
        */
	}
}
