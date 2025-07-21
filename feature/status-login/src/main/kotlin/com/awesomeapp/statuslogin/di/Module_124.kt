package com.awesomeapp.statuslogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.statuslogin.Viewmodel124_1
import com.awesomeapp.statuslogin.Activity124_2
import com.awesomeapp.statuslogin.Activity124_3
import com.awesomeapp.statuslogin.Fragment124_4
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.statuslogin.Api124_6

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(
        api0: Api36_6 = Api36_6(),
        api1: Api48_6 = Api48_6(),
        api2: Api8_6 = Api8_6(),
        api3: Api4_6 = Api4_6()
    ): Repository124_5 {
        return Repository124_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}