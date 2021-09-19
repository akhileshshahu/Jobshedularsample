package com.mvvm.jobshedularsample

import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent




class TestJobService : JobService() {

    override fun onStartJob(p0: JobParameters?): Boolean {
        TODO("Not yet implemented")
      //  val service = Intent(applicationContext, LocalWordService::class.java)
      //  applicationContext.startService(service)
        Util().scheduleJob(applicationContext) // reschedule the job

        return true
    }

    override fun onStopJob(p0: JobParameters?): Boolean {
       return true;

    }
}