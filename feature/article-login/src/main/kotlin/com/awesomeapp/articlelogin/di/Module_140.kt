package com.awesomeapp.articlelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Viewmodel140_1
import com.awesomeapp.articlelogin.Activity140_2
import com.awesomeapp.articlelogin.Activity140_3
import com.awesomeapp.articlelogin.Fragment140_4
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.articlelogin.Api140_6

@Module
@InstallIn(SingletonComponent::class)
object Module_140 {
    @Provides
    @Singleton
    fun provideRepository140_5(
        api0: Api20_6 = Api20_6(),
        api1: Api44_6 = Api44_6(),
        api2: Api12_6 = Api12_6(),
        api3: Api32_6 = Api32_6(),
        api4: Api40_6 = Api40_6(),
        api5: Api16_6 = Api16_6(),
        api6: Api8_6 = Api8_6(),
        api7: Api28_6 = Api28_6(),
        api8: Api52_6 = Api52_6()
    ): Repository140_5 {
        return Repository140_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi140_6(): Api140_6 {
        return Api140_6()
    }
}