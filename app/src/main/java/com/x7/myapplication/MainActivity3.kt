package com.x7.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.myapplication.databinding.ActivityMain3Binding
import com.x7.myapplication.room.User
import com.x7.myapplication.room.UserDao

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    lateinit var userDao: UserDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        userDao=Rooom.getroom(this@MainActivity3).userdao()

        val intent=intent
        val hammasi:User = intent.getSerializableExtra("hammasi") as User

        binding.textviewdescriptions.text="${hammasi.english} ${hammasi.uzbek} \n\n ${hammasi.descriptions}"


    }
}