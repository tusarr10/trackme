package com.github.tusarr10.trackme.ui.fragments.calls

import com.github.tusarr10.trackme.ui.activities.base.InterfaceView
import com.github.tusarr10.trackme.ui.adapters.callsadapter.CallsRecyclerAdapter

/**
 * Created by luis rafael on 12/03/18.
 */
interface InterfaceViewCalls : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: CallsRecyclerAdapter)

}