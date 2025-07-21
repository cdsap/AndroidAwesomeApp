package com.awesomeapp.alarmcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Viewmodel80_1
import com.awesomeapp.alarmcontact.Activity80_2
import com.awesomeapp.alarmcontact.Activity80_3
import com.awesomeapp.alarmcontact.Fragment80_4
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.alarmcontact.Api80_6

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api20_6 = Api20_6(),
        api1: Api52_6 = Api52_6(),
        api2: Api16_6 = Api16_6(),
        api3: Api48_6 = Api48_6(),
        api4: Api32_6 = Api32_6(),
        api5: Api12_6 = Api12_6(),
        api6: Api44_6 = Api44_6(),
        api7: Api28_6 = Api28_6(),
        api8: Api36_6 = Api36_6(),
        api9: Api40_6 = Api40_6()
    ): Repository80_5 {
        return Repository80_5(api0, 
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
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}