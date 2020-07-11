package com.github.tusarr10.trackme.ui.fragments.social

import com.github.tusarr10.trackme.di.PerActivity
import com.github.tusarr10.trackme.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 20/03/18.
 */
@PerActivity
interface InterfaceInteractorSocial<V : InterfaceViewSocial> : InterfaceInteractor<V> {

    fun valueEventSocial()
    fun valueEventEnablePermission()

}