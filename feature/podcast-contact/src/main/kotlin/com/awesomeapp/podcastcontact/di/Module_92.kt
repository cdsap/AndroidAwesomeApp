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
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.podcastcontact.Api92_6

@Module
@InstallIn(SingletonComponent::class)
object Module_92 {
    @Provides
    @Singleton
    fun provideRepository92_5(
        api0: Api32_6 = Api32_6(),
        api1: Api8_6 = Api8_6(),
        api2: Api16_6 = Api16_6()
    ): Repository92_5 {
        return Repository92_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi92_6(): Api92_6 {
        return Api92_6()
    }
}