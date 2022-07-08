package com.metehanbolat.safelycollectflowscompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn

class MyViewModel : ViewModel() {
    private val myFlow = flow {
        (0..100).forEach {
            emit(it)
            delay(1000)
        }
    }
    val myStateFlow = myFlow.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = 0
    )
}