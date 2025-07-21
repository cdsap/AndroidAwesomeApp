package com.awesomeapp.synccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccontact.Viewmodel64_1
import com.awesomeapp.synccontact.Activity64_2
import com.awesomeapp.synccontact.Activity64_3
import com.awesomeapp.synccontact.Fragment64_4
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.task.Api28_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.synccontact.Api64_6

@Module
@InstallIn(SingletonComponent::class)
object Module_64 {
    @Provides
    @Singleton
    fun provideRepository64_5(
        api0: Api28_6 = Api28_6(),
        api1: Api32_6 = Api32_6(),
        api2: Api8_6 = Api8_6(),
        api3: Api24_6 = Api24_6(),
        api4: Api40_6 = Api40_6()
    ): Repository64_5 {
        return Repository64_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi64_6(): Api64_6 {
        return Api64_6()
    }
}