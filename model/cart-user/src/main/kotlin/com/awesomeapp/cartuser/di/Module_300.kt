package com.awesomeapp.cartuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartuser.Viewmodel300_1
import com.awesomeapp.cartuser.Activity300_2
import com.awesomeapp.cartuser.Activity300_3
import com.awesomeapp.cartuser.Fragment300_4
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.cartuser.Api300_6

@Module
@InstallIn(SingletonComponent::class)
object Module_300 {
    @Provides
    @Singleton
    fun provideRepository300_5(
        api0: Api168_6 = Api168_6(),
        api1: Api192_6 = Api192_6(),
        api2: Api224_6 = Api224_6()
    ): Repository300_5 {
        return Repository300_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi300_6(): Api300_6 {
        return Api300_6()
    }
}