package lawonga.simplereno_4.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Andy on 9/13/2016.
 * Perform network tasks here
 */
public class NetworkService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
