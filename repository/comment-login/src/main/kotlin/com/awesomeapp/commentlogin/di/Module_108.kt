package com.awesomeapp.commentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentlogin.Viewmodel108_1
import com.awesomeapp.commentlogin.Activity108_2
import com.awesomeapp.commentlogin.Activity108_3
import com.awesomeapp.commentlogin.Fragment108_4
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.commentlogin.Api108_6

@Module
@InstallIn(SingletonComponent::class)
object Module_108 {
    @Provides
    @Singleton
    fun provideRepository108_5(
        api0: Api100_6 = Api100_6()
    ): Repository108_5 {
        return Repository108_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi108_6(): Api108_6 {
        return Api108_6()
    }
}