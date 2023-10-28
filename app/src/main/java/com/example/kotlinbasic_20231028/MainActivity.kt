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

        binding.btn4.setOnClickListener {

            val userAge = binding.edtUserAge.text.toString().toInt()

//            if(userAge >= 20){
//                Toast.makeText(this, "성인입니다", Toast.LENGTH_SHORT).show()
//            }else if(userAge >=17){
//                Toast.makeText(this, "고딩입니다", Toast.LENGTH_SHORT).show()
//            }else{
//                Toast.makeText(this, "중딩 또는 그 이하입니다", Toast.LENGTH_SHORT).show()
//            }

            when(userAge){
                25 -> {
                    Toast.makeText(this, "25살 입니다", Toast.LENGTH_SHORT).show()
                }
                27,28,29 ->{
                    Toast.makeText(this, "20대 후반입니다", Toast.LENGTH_SHORT).show()
                }
                in 30..39 ->{
                    Toast.makeText(this, "30대 입니다", Toast.LENGTH_SHORT).show()
                }
            }


        }

        binding.btn5.setOnClickListener {
            val userName = binding.edtName.text.toString()

            Toast.makeText(this, "${userName}님 환영합니다", Toast.LENGTH_SHORT).show()
        }

    }
}