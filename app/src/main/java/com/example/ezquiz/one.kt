package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        a.setOnClickListener { val intent = Intent(this@one, two::class.java)
            intent.putExtra("name", "SuperCom")
            intent.putExtra("name2", "5")
            startActivity(intent)
        }
        b.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "incorrect", Toast.LENGTH_SHORT)
            myToast.show()
        }
        c.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "incorrect", Toast.LENGTH_SHORT)
            myToast.show()
        }
        d.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "incorrect", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}