package com.awesomeapp.weathercart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.sharecheckout.Api212_6


@Singleton
class Repository284_5 @Inject constructor(
    private val api0: Api188_6,
    private val api1: Api228_6,
    private val api2: Api192_6,
    private val api3: Api196_6,
    private val api4: Api212_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        coroutineScope {
    val apis = listOf<suspend () -> String>(
        { api0.fetchData() },
        { api1.fetchData() },
        { api2.fetchData() },
        { api3.fetchData() },
        { api4.fetchData() }
    )
    val results = apis.map { fetcher ->
        async { fetcher() }
    }.awaitAll()
    results.joinToString("")
}
    }
}