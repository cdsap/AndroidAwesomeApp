package com.awesomeapp.newsidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newsidentity.Viewmodel188_1
import com.awesomeapp.newsidentity.Activity188_2
import com.awesomeapp.newsidentity.Activity188_3
import com.awesomeapp.newsidentity.Fragment188_4
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.newsidentity.Api188_6

@Module
@InstallIn(SingletonComponent::class)
object Module_188 {
    @Provides
    @Singleton
    fun provideRepository188_5(): Repository188_5 {
        return Repository188_5()
    }

    @Provides
    @Singleton
    fun provideApi188_6(): Api188_6 {
        return Api188_6()
    }
}