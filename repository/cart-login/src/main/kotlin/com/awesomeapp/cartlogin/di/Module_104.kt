package com.awesomeapp.cartlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartlogin.Viewmodel104_1
import com.awesomeapp.cartlogin.Activity104_2
import com.awesomeapp.cartlogin.Activity104_3
import com.awesomeapp.cartlogin.Fragment104_4
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.cartlogin.Api104_6

@Module
@InstallIn(SingletonComponent::class)
object Module_104 {
    @Provides
    @Singleton
    fun provideRepository104_5(
        api0: Api100_6 = Api100_6()
    ): Repository104_5 {
        return Repository104_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi104_6(): Api104_6 {
        return Api104_6()
    }
}