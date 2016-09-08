package com.example.startservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private final static String Tag="MyTag";

    public MyService() {
    }

    public void onCreate(){
        Log.v(Tag,"onCreate()");
       super.onCreate();
    }

    public int onStartCommand(Intent intent,int flags,int start){
        Log.v(Tag,"onStartCommand()");
        int number=intent.getIntExtra("number",0);
        Log.v(Tag,"int is "+number);
        return super.onStartCommand(intent,flags,start);
    }

    public void onDestroy(){
        Log.v(Tag,"onDestroy()");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log .v(Tag,"onBand()");
        return null;
    }

    public boolean onUnbind(Intent intent){
        Log.v(Tag,"onUnbind()");
        return super.onUnbind(intent);
    }
}
