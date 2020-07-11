package com.github.tusarr10.trackme.ui.fragments.recording

import com.github.tusarr10.trackme.ui.activities.base.InterfaceView
import com.github.tusarr10.trackme.ui.adapters.recordingadapter.RecordingRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by luis rafael on 17/03/19.
 */
interface InterfaceViewRecording : InterfaceView {

    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValueTimerRecording(timer: Long)
    fun setRecyclerAdapter(recyclerAdapter: RecordingRecyclerAdapter)

}