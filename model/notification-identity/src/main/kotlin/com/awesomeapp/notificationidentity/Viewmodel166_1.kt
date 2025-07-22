package com.awesomeapp.notificationidentity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.gallerylogin.Repository144_5


@HiltViewModel
class Viewmodel166_1 @Inject constructor(
    private val repository0: Repository120_5,
    private val repository1: Repository108_5,
    private val repository2: Repository140_5,
    private val repository3: Repository136_5,
    private val repository4: Repository116_5,
    private val repository5: Repository132_5,
    private val repository6: Repository144_5
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