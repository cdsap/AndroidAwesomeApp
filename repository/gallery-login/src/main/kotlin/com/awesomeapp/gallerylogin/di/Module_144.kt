package com.awesomeapp.gallerylogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.gallerylogin.Viewmodel144_1
import com.awesomeapp.gallerylogin.Activity144_2
import com.awesomeapp.gallerylogin.Activity144_3
import com.awesomeapp.gallerylogin.Fragment144_4
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.gallerylogin.Api144_6

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api100_6 = Api100_6()
    ): Repository144_5 {
        return Repository144_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}