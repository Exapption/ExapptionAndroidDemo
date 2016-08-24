package com.exapption.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.exapption.androidsdk.Exapption;
import com.exapption.androidsdk.exception.ExapptionInternetPermissionDeniedException;
import com.exapption.androidsdk.exception.ExapptionNotInitializedException;
import com.exapption.androidsdk.exception.InvalidExapptionAppCredentialsException;
import com.exapption.androidsdk.push.ExapptionPushRegistrationListener;

public class MainActivity extends AppCompatActivity implements ExapptionPushRegistrationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setProd(View view) {
        try {
            Exapption.enablePush("Exapption Demo", this);
        } catch (ExapptionNotInitializedException e) {
            e.printStackTrace();
        } catch (ExapptionInternetPermissionDeniedException e) {
            e.printStackTrace();
        } catch (InvalidExapptionAppCredentialsException e) {
            e.printStackTrace();
        }
    }

    public void setDev(View view) {
        try {
            Exapption.enablePush("", this);
        } catch (ExapptionNotInitializedException e) {
            e.printStackTrace();
        } catch (ExapptionInternetPermissionDeniedException e) {
            e.printStackTrace();
        } catch (InvalidExapptionAppCredentialsException e) {
            e.printStackTrace();
        }

    }

    public void setLocal(View view) {
        try {
            Exapption.enablePush("", this);
        } catch (ExapptionNotInitializedException e) {
            e.printStackTrace();
        } catch (ExapptionInternetPermissionDeniedException e) {
            e.printStackTrace();
        } catch (InvalidExapptionAppCredentialsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerSuccess(String s) {
//        Log.d("Exapp_reg", "registered " + s);
//        labelText.setTextColor(Color.GREEN);
    }

    @Override
    public void onError(String s) {
//        labelText.setText("Error setting ENV");
//        labelText.setTextColor(Color.RED);
    }

    public void crash(View view) {
        String a = null;
        a.substring(0);
    }

    public void pause(View view) {
        try {
            Exapption.pausePushNotifications();
        } catch (ExapptionInternetPermissionDeniedException e) {
            e.printStackTrace();
        }
    }

    public void resume(View view) {
        try {
            Exapption.resumePushNotifications();
        } catch (ExapptionInternetPermissionDeniedException e) {
            e.printStackTrace();
        }
    }
}
