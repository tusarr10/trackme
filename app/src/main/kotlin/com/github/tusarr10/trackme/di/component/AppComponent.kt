package com.github.tusarr10.trackme.di.component

import com.github.tusarr10.trackme.app.TrackMe
import com.github.tusarr10.trackme.data.rxFirebase.InterfaceFirebase
import com.github.tusarr10.trackme.di.module.AppModule
import com.github.tusarr10.trackme.di.module.FirebaseModule
import com.github.tusarr10.trackme.services.accessibilityData.AccessibilityDataService
import com.github.tusarr10.trackme.services.notificationService.NotificationService
import dagger.Component
import javax.inject.Singleton

/**
 * Created by luis rafael on 13/03/18.
 */
@Singleton
@Component(modules = [AppModule::class, FirebaseModule::class])
interface AppComponent {

    fun inject(app: TrackMe)
    fun inject(accessibilityDataService: AccessibilityDataService)
    fun inject(notificationService: NotificationService)
    fun getInterfaceFirebase(): InterfaceFirebase

}