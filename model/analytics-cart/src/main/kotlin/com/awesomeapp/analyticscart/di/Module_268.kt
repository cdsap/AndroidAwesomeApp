package com.awesomeapp.analyticscart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscart.Viewmodel268_1
import com.awesomeapp.analyticscart.Activity268_2
import com.awesomeapp.analyticscart.Activity268_3
import com.awesomeapp.analyticscart.Fragment268_4
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.analyticscart.Api268_6

@Module
@InstallIn(SingletonComponent::class)
object Module_268 {
    @Provides
    @Singleton
    fun provideRepository268_5(
        api0: Api176_6 = Api176_6(),
        api1: Api196_6 = Api196_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api236_6 = Api236_6(),
        api4: Api204_6 = Api204_6(),
        api5: Api228_6 = Api228_6()
    ): Repository268_5 {
        return Repository268_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi268_6(): Api268_6 {
        return Api268_6()
    }
}