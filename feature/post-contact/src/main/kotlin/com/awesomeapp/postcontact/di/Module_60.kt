package com.awesomeapp.postcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcontact.Viewmodel60_1
import com.awesomeapp.postcontact.Activity60_2
import com.awesomeapp.postcontact.Activity60_3
import com.awesomeapp.postcontact.Fragment60_4
import com.awesomeapp.postcontact.Repository60_5
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.postcontact.Api60_6

@Module
@InstallIn(SingletonComponent::class)
object Module_60 {
    @Provides
    @Singleton
    fun provideRepository60_5(
        api0: Api8_6 = Api8_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api4_6 = Api4_6()
    ): Repository60_5 {
        return Repository60_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi60_6(): Api60_6 {
        return Api60_6()
    }
}