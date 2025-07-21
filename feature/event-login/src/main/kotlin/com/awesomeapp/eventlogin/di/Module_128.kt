package com.awesomeapp.eventlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventlogin.Viewmodel128_1
import com.awesomeapp.eventlogin.Activity128_2
import com.awesomeapp.eventlogin.Activity128_3
import com.awesomeapp.eventlogin.Fragment128_4
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.eventlogin.Api128_6

@Module
@InstallIn(SingletonComponent::class)
object Module_128 {
    @Provides
    @Singleton
    fun provideRepository128_5(
        api0: Api32_6 = Api32_6(),
        api1: Api44_6 = Api44_6(),
        api2: Api24_6 = Api24_6(),
        api3: Api12_6 = Api12_6(),
        api4: Api4_6 = Api4_6(),
        api5: Api16_6 = Api16_6(),
        api6: Api20_6 = Api20_6(),
        api7: Api36_6 = Api36_6(),
        api8: Api48_6 = Api48_6()
    ): Repository128_5 {
        return Repository128_5(api0, 
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
    fun provideApi128_6(): Api128_6 {
        return Api128_6()
    }
}