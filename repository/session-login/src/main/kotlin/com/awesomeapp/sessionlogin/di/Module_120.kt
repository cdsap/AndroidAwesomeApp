package com.awesomeapp.sessionlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionlogin.Viewmodel120_1
import com.awesomeapp.sessionlogin.Activity120_2
import com.awesomeapp.sessionlogin.Activity120_3
import com.awesomeapp.sessionlogin.Fragment120_4
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.sessionlogin.Api120_6

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api100_6 = Api100_6()
    ): Repository120_5 {
        return Repository120_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}