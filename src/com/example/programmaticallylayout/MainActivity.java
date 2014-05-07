package com.example.programmaticallylayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	LinearLayout mainLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mainLayout = (LinearLayout)findViewById(R.id.relativeHolder);   
		
		loadView();
	}
	
	private void loadView(){
	 
		LinearLayout frameLayout = new LinearLayout(this);
		LinearLayout.LayoutParams frameLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT); 
		frameLayout.setLayoutParams(frameLayoutParam); 
		frameLayout.setBackgroundColor(Color.RED); 
		mainLayout.addView(frameLayout);
		
		ImageView imageTeacher = new ImageView(this);  
		RelativeLayout.LayoutParams imgteacherparam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
		imgteacherparam.setMargins(10, 10, 10, 0);
		imgteacherparam.width = 100;
		imgteacherparam.height = 100;
		imageTeacher.setBackgroundColor(Color.RED); 
		imageTeacher.setLayoutParams(imgteacherparam);
		//imageTeacher.setId(idctr);
		imageTeacher.setBackgroundResource(R.drawable.teacher);
		frameLayout.addView(imageTeacher); 
		
		
		LinearLayout frameLayout2 = new LinearLayout(this);
		LinearLayout.LayoutParams frameLayoutParam2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT); 
		frameLayout2.setLayoutParams(frameLayoutParam2); 
		frameLayout2.setBackgroundColor(Color.RED);
		frameLayout2.setOrientation(LinearLayout.VERTICAL);
		frameLayout.addView(frameLayout2);  
		
		TextView imageTeacher2 = new TextView(this);  
		LinearLayout.LayoutParams imgteacherparam2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
		imgteacherparam2.setMargins(10, 0, 0, 0); 
		imageTeacher2.setBackgroundColor(Color.WHITE); 
		imageTeacher2.setLayoutParams(imgteacherparam2);
		//imageTeacher.setId(idctr); 
		imageTeacher2.setText("ss");
		frameLayout2.addView(imageTeacher2); 
		
		TextView imageTeacher3 = new TextView(this);  
		LinearLayout.LayoutParams imgteacherparam3 = new LinearLayout.LayoutParams(230 ,LinearLayout.LayoutParams.WRAP_CONTENT); 
		imgteacherparam3.setMargins(10, 5, 0, 0); 
		imageTeacher3.setBackgroundColor(Color.BLUE); 
		imageTeacher3.setLayoutParams(imgteacherparam3); 
		imageTeacher3.setText("sssss");
		frameLayout2.addView(imageTeacher3); 
		
		TextView imageTeacher4 = new TextView(this);  
		LinearLayout.LayoutParams imgteacherparam4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT); 
		imgteacherparam4.setMargins(10, 5, 0, 0); 
		imageTeacher4.setBackgroundColor(Color.BLUE); 
		imageTeacher4.setLayoutParams(imgteacherparam4); 
		imageTeacher4.setText("sssss");
		frameLayout2.addView(imageTeacher4); 
		 
		
		Button button = new Button(this);  
		LinearLayout.LayoutParams buttonParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 20);   
		buttonParam.gravity = Gravity.CENTER_VERTICAL;
		button.setLayoutParams(buttonParam);  
		button.setText("sssss");
		frameLayout.addView(button); 
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
