package com.awesomeapp.sessioncart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.reportcheckout.Repository220_5
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.calendaridentity.Repository176_5


@HiltViewModel
class Viewmodel267_1 @Inject constructor(
    private val repository0: Repository220_5,
    private val repository1: Repository180_5,
    private val repository2: Repository244_5,
    private val repository3: Repository176_5
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