package com.github.tusarr10.trackme.di.module

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.tusarr10.trackme.di.PerActivity
import com.github.tusarr10.trackme.ui.activities.login.InteractorLogin
import com.github.tusarr10.trackme.ui.activities.login.InterfaceInteractorLogin
import com.github.tusarr10.trackme.ui.activities.login.InterfaceViewLogin
import com.github.tusarr10.trackme.ui.activities.mainparent.InteractorMainParent
import com.github.tusarr10.trackme.ui.activities.mainparent.InterfaceInteractorMainParent
import com.github.tusarr10.trackme.ui.activities.mainparent.InterfaceViewMainParent
import com.github.tusarr10.trackme.ui.activities.register.InteractorRegister
import com.github.tusarr10.trackme.ui.activities.register.InterfaceInteractorRegister
import com.github.tusarr10.trackme.ui.activities.register.InterfaceViewRegister
import com.github.tusarr10.trackme.ui.fragments.calls.InteractorCalls
import com.github.tusarr10.trackme.ui.fragments.calls.InterfaceInteractorCalls
import com.github.tusarr10.trackme.ui.fragments.calls.InterfaceViewCalls
import com.github.tusarr10.trackme.ui.fragments.photo.InteractorPhoto
import com.github.tusarr10.trackme.ui.fragments.photo.InterfaceInteractorPhoto
import com.github.tusarr10.trackme.ui.fragments.photo.InterfaceViewPhoto
import com.github.tusarr10.trackme.ui.fragments.keylog.InteractorKeys
import com.github.tusarr10.trackme.ui.fragments.keylog.InterfaceInteractorKeys
import com.github.tusarr10.trackme.ui.fragments.keylog.InterfaceViewKeys
import com.github.tusarr10.trackme.ui.fragments.maps.InteractorMaps
import com.github.tusarr10.trackme.ui.fragments.maps.InterfaceInteractorMaps
import com.github.tusarr10.trackme.ui.fragments.maps.InterfaceViewMaps
import com.github.tusarr10.trackme.ui.fragments.message.InteractorMessage
import com.github.tusarr10.trackme.ui.fragments.message.InterfaceInteractorMessage
import com.github.tusarr10.trackme.ui.fragments.message.InterfaceViewMessage
import com.github.tusarr10.trackme.ui.fragments.notifications.InteractorNotifyMessage
import com.github.tusarr10.trackme.ui.fragments.notifications.InterfaceInteractorNotifyMessage
import com.github.tusarr10.trackme.ui.fragments.notifications.InterfaceViewNotifyMessage
import com.github.tusarr10.trackme.ui.fragments.recording.InteractorRecording
import com.github.tusarr10.trackme.ui.fragments.recording.InterfaceInteractorRecording
import com.github.tusarr10.trackme.ui.fragments.recording.InterfaceViewRecording
import com.github.tusarr10.trackme.ui.fragments.social.InteractorSocial
import com.github.tusarr10.trackme.ui.fragments.social.InterfaceInteractorSocial
import com.github.tusarr10.trackme.ui.fragments.social.InterfaceViewSocial
import com.google.android.gms.maps.SupportMapFragment
import dagger.Module
import dagger.Provides

/**
 * Created by luis rafael on 8/03/18.
 */
@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun provideContext(): Context = activity.applicationContext

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    fun provideSupportFragmentManager(): FragmentManager = activity.supportFragmentManager

    @Provides
    fun provideSupportMapFragment(): SupportMapFragment = SupportMapFragment.newInstance()

    @Provides
    fun provideLayoutManager(context: Context): LinearLayoutManager = LinearLayoutManager(context)

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMain(interactorParent: InteractorMainParent<InterfaceViewMainParent>): InterfaceInteractorMainParent<InterfaceViewMainParent> = interactorParent

    @Provides
    @PerActivity
    fun provideInterfaceInteractorLogin(interactor: InteractorLogin<InterfaceViewLogin>): InterfaceInteractorLogin<InterfaceViewLogin> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRegister(interactor: InteractorRegister<InterfaceViewRegister>): InterfaceInteractorRegister<InterfaceViewRegister> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMaps(interactor: InteractorMaps<InterfaceViewMaps>): InterfaceInteractorMaps<InterfaceViewMaps> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceViewCalls>): InterfaceInteractorCalls<InterfaceViewCalls> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorKeys(interactor: InteractorKeys<InterfaceViewKeys>): InterfaceInteractorKeys<InterfaceViewKeys> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorMessage(interactor: InteractorMessage<InterfaceViewMessage>): InterfaceInteractorMessage<InterfaceViewMessage> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorPhoto(interactor: InteractorPhoto<InterfaceViewPhoto>): InterfaceInteractorPhoto<InterfaceViewPhoto> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorSocial(interactor: InteractorSocial<InterfaceViewSocial>): InterfaceInteractorSocial<InterfaceViewSocial> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorRecording(interactor: InteractorRecording<InterfaceViewRecording>): InterfaceInteractorRecording<InterfaceViewRecording> = interactor

    @Provides
    @PerActivity
    fun provideInterfaceInteractorNotify(interactor: InteractorNotifyMessage<InterfaceViewNotifyMessage>): InterfaceInteractorNotifyMessage<InterfaceViewNotifyMessage> = interactor


}