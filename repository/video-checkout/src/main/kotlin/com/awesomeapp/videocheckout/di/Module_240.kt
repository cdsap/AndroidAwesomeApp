package com.awesomeapp.videocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.videocheckout.Viewmodel240_1
import com.awesomeapp.videocheckout.Activity240_2
import com.awesomeapp.videocheckout.Activity240_3
import com.awesomeapp.videocheckout.Fragment240_4
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.videocheckout.Api240_6

@Module
@InstallIn(SingletonComponent::class)
object Module_240 {
    @Provides
    @Singleton
    fun provideRepository240_5(): Repository240_5 {
        return Repository240_5()
    }

    @Provides
    @Singleton
    fun provideApi240_6(): Api240_6 {
        return Api240_6()
    }
}