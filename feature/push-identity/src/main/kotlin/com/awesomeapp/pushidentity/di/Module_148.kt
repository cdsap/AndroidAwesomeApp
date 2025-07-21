package com.awesomeapp.pushidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushidentity.Viewmodel148_1
import com.awesomeapp.pushidentity.Activity148_2
import com.awesomeapp.pushidentity.Activity148_3
import com.awesomeapp.pushidentity.Fragment148_4
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.pushidentity.Api148_6

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(
        api0: Api4_6 = Api4_6(),
        api1: Api52_6 = Api52_6(),
        api2: Api32_6 = Api32_6(),
        api3: Api40_6 = Api40_6(),
        api4: Api24_6 = Api24_6(),
        api5: Api44_6 = Api44_6(),
        api6: Api36_6 = Api36_6(),
        api7: Api8_6 = Api8_6()
    ): Repository148_5 {
        return Repository148_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}