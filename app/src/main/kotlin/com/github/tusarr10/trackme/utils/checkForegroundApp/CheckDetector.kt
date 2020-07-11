package com.github.tusarr10.trackme.utils.checkForegroundApp

import android.content.Context

/**
 * Created by luis rafael on 20/03/18.
 */
interface CheckDetector {

    fun getForegroundPostLollipop(context: Context): String?
    fun getForegroundPreLollipop(context: Context): String?

}