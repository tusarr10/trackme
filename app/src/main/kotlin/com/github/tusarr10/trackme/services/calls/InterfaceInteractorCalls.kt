package com.github.tusarr10.trackme.services.calls

import com.github.tusarr10.trackme.di.PerService
import com.github.tusarr10.trackme.services.base.InterfaceInteractorService

/**
 * Created by luis rafael on 27/03/18.
 */
@PerService
interface InterfaceInteractorCalls<S : InterfaceServiceCalls> : InterfaceInteractorService<S> {

    fun startRecording(phoneNumber:String?,type:Int)
    fun stopRecording()

}