package com.awesomeapp.weathercart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.sharecheckout.Repository212_5


@HiltViewModel
class Viewmodel284_1 @Inject constructor(
    private val repository0: Repository188_5,
    private val repository1: Repository228_5,
    private val repository2: Repository192_5,
    private val repository3: Repository196_5,
    private val repository4: Repository212_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}