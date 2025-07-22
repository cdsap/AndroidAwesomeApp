package com.awesomeapp.analyticscontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscontact.Viewmodel72_1
import com.awesomeapp.analyticscontact.Activity72_2
import com.awesomeapp.analyticscontact.Activity72_3
import com.awesomeapp.analyticscontact.Fragment72_4
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.analyticscontact.Api72_6

@Module
@InstallIn(SingletonComponent::class)
object Module_72 {
    @Provides
    @Singleton
    fun provideRepository72_5(
        api0: Api8_6 = Api8_6(),
        api1: Api32_6 = Api32_6(),
        api2: Api16_6 = Api16_6()
    ): Repository72_5 {
        return Repository72_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi72_6(): Api72_6 {
        return Api72_6()
    }
}