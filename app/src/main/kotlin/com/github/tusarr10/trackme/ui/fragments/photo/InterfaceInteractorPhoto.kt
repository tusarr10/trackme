package com.github.tusarr10.trackme.ui.fragments.photo

import com.github.tusarr10.trackme.di.PerActivity
import com.github.tusarr10.trackme.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 20/03/18.
 */
@PerActivity
interface InterfaceInteractorPhoto<V : InterfaceViewPhoto> : InterfaceInteractor<V> {
    fun getPhotoCamera(facing:Int)
    fun valueEventEnablePhoto()
    fun valueEventEnablePermission()
}