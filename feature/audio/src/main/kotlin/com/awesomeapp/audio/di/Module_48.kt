package com.awesomeapp.audio.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audio.Viewmodel48_1
import com.awesomeapp.audio.Activity48_2
import com.awesomeapp.audio.Activity48_3
import com.awesomeapp.audio.Fragment48_4
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.audio.Api48_6

@Module
@InstallIn(SingletonComponent::class)
object Module_48 {
    @Provides
    @Singleton
    fun provideRepository48_5(
        api0: Api4_6 = Api4_6(),
        api1: Api32_6 = Api32_6(),
        api2: Api24_6 = Api24_6(),
        api3: Api8_6 = Api8_6(),
        api4: Api12_6 = Api12_6(),
        api5: Api16_6 = Api16_6()
    ): Repository48_5 {
        return Repository48_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi48_6(): Api48_6 {
        return Api48_6()
    }
}