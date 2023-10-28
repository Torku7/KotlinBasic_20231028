package com.example.kotlinbasic_20231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinbasic_20231028.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn1.setOnClickListener {
            Log.d("메인화면","로그버튼 클릭됨")
        }
        binding.btn2.setOnClickListener {
            //토스트 버튼이 틀릭되면 =>토스트 띄우기

            Toast.makeText(this, "토스트버튼 눌림", Toast.LENGTH_SHORT).show()
        }


        binding.btn3.setOnClickListener {

            var myName : String

            myName = "박진우"

            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()

        }
    }
}