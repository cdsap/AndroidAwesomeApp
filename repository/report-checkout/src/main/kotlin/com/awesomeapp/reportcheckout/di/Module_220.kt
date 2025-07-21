package com.awesomeapp.reportcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.reportcheckout.Viewmodel220_1
import com.awesomeapp.reportcheckout.Activity220_2
import com.awesomeapp.reportcheckout.Activity220_3
import com.awesomeapp.reportcheckout.Fragment220_4
import com.awesomeapp.reportcheckout.Repository220_5
import com.awesomeapp.reportcheckout.Api220_6

@Module
@InstallIn(SingletonComponent::class)
object Module_220 {
    @Provides
    @Singleton
    fun provideRepository220_5(): Repository220_5 {
        return Repository220_5()
    }

    @Provides
    @Singleton
    fun provideApi220_6(): Api220_6 {
        return Api220_6()
    }
}