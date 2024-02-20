package com.example.bootcampodev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bootcampodev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var islem = "0"
    private var sonuc = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button0.setOnClickListener {
            islem = "${islem}0"
            binding.textViewSonuc.text = islem
        }
        binding.button1.setOnClickListener {
            islem = "${islem}1"
            binding.textViewSonuc.text = islem
        }
        binding.button2.setOnClickListener {
            islem = "${islem}2"
            binding.textViewSonuc.text = islem
        }
        binding.button3.setOnClickListener {
            islem = "${islem}3"
            binding.textViewSonuc.text = islem
        }
        binding.button4.setOnClickListener {
            islem = "${islem}4"
            binding.textViewSonuc.text = islem
        }
        binding.button5.setOnClickListener {
            islem = "${islem}5"
            binding.textViewSonuc.text = islem
        }
        binding.button6.setOnClickListener {
            islem = "${islem}6"
            binding.textViewSonuc.text = islem
        }
        binding.button7.setOnClickListener {
            islem = "${islem}7"
            binding.textViewSonuc.text = islem
        }
        binding.button8.setOnClickListener {
            islem = "${islem}8"
            binding.textViewSonuc.text = islem
        }
        binding.button9.setOnClickListener {
            islem = "${islem}9"
            binding.textViewSonuc.text = islem
        }
        binding.buttonClear.setOnClickListener {
            islem = "0"
            binding.textViewSonuc.text = islem
        }
        binding.buttonPlus.setOnClickListener {
            islem = "${islem}+"
            binding.textViewSonuc.text = islem
        }
        binding.buttonEqual.setOnClickListener {
            if (islem == ""){
                binding.textViewSonuc.text = "0" //hiçbir sayı girilmedem eşittir tuşuna basılırsa
            }else {
                sonuc = islem.split("+").sumOf {
                    it.toInt()
                }
                binding.textViewSonuc.text = "$sonuc"
                islem = sonuc.toString() // eşittirden sonra oluşan sonuç kullanılmak istenirse
            }
        }
    }
}
