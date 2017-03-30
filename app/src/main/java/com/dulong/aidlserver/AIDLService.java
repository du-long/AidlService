package com.dulong.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by dulong on 2017/3/28.
 */

public class AIDLService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    class MyBinder extends IMyAidlInterface.Stub {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
            Log.i("dl--", "" + "--------" + anInt + "--------" + aLong + "--------" + aBoolean + "--------" + aFloat + "--------" + aDouble + "--------" + aString);
        }

        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }

        @Override
        public void setPerson(Person person) throws RemoteException {
            Log.i("dl--", "收到person" + person.getName() + person.getAge() + person.getSex());
        }
    }
}
