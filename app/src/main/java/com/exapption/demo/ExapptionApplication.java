package com.exapption.demo;

import android.app.Application;

import com.exapption.androidsdk.Exapption;
import com.exapption.androidsdk.exception.InvalidExapptionAppCredentialsException;

/**
 * Created by Krishna on 28/12/15.
 */
public class ExapptionApplication extends Application {
    @Override
    public void onCreate() {
        try {
            Exapption.init(this);
        } catch (InvalidExapptionAppCredentialsException e) {
            e.printStackTrace();
        }
        super.onCreate();
    }
}
