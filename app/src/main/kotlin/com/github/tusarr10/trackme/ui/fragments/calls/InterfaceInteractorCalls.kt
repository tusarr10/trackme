package com.github.tusarr10.trackme.ui.fragments.calls

import com.github.tusarr10.trackme.di.PerActivity
import com.github.tusarr10.trackme.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 12/03/18.
 */
@PerActivity
interface InterfaceInteractorCalls<V : InterfaceViewCalls> : InterfaceInteractor<V> {
    fun stopAudioCallHolder()
}