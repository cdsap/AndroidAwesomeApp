package com.awesomeapp.feedidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedidentity.Viewmodel156_1
import com.awesomeapp.feedidentity.Activity156_2
import com.awesomeapp.feedidentity.Activity156_3
import com.awesomeapp.feedidentity.Fragment156_4
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.feedidentity.Api156_6

@Module
@InstallIn(SingletonComponent::class)
object Module_156 {
    @Provides
    @Singleton
    fun provideRepository156_5(
        api0: Api152_6 = Api152_6(),
        api1: Api104_6 = Api104_6(),
        api2: Api108_6 = Api108_6(),
        api3: Api144_6 = Api144_6()
    ): Repository156_5 {
        return Repository156_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi156_6(): Api156_6 {
        return Api156_6()
    }
}