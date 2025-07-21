package com.awesomeapp.synccart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.searchcheckout.Api208_6


@Singleton
class Repository260_5 @Inject constructor(
    private val api0: Api196_6,
    private val api1: Api252_6,
    private val api2: Api216_6,
    private val api3: Api168_6,
    private val api4: Api208_6
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