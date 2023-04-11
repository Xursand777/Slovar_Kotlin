package com.x7.myapplication.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class Appdatabase:RoomDatabase() {
    abstract fun userdao(): UserDao
}