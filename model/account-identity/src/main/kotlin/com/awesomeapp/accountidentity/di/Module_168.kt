package com.awesomeapp.accountidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.accountidentity.Viewmodel168_1
import com.awesomeapp.accountidentity.Activity168_2
import com.awesomeapp.accountidentity.Activity168_3
import com.awesomeapp.accountidentity.Fragment168_4
import com.awesomeapp.accountidentity.Repository168_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.accountidentity.Api168_6

@Module
@InstallIn(SingletonComponent::class)
object Module_168 {
    @Provides
    @Singleton
    fun provideRepository168_5(
        api0: Api128_6 = Api128_6(),
        api1: Api116_6 = Api116_6(),
        api2: Api152_6 = Api152_6()
    ): Repository168_5 {
        return Repository168_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi168_6(): Api168_6 {
        return Api168_6()
    }
}