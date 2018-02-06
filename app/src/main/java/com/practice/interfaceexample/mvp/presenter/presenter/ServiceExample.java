package com.practice.interfaceexample.mvp.presenter.presenter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by dell on 1/24/2018.
 */

public class ServiceExample extends Service {
    private boolean check = false;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("Usama","Service OnBind");
        return null;
    }

    @Override
    public void onCreate() {
        Log.i("Usama","Service Created");
        check =true;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("Usama","Service Onstart");
        new Thread(new Runnable() {
            @Override
            public void run() {
           for(int i=0;i<5;i++)
           {
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

               if(check)
               {
                   Log.i("Usama","Service Running");
               }
           }

stopSelf();
            }
        }).start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i("Usama","Service Destroyed");
    }
}
