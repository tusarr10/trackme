package com.github.tusarr10.trackme.ui.adapters.photoadapter

import com.github.tusarr10.trackme.ui.adapters.basedapter.InterfaceAdapter

/**
 * Created by luis rafael on 20/03/18.
 */
interface InterfacePhotoAdapter : InterfaceAdapter{
    fun onItemClick(url:String,keyFileName: String,childName: String,holder: PhotoViewHolder,position:Int)
    fun onLongClickDeleteFilePhoto(keyFileName: String, childName: String,position:Int)
}