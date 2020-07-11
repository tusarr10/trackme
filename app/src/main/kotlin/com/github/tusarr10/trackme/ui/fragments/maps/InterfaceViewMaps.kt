package com.github.tusarr10.trackme.ui.fragments.maps

import com.github.tusarr10.trackme.data.model.Location
import com.github.tusarr10.trackme.ui.activities.base.InterfaceView
import com.google.firebase.database.DataSnapshot

/**
 * Created by luis rafael on 11/03/18.
 */
interface InterfaceViewMaps : InterfaceView {
    fun setLocation(location: Location)
    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValuePermission(dataSnapshot: DataSnapshot)
}