package com.awesomeapp.analyticscart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.usercart.Repository252_5
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.profilecheckout.Repository204_5
import com.awesomeapp.timercheckout.Repository228_5


@HiltViewModel
class Viewmodel268_1 @Inject constructor(
    private val repository0: Repository176_5,
    private val repository1: Repository196_5,
    private val repository2: Repository252_5,
    private val repository3: Repository236_5,
    private val repository4: Repository204_5,
    private val repository5: Repository228_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}