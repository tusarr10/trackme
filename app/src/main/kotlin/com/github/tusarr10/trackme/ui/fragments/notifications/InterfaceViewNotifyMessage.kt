package com.github.tusarr10.trackme.ui.fragments.notifications

import com.github.tusarr10.trackme.ui.activities.base.InterfaceView
import com.github.tusarr10.trackme.ui.adapters.notifyadapter.NotifyMessageRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by luis rafael on 17/03/19.
 */
interface InterfaceViewNotifyMessage : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: NotifyMessageRecyclerAdapter)
    fun setValueState(dataSnapshot: DataSnapshot)

}