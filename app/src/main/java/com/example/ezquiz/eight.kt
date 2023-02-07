package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)
        a.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "incorrect", Toast.LENGTH_SHORT)
            myToast.show()
        }
        b.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "incorrect", Toast.LENGTH_SHORT)
            myToast.show()
        }
        c.setOnClickListener {
            val intent = Intent(this@eight, nine::class.java)
            intent.putExtra("name", "SuperCom")
            intent.putExtra("name2", "5")
            startActivity(intent)
        }
        d.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "incorrect", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}