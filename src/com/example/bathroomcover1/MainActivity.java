package com.example.bathroomcover1;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public MediaPlayer mp = new MediaPlayer();
	
	
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
