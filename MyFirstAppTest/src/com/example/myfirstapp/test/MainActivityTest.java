package com.example.myfirstapp.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;
import com.example.myfirstapp.MainActivity;
import com.example.myfirstapp.R;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mainActivity;
    private EditText editMessage;
    private Button buttonSend;
    

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
        
        buttonSend = (Button) mainActivity
        		.findViewById(R.id.button_send);
    }
    
    @SmallTest
    public void testPreconditions() {
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("editMessage is null", editMessage);
        assertNotNull("buttonSend is null", buttonSend);
    }
    
    @SmallTest
    public void testEditMessageHint() {
        final String expected =
        		mainActivity.getString(R.string.edit_message);
        final String actual = editMessage.getHint().toString();
        assertEquals(expected, actual);
    }
    
    @SmallTest
    public void testButtonSendText() {
        final String expected =
        		mainActivity.getString(R.string.button_send);
        final String actual = buttonSend.getText().toString();
        assertEquals(expected, actual);
    }
    
}
