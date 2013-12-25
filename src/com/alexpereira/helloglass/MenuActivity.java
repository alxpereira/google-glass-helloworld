package com.alexpereira.helloglass;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.glass.app.Card;


public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Option 1 - View Activation (android style ^^)
        //setContentView(R.layout.activity_menu);
        
        // Option 2 - Card UI declaration and activation (glass UI rocks)
        // @link : https://developers.google.com/glass/develop/gdk/ui/theme-widgets#creating_glass-styled_cards
        
        Card card1 = new Card(this);
        card1.setText(R.string.hello_world_card);
        
        View card1View = card1.toView();
        setContentView(card1View);
    }

}
