package com.github.tusarr10.trackme.ui.fragments.keylog

import com.github.tusarr10.trackme.di.PerActivity
import com.github.tusarr10.trackme.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 18/03/18.
 */
@PerActivity
interface InterfaceInteractorKeys<V : InterfaceViewKeys> : InterfaceInteractor<V> {
    fun valueEventEnableKeys()
}