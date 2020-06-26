package com.kotlin.jaesungchi.mvvm_example

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.kotlin.jaesungchi.mvvm_example.Room.Contact

class ContactViewModel (application: Application) : AndroidViewModel(application){
    private val repository = ContactRepository(application)
    private val contacts = repository.getAll()

    fun getAll() : LiveData<List<Contact>> = this.contacts

    fun insert(contact : Contact) = repository.insert(contact)

    fun delete(contact :Contact) = repository.delete(contact)
}