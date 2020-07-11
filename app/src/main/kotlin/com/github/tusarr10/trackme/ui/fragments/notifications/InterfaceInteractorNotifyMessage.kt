package com.github.tusarr10.trackme.ui.fragments.notifications

import com.github.tusarr10.trackme.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 17/03/19.
 */
interface InterfaceInteractorNotifyMessage<V : InterfaceViewNotifyMessage> : InterfaceInteractor<V> {
    fun valueEventEnableNotifications()
}