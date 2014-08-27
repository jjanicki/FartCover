package com.example.bathroomcover1;

import junit.framework.TestCase;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.trogdor.bathroomcover1.R;

public class SanityTests extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private MainActivity mainActivity;
    private TextView textView;
    
    public SanityTests() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        textView =
                (TextView) mainActivity
                .findViewById(R.id.about);
    }
	
	public void testMainActivity(){
		assertTrue(mainActivity != null);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
