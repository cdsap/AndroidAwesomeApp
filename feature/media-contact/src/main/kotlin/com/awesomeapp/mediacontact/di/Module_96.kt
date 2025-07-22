package com.awesomeapp.mediacontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacontact.Viewmodel96_1
import com.awesomeapp.mediacontact.Activity96_2
import com.awesomeapp.mediacontact.Activity96_3
import com.awesomeapp.mediacontact.Fragment96_4
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.mediacontact.Api96_6

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(
        api0: Api8_6 = Api8_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api28_6 = Api28_6(),
        api3: Api32_6 = Api32_6(),
        api4: Api20_6 = Api20_6(),
        api5: Api16_6 = Api16_6(),
        api6: Api24_6 = Api24_6(),
        api7: Api4_6 = Api4_6()
    ): Repository96_5 {
        return Repository96_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}