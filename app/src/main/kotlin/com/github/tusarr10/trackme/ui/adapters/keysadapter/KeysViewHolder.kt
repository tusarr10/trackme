package com.github.tusarr10.trackme.ui.adapters.keysadapter

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.github.tusarr10.trackme.R
import com.github.tusarr10.trackme.data.model.KeyData
import kotterknife.bindView

/**
 * Created by luis rafael on 20/03/18.
 */
class KeysViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val txtKeyData: TextView by bindView(R.id.txt_key_text)

    fun bind(item: KeyData) {
        txtKeyData.text = item.keyText
    }

}