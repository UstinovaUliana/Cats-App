package com.example.catimagesapp

import android.app.Application
import com.example.catimagesapp.di.module.favsModule
import com.example.catimagesapp.di.module.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CatsApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CatsApp)
            modules(listOf(networkModule,favsModule))
        }
    }
}