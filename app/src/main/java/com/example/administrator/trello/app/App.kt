package com.example.administrator.hundredtimes.app

import android.app.Application
import com.example.projectcore.Config

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Config.init(this)
                .configure()

    }

}