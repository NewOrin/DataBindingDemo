package com.neworin.databindingdemo;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * <b>Create Date:</b> 01/14/2017<br>
 * <b>Author:</b> NewOrin <br>
 * <b>Description:</b>
 * <br>
 */

public class EventHandler {

    private Context mContext;

    public EventHandler(Context context) {
        this.mContext = context;
    }

    public void onClickFriend(String msg) {
        Toast.makeText(mContext, "you clicked : " + msg, Toast.LENGTH_SHORT).show();
    }
}