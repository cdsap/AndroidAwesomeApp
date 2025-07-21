package com.awesomeapp.podcastcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcontact.Viewmodel92_1
import com.awesomeapp.podcastcontact.Activity92_2
import com.awesomeapp.podcastcontact.Activity92_3
import com.awesomeapp.podcastcontact.Fragment92_4
import com.awesomeapp.podcastcontact.Repository92_5
import com.awesomeapp.search.Api12_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.podcastcontact.Api92_6

@Module
@InstallIn(SingletonComponent::class)
object Module_92 {
    @Provides
    @Singleton
    fun provideRepository92_5(
        api0: Api12_6 = Api12_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api48_6 = Api48_6(),
        api3: Api40_6 = Api40_6(),
        api4: Api8_6 = Api8_6(),
        api5: Api52_6 = Api52_6(),
        api6: Api4_6 = Api4_6(),
        api7: Api36_6 = Api36_6(),
        api8: Api44_6 = Api44_6(),
        api9: Api16_6 = Api16_6()
    ): Repository92_5 {
        return Repository92_5(api0, 
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
    fun provideApi92_6(): Api92_6 {
        return Api92_6()
    }
}