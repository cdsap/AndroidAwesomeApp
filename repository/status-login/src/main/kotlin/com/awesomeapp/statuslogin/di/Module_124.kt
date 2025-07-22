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
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.statuslogin.Api124_6

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(
        api0: Api100_6 = Api100_6()
    ): Repository124_5 {
        return Repository124_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}