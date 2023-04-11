package com.x7.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.myapplication.databinding.ActivityMain2Binding
import com.x7.myapplication.room.User
import com.x7.myapplication.room.UserDao

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    lateinit var userDao: UserDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        userDao=Rooom.getroom(this@MainActivity2).userdao()

        binding.imageviewSave.setOnClickListener {
        val user = User(0,binding.edittexteng.text.toString(),binding.edittextuzb.text.toString(),binding.edittextdescription.text.toString())
            userDao.insertUser(user)
        }


    }
}