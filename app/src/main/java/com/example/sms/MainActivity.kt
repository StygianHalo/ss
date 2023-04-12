package com.example.sms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val etNumber: EditText = findViewById(R.id.etNumber)
        val etMessage: EditText = findViewById(R.id.etMessage)
        val btSend : Button = findViewById(R.id.btSend)
        ActivityCompat.requestPermissions(this , arrayOf(android.Manifest.permission.SEND_SMS),10)
        btSend.setOnClickListener{
            val Number = etNumber.text.toString()
            val Message= etMessage.text.toString()
            val smsManager : SmsManager
            smsManager =SmsManager.getDefault()
            smsManager.sendTextMessage(Number,null,Message,null,null)
        }
    }
}