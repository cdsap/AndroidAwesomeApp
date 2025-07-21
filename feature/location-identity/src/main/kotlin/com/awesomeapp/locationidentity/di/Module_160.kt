package com.awesomeapp.locationidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationidentity.Viewmodel160_1
import com.awesomeapp.locationidentity.Activity160_2
import com.awesomeapp.locationidentity.Activity160_3
import com.awesomeapp.locationidentity.Fragment160_4
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.locationidentity.Api160_6

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api36_6 = Api36_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api52_6 = Api52_6(),
        api3: Api12_6 = Api12_6(),
        api4: Api4_6 = Api4_6(),
        api5: Api48_6 = Api48_6(),
        api6: Api24_6 = Api24_6(),
        api7: Api40_6 = Api40_6(),
        api8: Api8_6 = Api8_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
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
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}