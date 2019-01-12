package com.example.mariolaroznaska.kalkulator;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {

    private final IBinder mBinder = new LocalBinder();

    public class LocalBinder extends Binder{

        LogicService getService();

        return LogicService.this;
    }

    public double add(double n1, double n2){

    }


    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }
}
