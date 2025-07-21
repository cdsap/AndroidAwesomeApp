package com.awesomeapp.messageidentity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.networklogin.Repository112_5
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.notificationcontact.Repository68_5
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.contactlogin.Repository100_5
import com.awesomeapp.notecontact.Repository84_5
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.podcastcontact.Repository92_5
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.postcontact.Repository60_5
import com.awesomeapp.weathercontact.Repository88_5


@HiltViewModel
class Viewmodel165_1 @Inject constructor(
    private val repository0: Repository104_5,
    private val repository1: Repository112_5,
    private val repository2: Repository160_5,
    private val repository3: Repository76_5,
    private val repository4: Repository56_5,
    private val repository5: Repository164_5,
    private val repository6: Repository136_5,
    private val repository7: Repository156_5,
    private val repository8: Repository132_5,
    private val repository9: Repository140_5,
    private val repository10: Repository64_5,
    private val repository11: Repository68_5,
    private val repository12: Repository72_5,
    private val repository13: Repository108_5,
    private val repository14: Repository128_5,
    private val repository15: Repository124_5,
    private val repository16: Repository80_5,
    private val repository17: Repository100_5,
    private val repository18: Repository84_5,
    private val repository19: Repository144_5,
    private val repository20: Repository148_5,
    private val repository21: Repository96_5,
    private val repository22: Repository92_5,
    private val repository23: Repository120_5,
    private val repository24: Repository152_5,
    private val repository25: Repository116_5,
    private val repository26: Repository60_5,
    private val repository27: Repository88_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData() + repository14.getData() + repository15.getData() + repository16.getData() + repository17.getData() + repository18.getData() + repository19.getData() + repository20.getData() + repository21.getData() + repository22.getData() + repository23.getData() + repository24.getData() + repository25.getData() + repository26.getData() + repository27.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}