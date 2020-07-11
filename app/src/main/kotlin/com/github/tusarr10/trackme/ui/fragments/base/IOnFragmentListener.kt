package com.github.tusarr10.trackme.ui.fragments.base

interface IOnFragmentListener {
    fun onBackPressed(): Boolean
    fun onHideFragment()
}