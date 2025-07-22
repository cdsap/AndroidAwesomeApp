package com.awesomeapp.feedidentity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.gallerylogin.Repository144_5


@HiltViewModel
class Viewmodel156_1 @Inject constructor(
    private val repository0: Repository152_5,
    private val repository1: Repository104_5,
    private val repository2: Repository108_5,
    private val repository3: Repository144_5
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