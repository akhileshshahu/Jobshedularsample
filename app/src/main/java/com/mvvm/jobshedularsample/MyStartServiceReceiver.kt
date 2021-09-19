package com.mvvm.jobshedularsample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyStartServiceReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        val util = Util();
        if (context != null) {
            util.scheduleJob(context)
        }
    }
}