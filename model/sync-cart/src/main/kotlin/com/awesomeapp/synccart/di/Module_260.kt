package com.awesomeapp.synccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccart.Viewmodel260_1
import com.awesomeapp.synccart.Activity260_2
import com.awesomeapp.synccart.Activity260_3
import com.awesomeapp.synccart.Fragment260_4
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.synccart.Api260_6

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api196_6 = Api196_6(),
        api1: Api252_6 = Api252_6(),
        api2: Api216_6 = Api216_6(),
        api3: Api168_6 = Api168_6(),
        api4: Api208_6 = Api208_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}