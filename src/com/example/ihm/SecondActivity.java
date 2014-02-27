package com.example.ihm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity_main);
		Intent intent = getIntent();
		String login = intent.getStringExtra(MainActivity.INTENT_LOGIN);
		String password = intent.getStringExtra(MainActivity.INTENT_PASSWORD);

		TextView loginText = (TextView) findViewById(R.id.myLogin);
		loginText.setText(login);
		TextView passwordText = (TextView) findViewById(R.id.myPassword);
		passwordText.setText(login);
	}
}
