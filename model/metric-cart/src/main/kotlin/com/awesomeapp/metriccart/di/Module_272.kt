package com.awesomeapp.metriccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccart.Viewmodel272_1
import com.awesomeapp.metriccart.Activity272_2
import com.awesomeapp.metriccart.Activity272_3
import com.awesomeapp.metriccart.Fragment272_4
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.metriccart.Api272_6

@Module
@InstallIn(SingletonComponent::class)
object Module_272 {
    @Provides
    @Singleton
    fun provideRepository272_5(
        api0: Api184_6 = Api184_6(),
        api1: Api172_6 = Api172_6()
    ): Repository272_5 {
        return Repository272_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi272_6(): Api272_6 {
        return Api272_6()
    }
}