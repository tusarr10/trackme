package com.github.tusarr10.trackme.ui.fragments.keylog

import com.github.tusarr10.trackme.ui.activities.base.InterfaceView
import com.github.tusarr10.trackme.ui.adapters.keysadapter.KeysRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by luis rafael on 18/03/18.
 */
interface InterfaceViewKeys : InterfaceView {

    fun setValueState(dataSnapshot: DataSnapshot)
    fun setRecyclerAdapter(recyclerAdapter: KeysRecyclerAdapter)

}