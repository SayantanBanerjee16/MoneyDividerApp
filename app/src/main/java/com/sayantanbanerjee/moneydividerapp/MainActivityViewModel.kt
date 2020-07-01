package com.sayantanbanerjee.moneydividerapp

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val amountPerson1 = MutableLiveData<String>()
    val amountPerson2 = MutableLiveData<String>()

    private var noValue = MutableLiveData<String>()
    val noValueToast: LiveData<String>
        get() = noValue

    private var diff = MutableLiveData<Int>()
    val difference: LiveData<Int>
        get() = diff

    fun calculate(){
        if (amountPerson1.value == "" || amountPerson2.value == "") {
            noValue.value = "NONE"
        } else {
             diff.value = amountPerson1.value!!.toInt().minus(amountPerson2.value!!.toInt())
        }
    }
}
