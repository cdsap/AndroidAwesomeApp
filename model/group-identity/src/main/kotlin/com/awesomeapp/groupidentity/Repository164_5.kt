package com.awesomeapp.groupidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.documentlogin.Api132_6


@Singleton
class Repository164_5 @Inject constructor(
    private val api0: Api152_6,
    private val api1: Api104_6,
    private val api2: Api108_6,
    private val api3: Api120_6,
    private val api4: Api128_6,
    private val api5: Api132_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        coroutineScope {
    val apis = listOf<suspend () -> String>(
        { api0.fetchData() },
        { api1.fetchData() },
        { api2.fetchData() },
        { api3.fetchData() },
        { api4.fetchData() },
        { api5.fetchData() }
    )
    val results = apis.map { fetcher ->
        async { fetcher() }
    }.awaitAll()
    results.joinToString("")
}
    }
}