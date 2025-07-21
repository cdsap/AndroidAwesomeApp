package com.awesomeapp.taskcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.taskcheckout.Viewmodel224_1
import com.awesomeapp.taskcheckout.Activity224_2
import com.awesomeapp.taskcheckout.Activity224_3
import com.awesomeapp.taskcheckout.Fragment224_4
import com.awesomeapp.taskcheckout.Repository224_5
import com.awesomeapp.taskcheckout.Api224_6

@Module
@InstallIn(SingletonComponent::class)
object Module_224 {
    @Provides
    @Singleton
    fun provideRepository224_5(): Repository224_5 {
        return Repository224_5()
    }

    @Provides
    @Singleton
    fun provideApi224_6(): Api224_6 {
        return Api224_6()
    }
}