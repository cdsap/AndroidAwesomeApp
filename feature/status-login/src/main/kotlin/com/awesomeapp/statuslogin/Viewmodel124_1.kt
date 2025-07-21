package com.awesomeapp.statuslogin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.todo.Repository36_5
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.identity.Repository4_5


@HiltViewModel
class Viewmodel124_1 @Inject constructor(
    private val repository0: Repository36_5,
    private val repository1: Repository48_5,
    private val repository2: Repository8_5,
    private val repository3: Repository4_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}