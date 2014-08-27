package com.example.bathroomcover1;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import com.trogdor.bathroomcover1.R;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu_activity_actions, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	public MediaPlayer mp = new MediaPlayer();
	final Context context = this;
	private Button button;
	
	
	public void playFaucet(View playFaucet) {
		if (mp.isPlaying()) {
			mp.stop();
		}
		mp = MediaPlayer.create(getApplicationContext(), R.raw.sink3);
		mp.start();
		mp.setLooping(true);
		final Button button = (Button) findViewById(R.id.stopSound);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View stopSound) {
                mp.stop();
            }
        });
    }
	
	public void playHandDryer(View playHandDryer) {
		if (mp.isPlaying()) {
			mp.stop();
		}
		mp = MediaPlayer.create(getApplicationContext(), R.raw.handdryer);
		mp.start();
		mp.setLooping(true);
				
		final Button button = (Button) findViewById(R.id.stopSound);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View stopSound) {
                mp.stop();
            }
        });
    }
		
}
