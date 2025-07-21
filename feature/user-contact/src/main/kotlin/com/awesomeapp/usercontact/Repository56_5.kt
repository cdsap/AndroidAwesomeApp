package com.awesomeapp.usercontact

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.task.Api28_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.todo.Api36_6


@Singleton
class Repository56_5 @Inject constructor(
    private val api0: Api28_6,
    private val api1: Api48_6,
    private val api2: Api8_6,
    private val api3: Api12_6,
    private val api4: Api32_6,
    private val api5: Api44_6,
    private val api6: Api36_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        coroutineScope {
    val apis = listOf<suspend () -> String>(
        { api0.fetchData() },
        { api1.fetchData() },
        { api2.fetchData() },
        { api3.fetchData() },
        { api4.fetchData() },
        { api5.fetchData() },
        { api6.fetchData() }
    )
    val results = apis.map { fetcher ->
        async { fetcher() }
    }.awaitAll()
    results.joinToString("")
}
    }
}