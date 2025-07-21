package com.awesomeapp.settingcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.settingcheckout.Viewmodel216_1
import com.awesomeapp.settingcheckout.Activity216_2
import com.awesomeapp.settingcheckout.Activity216_3
import com.awesomeapp.settingcheckout.Fragment216_4
import com.awesomeapp.settingcheckout.Repository216_5
import com.awesomeapp.settingcheckout.Api216_6

@Module
@InstallIn(SingletonComponent::class)
object Module_216 {
    @Provides
    @Singleton
    fun provideRepository216_5(): Repository216_5 {
        return Repository216_5()
    }

    @Provides
    @Singleton
    fun provideApi216_6(): Api216_6 {
        return Api216_6()
    }
}