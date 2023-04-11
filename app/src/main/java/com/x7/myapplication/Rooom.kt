package com.x7.myapplication

import android.content.Context
import androidx.room.Room
import com.x7.myapplication.room.Appdatabase
import com.x7.myapplication.room.Constants

object Rooom {

fun getroom(context:Context):Appdatabase{
    val db:Appdatabase = Room.databaseBuilder(
        context,
        Appdatabase::class.java, "${Constants.TABLE_NAME}"
    ).allowMainThreadQueries().build()

    return db
   }
}