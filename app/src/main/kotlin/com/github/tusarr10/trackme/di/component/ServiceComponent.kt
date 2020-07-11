package com.github.tusarr10.trackme.di.component

import com.github.tusarr10.trackme.di.PerService
import com.github.tusarr10.trackme.di.module.ServiceModule
import com.github.tusarr10.trackme.services.calls.CallsService
import com.github.tusarr10.trackme.services.sms.SmsService
import com.github.tusarr10.trackme.services.social.MonitorService
import dagger.Component

/**
 * Created by luis rafael on 13/03/18.
 */
@PerService
@Component(dependencies = [AppComponent::class], modules = [ServiceModule::class])
interface ServiceComponent {

    fun inject(callsService: CallsService)
    fun inject(smsService: SmsService)
    fun inject(monitorService: MonitorService)

}