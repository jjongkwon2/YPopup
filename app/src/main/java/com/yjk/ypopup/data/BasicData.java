package com.yjk.ypopup.data;

import android.view.WindowManager;

/**
 * Created by yjk on 2017. 8. 6..
 */

public class BasicData {
    /*
        Popup Window
     */
    public int layout_with = WindowManager.LayoutParams.WRAP_CONTENT;
    public int layout_height = WindowManager.LayoutParams.WRAP_CONTENT;

    public String background = "#FFFFFFFF";
    public int backgroundResource = 0;


    /*
        Title TextView
     */
    public String title_text = "DONE";
    public int title_size = 30;
    public String title_color = "#57A5CB";


    /*
        Content TextView
     */
    public String content_text = "This is MyMessage!";
    public int content_size = 13;
    public String content_color = "#99000000";


}
