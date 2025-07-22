package com.awesomeapp.contactlogin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.notecontact.Repository84_5
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.notificationcontact.Repository68_5
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.podcastcontact.Repository92_5
import com.awesomeapp.postcontact.Repository60_5
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.logincontact.Repository52_5


@HiltViewModel
class Viewmodel100_1 @Inject constructor(
    private val repository0: Repository96_5,
    private val repository1: Repository80_5,
    private val repository2: Repository76_5,
    private val repository3: Repository84_5,
    private val repository4: Repository36_5,
    private val repository5: Repository64_5,
    private val repository6: Repository88_5,
    private val repository7: Repository56_5,
    private val repository8: Repository68_5,
    private val repository9: Repository48_5,
    private val repository10: Repository72_5,
    private val repository11: Repository44_5,
    private val repository12: Repository92_5,
    private val repository13: Repository60_5,
    private val repository14: Repository40_5,
    private val repository15: Repository52_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData() + repository14.getData() + repository15.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}