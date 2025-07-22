package com.awesomeapp.pushidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushidentity.Viewmodel148_1
import com.awesomeapp.pushidentity.Activity148_2
import com.awesomeapp.pushidentity.Activity148_3
import com.awesomeapp.pushidentity.Fragment148_4
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.pushidentity.Api148_6

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(
        api0: Api100_6 = Api100_6()
    ): Repository148_5 {
        return Repository148_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}