package com.github.tusarr10.trackme.data.model

/**
 * Created by luis rafael on 13/03/18.
 */
class Social {

    var emailSocial: String? = null
    var passSocial: String? = null

    constructor() {}

    constructor(emailSocial: String?, passSocial: String?) {
        this.emailSocial = emailSocial
        this.passSocial = passSocial
    }

}