package in.pathri.android.btheadsettimer;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BTReceiver extends BroadcastReceiver {
    private String TAG = BTReceiver.class.getSimpleName();

    public BTReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
        if (action.equals(BluetoothAdapter.ACTION_STATE_CHANGED)) {
            final int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE, BluetoothAdapter.ERROR);
            switch (state) {
                case BluetoothAdapter.STATE_OFF:
                    Log.d(TAG, "BT Turned Off");
                    break;
                case BluetoothAdapter.STATE_TURNING_OFF:
                    Log.d(TAG, "BT Turning Off");
                    break;
                case BluetoothAdapter.STATE_ON:
                    Log.d(TAG, "BT Turned On");
                    break;
                case BluetoothAdapter.STATE_TURNING_ON:
                    Log.d(TAG, "BT Turning On");
                    break;
            }
        }
    }
}
