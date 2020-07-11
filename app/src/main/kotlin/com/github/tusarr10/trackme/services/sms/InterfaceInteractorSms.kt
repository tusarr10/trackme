package com.github.tusarr10.trackme.services.sms

import com.github.tusarr10.trackme.di.PerService
import com.github.tusarr10.trackme.services.base.InterfaceInteractorService

/**
 * Created by luis rafael on 27/03/18.
 */
@PerService
interface InterfaceInteractorSms<S : InterfaceServiceSms> : InterfaceInteractorService<S> {

    fun setPushSms(smsAddress: String, smsBody: String,type: Int)

}