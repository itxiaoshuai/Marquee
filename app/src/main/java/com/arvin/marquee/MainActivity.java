package com.arvin.marquee;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void showDialog(View v){
		AlertDialog.Builder builder= new AlertDialog.Builder(this);
		builder.setTitle("吓死宝宝了");
		builder.show();
	}


}
