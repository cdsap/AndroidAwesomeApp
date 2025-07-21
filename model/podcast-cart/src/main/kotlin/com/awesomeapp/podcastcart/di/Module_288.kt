package com.awesomeapp.podcastcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Viewmodel288_1
import com.awesomeapp.podcastcart.Activity288_2
import com.awesomeapp.podcastcart.Activity288_3
import com.awesomeapp.podcastcart.Fragment288_4
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.podcastcart.Api288_6

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api252_6 = Api252_6(),
        api1: Api248_6 = Api248_6(),
        api2: Api184_6 = Api184_6(),
        api3: Api196_6 = Api196_6(),
        api4: Api240_6 = Api240_6(),
        api5: Api176_6 = Api176_6(),
        api6: Api192_6 = Api192_6(),
        api7: Api244_6 = Api244_6(),
        api8: Api228_6 = Api228_6(),
        api9: Api224_6 = Api224_6(),
        api10: Api216_6 = Api216_6(),
        api11: Api200_6 = Api200_6(),
        api12: Api212_6 = Api212_6(),
        api13: Api232_6 = Api232_6(),
        api14: Api188_6 = Api188_6(),
        api15: Api208_6 = Api208_6(),
        api16: Api168_6 = Api168_6(),
        api17: Api204_6 = Api204_6(),
        api18: Api172_6 = Api172_6(),
        api19: Api180_6 = Api180_6(),
        api20: Api220_6 = Api220_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
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
        api12, 
        api13, 
        api14, 
        api15, 
        api16, 
        api17, 
        api18, 
        api19, 
        api20)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}