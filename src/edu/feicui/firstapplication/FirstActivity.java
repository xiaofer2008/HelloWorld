package edu.feicui.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FirstActivity extends Activity {
	ImageView iamge_view;
	Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btnLogin=(Button)findViewById(R.id.btn_login);
//        iamge_view=(ImageView)findViewById(R.id.image_hello);
        btnLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Toast.makeText(FirstActivity.this, "µÇÂ¼³É¹¦", Toast.LENGTH_SHORT).show();	
			}
		});
    }

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }
    
}
