package com.github.tusarr10.trackme.ui.fragments.message

import com.github.tusarr10.trackme.ui.activities.base.InterfaceView
import com.github.tusarr10.trackme.ui.adapters.smsadapter.SmsRecyclerAdapter

/**
 * Created by luis rafael on 20/03/18.
 */
interface InterfaceViewMessage : InterfaceView {

    fun setRecyclerAdapter(smsRecyclerAdapter: SmsRecyclerAdapter)

}