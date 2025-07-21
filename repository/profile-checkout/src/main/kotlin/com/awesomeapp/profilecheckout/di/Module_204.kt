package com.awesomeapp.profilecheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profilecheckout.Viewmodel204_1
import com.awesomeapp.profilecheckout.Activity204_2
import com.awesomeapp.profilecheckout.Activity204_3
import com.awesomeapp.profilecheckout.Fragment204_4
import com.awesomeapp.profilecheckout.Repository204_5
import com.awesomeapp.profilecheckout.Api204_6

@Module
@InstallIn(SingletonComponent::class)
object Module_204 {
    @Provides
    @Singleton
    fun provideRepository204_5(): Repository204_5 {
        return Repository204_5()
    }

    @Provides
    @Singleton
    fun provideApi204_6(): Api204_6 {
        return Api204_6()
    }
}