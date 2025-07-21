package com.awesomeapp.alarmcart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.identitycheckout.Repository200_5
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.accountidentity.Repository168_5
import com.awesomeapp.logincart.Repository248_5
import com.awesomeapp.profilecheckout.Repository204_5
import com.awesomeapp.settingcheckout.Repository216_5
import com.awesomeapp.sharecheckout.Repository212_5
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.taskcheckout.Repository224_5


@HiltViewModel
class Viewmodel276_1 @Inject constructor(
    private val repository0: Repository232_5,
    private val repository1: Repository200_5,
    private val repository2: Repository192_5,
    private val repository3: Repository196_5,
    private val repository4: Repository240_5,
    private val repository5: Repository168_5,
    private val repository6: Repository248_5,
    private val repository7: Repository204_5,
    private val repository8: Repository216_5,
    private val repository9: Repository212_5,
    private val repository10: Repository180_5,
    private val repository11: Repository172_5,
    private val repository12: Repository228_5,
    private val repository13: Repository176_5,
    private val repository14: Repository224_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData() + repository13.getData() + repository14.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}