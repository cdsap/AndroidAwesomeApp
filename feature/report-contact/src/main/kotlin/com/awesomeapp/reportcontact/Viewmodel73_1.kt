package com.awesomeapp.reportcontact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.timer.Repository32_5
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.report.Repository24_5
import com.awesomeapp.share.Repository16_5
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.search.Repository12_5


@HiltViewModel
class Viewmodel73_1 @Inject constructor(
    private val repository0: Repository4_5,
    private val repository1: Repository32_5,
    private val repository2: Repository20_5,
    private val repository3: Repository24_5,
    private val repository4: Repository16_5,
    private val repository5: Repository28_5,
    private val repository6: Repository12_5
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