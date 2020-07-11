package com.github.tusarr10.trackme.di.module

import android.app.Service
import android.content.Context
import com.github.tusarr10.trackme.di.PerService
import com.github.tusarr10.trackme.services.calls.InteractorCalls
import com.github.tusarr10.trackme.services.calls.InterfaceInteractorCalls
import com.github.tusarr10.trackme.services.calls.InterfaceServiceCalls
import com.github.tusarr10.trackme.services.sms.InteractorSms
import com.github.tusarr10.trackme.services.sms.InterfaceInteractorSms
import com.github.tusarr10.trackme.services.sms.InterfaceServiceSms
import dagger.Module
import dagger.Provides

/**
 * Created by luis rafael on 13/03/18.
 */
@Module
class ServiceModule(var service:Service) {

    @Provides
    fun provideContext(): Context = service.applicationContext

    @Provides
    @PerService
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceServiceCalls>): InterfaceInteractorCalls<InterfaceServiceCalls> = interactor

    @Provides
    @PerService
    fun provideInterfaceInteractorSms(interactor: InteractorSms<InterfaceServiceSms>): InterfaceInteractorSms<InterfaceServiceSms> = interactor

}