package com.github.tusarr10.trackme.ui.activities.mainparent

import com.github.tusarr10.trackme.ui.activities.base.InterfaceView
import com.google.firebase.database.DataSnapshot

/**
 * Created by luis rafael on 9/03/18.
 */
interface InterfaceViewMainParent : InterfaceView {
    fun signOutView()
    fun onFinishCount()
    fun setCheckedNavigationItem(id: Int)
    fun closeNavigationDrawer()
    fun requestApplyInsets()
    fun setDataAccounts(data: DataSnapshot)
}