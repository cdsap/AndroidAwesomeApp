package com.awesomeapp.documentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentlogin.Viewmodel132_1
import com.awesomeapp.documentlogin.Activity132_2
import com.awesomeapp.documentlogin.Activity132_3
import com.awesomeapp.documentlogin.Fragment132_4
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.report.Api24_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.documentlogin.Api132_6

@Module
@InstallIn(SingletonComponent::class)
object Module_132 {
    @Provides
    @Singleton
    fun provideRepository132_5(
        api0: Api24_6 = Api24_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api40_6 = Api40_6(),
        api3: Api20_6 = Api20_6(),
        api4: Api36_6 = Api36_6(),
        api5: Api16_6 = Api16_6(),
        api6: Api28_6 = Api28_6(),
        api7: Api32_6 = Api32_6(),
        api8: Api8_6 = Api8_6(),
        api9: Api44_6 = Api44_6(),
        api10: Api52_6 = Api52_6(),
        api11: Api4_6 = Api4_6(),
        api12: Api48_6 = Api48_6()
    ): Repository132_5 {
        return Repository132_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12)
    }

    @Provides
    @Singleton
    fun provideApi132_6(): Api132_6 {
        return Api132_6()
    }
}