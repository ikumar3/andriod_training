package com.example.myfirstapp.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfirstapp.MainActivity;
import com.example.myfirstapp.R;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mainActivity;
    private EditText editMessage;
    

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        
        editMessage =
                (EditText) mainActivity
                .findViewById(R.id.edit_message);
    }
    
    public void testPreconditions() {
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("editMessage is null", editMessage);
    }
    
    public void testEditMessageHint() {
        final String expected =
        		mainActivity.getString(R.string.edit_message);
        final String actual = editMessage.getHint().toString();
        assertEquals(expected, actual);
    }
    
}
