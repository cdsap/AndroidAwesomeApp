package com.awesomeapp.photoidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.photoidentity.Viewmodel192_1
import com.awesomeapp.photoidentity.Activity192_2
import com.awesomeapp.photoidentity.Activity192_3
import com.awesomeapp.photoidentity.Fragment192_4
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.photoidentity.Api192_6

@Module
@InstallIn(SingletonComponent::class)
object Module_192 {
    @Provides
    @Singleton
    fun provideRepository192_5(): Repository192_5 {
        return Repository192_5()
    }

    @Provides
    @Singleton
    fun provideApi192_6(): Api192_6 {
        return Api192_6()
    }
}