package com.awesomeapp.fileidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.checkoutidentity.Api152_6


@Singleton
class Repository180_5 @Inject constructor(
    private val api0: Api116_6,
    private val api1: Api124_6,
    private val api2: Api152_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        coroutineScope {
    val apis = listOf<suspend () -> String>(
        { api0.fetchData() },
        { api1.fetchData() },
        { api2.fetchData() }
    )
    val results = apis.map { fetcher ->
        async { fetcher() }
    }.awaitAll()
    results.joinToString("")
}
    }
}