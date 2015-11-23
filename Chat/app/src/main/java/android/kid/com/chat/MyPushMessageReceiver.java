package android.kid.com.chat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2015/11/16.
 */
public class MyPushMessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("msg")){
            Log.d("bmob", "客户端收到推送内容：" + intent.getStringExtra("msg"));
        }
    }
}
