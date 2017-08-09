package com.yjk.ypopup.popup;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yjk.ypopup.R;
import com.yjk.ypopup.data.BasicData;
import com.yjk.ypopup.data.SettingData;

/**
 * Created by yjk on 2017. 8. 2..
 */

public class YBasicPopup extends Dialog {
    public static final String TAG = "YBasicPopup";

    private BasicData data;

    private LinearLayout layout;
    private TextView titleTextView;
    private TextView contentTextView;
    private ImageButton cancelButton;

    public YBasicPopup(Context context) {
        super(context);
        data = new BasicData();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // layout 설정
        setContentView(R.layout.popup_basic);

        init();


        // set window
        getWindow().setGravity(Gravity.CENTER); // 중앙정렬
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(data.layout_with, data.layout_height);
        layout.setLayoutParams(params);         // 팝업창 크기
        layout.setBackgroundColor(Color.parseColor(data.background));   // 팝업창 배경색

        // set title textview
        titleTextView.setText(data.title_text);
        titleTextView.setTextSize(data.title_size);
        titleTextView.setTextColor(Color.parseColor(data.title_color));

        // set content textview
        contentTextView.setText(data.content_text);
        contentTextView.setTextSize(data.content_size);
        contentTextView.setTextColor(Color.parseColor(data.content_color));

        // set cancel button
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        //getWindow().getAttributes().windowAnimations = R.style.PopupLeftAnimation;

    }

    public void init(){
        layout = (LinearLayout)findViewById(R.id.popup);
        titleTextView = (TextView)findViewById(R.id.popup_basic_title_textview);
        contentTextView = (TextView)findViewById(R.id.popup_basic_content_textview);
        cancelButton = (ImageButton)findViewById(R.id.popup_basic_cancel_imagebutton);
    }

    // window
    public void setWidth(int width){ data.layout_with = width; }
    public void setHeight(int height){ data.layout_height = height; }
    public void setBackground(String color){ data.background = color; }

    // title textview
    public void setTitle(String title){ data.title_text = title; }
    public void setTitleSize(int size){ data.title_size = size; }
    public void setTitleColor(String color){ data.title_color = color; }

    // content textview
    public void setContent(String content){ data.content_text = content; }
    public void setContentSize(int size){ data.content_size = size; }
    public void setContentColor(String color){ data.content_color = color; }


}
