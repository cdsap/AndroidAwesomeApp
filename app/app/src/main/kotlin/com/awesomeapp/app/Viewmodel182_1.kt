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
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.accountidentity.Repository168_5
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.fileidentity.Repository180_5


@HiltViewModel
class Viewmodel182_1 @Inject constructor(
    private val repository0: Repository156_5,
    private val repository1: Repository160_5,
    private val repository2: Repository164_5,
    private val repository3: Repository168_5,
    private val repository4: Repository172_5,
    private val repository5: Repository176_5,
    private val repository6: Repository180_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}