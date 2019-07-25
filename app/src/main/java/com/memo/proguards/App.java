package com.memo.proguards;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * title:
 * describe:
 *
 * @author zhou
 * @date 2019-07-25 15:38
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
