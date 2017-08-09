package com.yjk.ypopup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.yjk.ypopup.popup.BasicPopup;
import com.yjk.ypopup.popup.YBasicPopup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button = (ImageButton)findViewById(R.id.menubutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YBasicPopup popup = new YBasicPopup(MainActivity.this);

                popup.show();
            }
        });
    }

}
