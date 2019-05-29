package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        switch (action)
        {
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context, "Power Connected",
                        Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "Power disconnected",
                        Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "Airplane Mode Changed",
                        Toast.LENGTH_SHORT).show();
                break;
            case MainActivity.CUSTOM_BROADCAST:
                Toast.makeText(context, "This is a custom broadcast",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
