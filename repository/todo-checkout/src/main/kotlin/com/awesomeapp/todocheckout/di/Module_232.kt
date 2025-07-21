package com.awesomeapp.todocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todocheckout.Viewmodel232_1
import com.awesomeapp.todocheckout.Activity232_2
import com.awesomeapp.todocheckout.Activity232_3
import com.awesomeapp.todocheckout.Fragment232_4
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.todocheckout.Api232_6

@Module
@InstallIn(SingletonComponent::class)
object Module_232 {
    @Provides
    @Singleton
    fun provideRepository232_5(): Repository232_5 {
        return Repository232_5()
    }

    @Provides
    @Singleton
    fun provideApi232_6(): Api232_6 {
        return Api232_6()
    }
}