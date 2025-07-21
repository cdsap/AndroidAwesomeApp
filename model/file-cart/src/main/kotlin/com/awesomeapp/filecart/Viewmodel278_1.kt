package com.awesomeapp.filecart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.identitycheckout.Repository200_5
import com.awesomeapp.accountidentity.Repository168_5
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.settingcheckout.Repository216_5
import com.awesomeapp.searchcheckout.Repository208_5
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.reportcheckout.Repository220_5
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.sharecheckout.Repository212_5


@HiltViewModel
class Viewmodel278_1 @Inject constructor(
    private val repository0: Repository200_5,
    private val repository1: Repository168_5,
    private val repository2: Repository244_5,
    private val repository3: Repository216_5,
    private val repository4: Repository208_5,
    private val repository5: Repository236_5,
    private val repository6: Repository240_5,
    private val repository7: Repository220_5,
    private val repository8: Repository180_5,
    private val repository9: Repository172_5,
    private val repository10: Repository188_5,
    private val repository11: Repository232_5,
    private val repository12: Repository212_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData() + repository1.getData() + repository2.getData() + repository3.getData() + repository4.getData() + repository5.getData() + repository6.getData() + repository7.getData() + repository8.getData() + repository9.getData() + repository10.getData() + repository11.getData() + repository12.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}