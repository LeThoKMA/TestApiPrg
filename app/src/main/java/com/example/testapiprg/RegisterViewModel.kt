package com.example.testapiprg

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testapiprg.data.model.RegisterRequest
import com.example.testapiprg.data.model.Response
import com.example.testapiprg.data.model.User
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.util.Calendar

class RegisterViewModel : ViewModel() {

    fun withFlow() {
        viewModelScope.launch {
            var dataFlow: Flow<Any> = flow {
                Api.api.register()?.let { emit(it) }

            }

            var dataFlow2: Flow<Any> = flow {
                Api.apiN.nationalA().let {
                    if (it != null) {
                        emit(it)
                    }
                }

            }


            var flow: Flow<Any> = merge(dataFlow, dataFlow2)
            flow.collect()
            {
                Log.e("TAG", it.toString() + Calendar.getInstance().time.time)
            }
        }


    }
}