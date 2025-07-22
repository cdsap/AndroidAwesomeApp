package com.awesomeapp.messagelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messagelogin.Viewmodel116_1
import com.awesomeapp.messagelogin.Activity116_2
import com.awesomeapp.messagelogin.Activity116_3
import com.awesomeapp.messagelogin.Fragment116_4
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.messagelogin.Api116_6

@Module
@InstallIn(SingletonComponent::class)
object Module_116 {
    @Provides
    @Singleton
    fun provideRepository116_5(
        api0: Api100_6 = Api100_6()
    ): Repository116_5 {
        return Repository116_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi116_6(): Api116_6 {
        return Api116_6()
    }
}