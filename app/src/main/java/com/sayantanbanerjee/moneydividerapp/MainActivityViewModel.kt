package com.sayantanbanerjee.moneydividerapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    // variables corresponding to the editText values. any change in editText is directly linked here
    val amountPerson1 = MutableLiveData<String>()
    val amountPerson2 = MutableLiveData<String>()

    //as noValue is private, thus another public variable is used to return it's value
    // it's made private because it is MutableLiveData, i.e, the data can be editable
    private var noValue = MutableLiveData<String>()
    val noValueToast: LiveData<String>
        get() = noValue

    private var diff = MutableLiveData<Int>()
    val difference: LiveData<Int>
        get() = diff

    //this method is directly called from the button onClick
    fun calculate(){
        if (amountPerson1.value == "" || amountPerson2.value == "") {
            noValue.value = "NONE"
        } else {
             diff.value = amountPerson1.value!!.toInt().minus(amountPerson2.value!!.toInt())
        }
    }
}
