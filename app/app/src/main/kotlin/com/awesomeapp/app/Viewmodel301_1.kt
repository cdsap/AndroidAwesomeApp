package com.awesomeapp.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.notificationcart.Repository264_5
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.cartuser.Repository300_5


@HiltViewModel
class Viewmodel301_1 @Inject constructor(
    private val repository0: Repository256_5,
    private val repository1: Repository260_5,
    private val repository2: Repository264_5,
    private val repository3: Repository268_5,
    private val repository4: Repository272_5,
    private val repository5: Repository276_5,
    private val repository6: Repository280_5,
    private val repository7: Repository284_5,
    private val repository8: Repository288_5,
    private val repository9: Repository292_5,
    private val repository10: Repository296_5,
    private val repository11: Repository300_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}