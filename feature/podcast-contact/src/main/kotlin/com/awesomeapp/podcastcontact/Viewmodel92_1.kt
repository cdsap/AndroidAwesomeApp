package com.awesomeapp.podcastcontact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.forecast.Repository40_5
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.share.Repository16_5


@HiltViewModel
class Viewmodel92_1 @Inject constructor(
    private val repository0: Repository12_5,
    private val repository1: Repository20_5,
    private val repository2: Repository48_5,
    private val repository3: Repository40_5,
    private val repository4: Repository8_5,
    private val repository5: Repository52_5,
    private val repository6: Repository4_5,
    private val repository7: Repository36_5,
    private val repository8: Repository44_5,
    private val repository9: Repository16_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}