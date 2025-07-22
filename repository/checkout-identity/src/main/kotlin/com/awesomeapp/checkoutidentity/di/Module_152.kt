package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.checkoutidentity.Api152_6

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api100_6 = Api100_6()
    ): Repository152_5 {
        return Repository152_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}