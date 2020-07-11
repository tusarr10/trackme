package com.github.tusarr10.trackme.ui.activities.login

import com.github.tusarr10.trackme.di.PerActivity
import com.github.tusarr10.trackme.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 9/03/18.
 */
@PerActivity
interface InterfaceInteractorLogin<V : InterfaceViewLogin> : InterfaceInteractor<V> {
    fun signInDisposable(email: String, pass: String)
}