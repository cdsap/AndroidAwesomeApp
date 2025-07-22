package com.awesomeapp.usercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercontact.Viewmodel56_1
import com.awesomeapp.usercontact.Activity56_2
import com.awesomeapp.usercontact.Activity56_3
import com.awesomeapp.usercontact.Fragment56_4
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.report.Api24_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.usercontact.Api56_6

@Module
@InstallIn(SingletonComponent::class)
object Module_56 {
    @Provides
    @Singleton
    fun provideRepository56_5(
        api0: Api24_6 = Api24_6(),
        api1: Api8_6 = Api8_6(),
        api2: Api32_6 = Api32_6(),
        api3: Api16_6 = Api16_6()
    ): Repository56_5 {
        return Repository56_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi56_6(): Api56_6 {
        return Api56_6()
    }
}