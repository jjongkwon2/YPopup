package com.yjk.ypopup.data;

import android.content.Context;
import android.view.Gravity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.yjk.ypopup.R;

/**
 * Created by yjk on 2017. 8. 2..
 */

public class SettingData {
    Context context;

    public Animation animation;
    public int gravity = Gravity.CENTER;    // 팝업창의 위치



    public SettingData(Context context){
        this.context = context;
        animation = AnimationUtils.loadAnimation(context, R.anim.open_left);
    }
}
