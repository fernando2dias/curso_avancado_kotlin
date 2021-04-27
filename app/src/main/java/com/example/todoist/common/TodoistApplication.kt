package com.example.todoist.common

import androidx.multidex.MultiDexApplication
import com.example.todoist.common.di.ApplicationComponent
import com.example.todoist.common.di.DaggerApplicationComponent
import com.pacoworks.rxpaper2.RxPaperBook

class TodoistApplication : MultiDexApplication() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        RxPaperBook.init(this)

        applicationComponent =
            DaggerApplicationComponent
                .builder()
                .build()
    }
}