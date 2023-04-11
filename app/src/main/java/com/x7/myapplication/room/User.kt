package com.x7.myapplication.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.x7.myapplication.room.Constants.TABLE_NAME

@Entity(tableName = TABLE_NAME)
class User constructor(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val uid: Int,
    @ColumnInfo(name = "eng")
    val english: String,
    @ColumnInfo(name = "uzb")
    val uzbek: String,
    @ColumnInfo(name = "description")
    val descriptions: String,

):java.io.Serializable