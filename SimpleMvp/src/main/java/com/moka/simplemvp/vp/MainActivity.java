package com.moka.simplemvp.vp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.moka.simplemvp.R;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.frameLayout, new MainFragment())
				.commit();
	}

}
