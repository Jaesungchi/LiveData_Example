package com.kotlin.jaesungchi.mvvm_example

import android.app.Application
import androidx.lifecycle.LiveData
import com.kotlin.jaesungchi.mvvm_example.Room.Contact
import com.kotlin.jaesungchi.mvvm_example.Room.ContactDatabase
import java.lang.Exception

class ContactRepository (application : Application){

    private val contactDatabase = ContactDatabase.getInstance(application)!!
    private val contactDao = contactDatabase.contactDao()
    private val contacts = contactDao.getAll()

    fun getAll() : LiveData<List<Contact>> = contacts

    fun insert(contact: Contact){
        try{
            val thread = Thread(Runnable {
                contactDao.insert(contact)
            })
            thread.start()
        }catch(e:Exception){

        }
    }

    fun delete(contact:Contact){
        try {
            val thread = Thread(Runnable {
                contactDao.delete(contact)
            })
            thread.start()
        }catch (e:Exception){

        }
    }
}