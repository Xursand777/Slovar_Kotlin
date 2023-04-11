package com.x7.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.LinearLayoutManager
import com.x7.myapplication.databinding.ActivityMainBinding
import com.x7.myapplication.room.User
import com.x7.myapplication.room.UserDao
import com.x7.myapplication.Rooom.getroom


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var userDao: UserDao
    var arrayList=ArrayList<User>()
    lateinit var slovarAdapter: SlovarAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userDao=getroom(this@MainActivity).userdao()

        arrayList=userDao.getAllUsers() as ArrayList<User>

        binding.imageviewvocabularyadd.setOnClickListener {
            val intent=Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
        }

        binding.edittextsearch.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                 filter(p0.toString())
            }

        })


        binding.recyclerview1.layoutManager=LinearLayoutManager(this@MainActivity)
        slovarAdapter=SlovarAdapter(this@MainActivity,arrayList)
        binding.recyclerview1.adapter=slovarAdapter



    }
    fun filter(text:String){
        val searcharraylist=ArrayList<User>()

        for (item:User in arrayList){
            if (item.english.lowercase().contains(text.lowercase()) || item.uzbek.lowercase().contains(text.lowercase())){
                searcharraylist.add(item)
            }
        }
        slovarAdapter.filterList(searcharraylist)

    }

}