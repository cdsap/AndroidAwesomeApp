package com.awesomeapp.logidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logidentity.Viewmodel172_1
import com.awesomeapp.logidentity.Activity172_2
import com.awesomeapp.logidentity.Activity172_3
import com.awesomeapp.logidentity.Fragment172_4
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.logidentity.Api172_6

@Module
@InstallIn(SingletonComponent::class)
object Module_172 {
    @Provides
    @Singleton
    fun provideRepository172_5(
        api0: Api108_6 = Api108_6()
    ): Repository172_5 {
        return Repository172_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi172_6(): Api172_6 {
        return Api172_6()
    }
}