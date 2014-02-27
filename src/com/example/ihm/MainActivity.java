package com.example.ihm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static String INTENT_LOGIN = "";
    public static String INTENT_PASSWORD = "";


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

	/** Called when the user clicks the Send button */
	public void connect(View view) {
		Intent intent = new Intent(this, SecondActivity.class);
	    EditText login = (EditText) findViewById(R.id.login);
	    EditText password = (EditText) findViewById(R.id.password);
	    
		intent.putExtra(MainActivity.INTENT_LOGIN, login.getText().toString());
		intent.putExtra(MainActivity.INTENT_PASSWORD, password.getText().toString());
		
		if(login.getText().toString().equals(password.getText().toString())  && !login.getText().toString().equals("")){
			startActivity(intent);
		}
		
	    
	}
	
	/** Called when the user clicks the Send button */
	public void cancel(View view) {
		EditText login = (EditText)findViewById(R.id.login);
		login.setText("");
		EditText password = (EditText)findViewById(R.id.password);
		password.setText("");	    
	}
}
