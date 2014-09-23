/*
 * This is the source code of Telegram for Android v. 1.4.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2014.
 */

package org.telegram.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ApplicationLoader;

public class AppStartReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Utilities.RunOnUIThread(new Runnable() {
            @Override
            public void run() {
                ApplicationLoader.startPushService();
            }
        });
    }
}
