package com.awesomeapp.messagelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messagelogin.Viewmodel116_1
import com.awesomeapp.messagelogin.Activity116_2
import com.awesomeapp.messagelogin.Activity116_3
import com.awesomeapp.messagelogin.Fragment116_4
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.share.Api16_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.messagelogin.Api116_6

@Module
@InstallIn(SingletonComponent::class)
object Module_116 {
    @Provides
    @Singleton
    fun provideRepository116_5(
        api0: Api16_6 = Api16_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api8_6 = Api8_6(),
        api3: Api52_6 = Api52_6(),
        api4: Api48_6 = Api48_6(),
        api5: Api32_6 = Api32_6(),
        api6: Api24_6 = Api24_6(),
        api7: Api44_6 = Api44_6(),
        api8: Api28_6 = Api28_6(),
        api9: Api36_6 = Api36_6()
    ): Repository116_5 {
        return Repository116_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi116_6(): Api116_6 {
        return Api116_6()
    }
}