package in.pathri.android.btheadsettimer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BTMonitorService extends Service {
    public BTMonitorService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        IntentFilter btIntentFilter = new IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED);
//        registerReceiver(new BTReceiver(),btIntentFilter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
//        unregisterReceiver();
    }
}
