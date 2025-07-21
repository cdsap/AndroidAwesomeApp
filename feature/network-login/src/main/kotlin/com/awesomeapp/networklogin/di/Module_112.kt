package com.awesomeapp.networklogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networklogin.Viewmodel112_1
import com.awesomeapp.networklogin.Activity112_2
import com.awesomeapp.networklogin.Activity112_3
import com.awesomeapp.networklogin.Fragment112_4
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.networklogin.Api112_6

@Module
@InstallIn(SingletonComponent::class)
object Module_112 {
    @Provides
    @Singleton
    fun provideRepository112_5(
        api0: Api40_6 = Api40_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api12_6 = Api12_6(),
        api3: Api8_6 = Api8_6(),
        api4: Api44_6 = Api44_6()
    ): Repository112_5 {
        return Repository112_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi112_6(): Api112_6 {
        return Api112_6()
    }
}