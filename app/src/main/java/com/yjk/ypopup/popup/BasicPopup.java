package com.yjk.ypopup.popup;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.yjk.ypopup.R;
import com.yjk.ypopup.data.SettingData;

/**
 * Created by yjk on 2017. 8. 2..
 */

public class BasicPopup extends Dialog {
    public static final String TAG = "YPopup_log";

    private Activity activity;
    SettingData settingData;

    public BasicPopup(Context context) {
        super(context);
        settingData = new SettingData(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // layout 설정
        setContentView(R.layout.basic_popup);
        //setCanceledOnTouchOutside(false);

        // Dialog의 배경 없애기
        //ColorDrawable dialogColor = new ColorDrawable(Color.GRAY);
        //dialogColor.setAlpha(0);
        //getWindow().setBackgroundDrawable(dialogColor);

        // Dialog의 뒷 배경 검정색으로 바뀌는 것 막기
        //getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);

        // Dialog 왼쪽 정렬
        getWindow().setGravity(settingData.gravity);


        getWindow().getAttributes().windowAnimations = R.style.PopupLeftAnimation;

    }

    // user settings
    public void setGravity(int gravity){
        settingData.gravity = gravity;
    }

    public void setAnimation(int type){
        switch (type){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }
    }
}
