package com.example.alertcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertcustom.helper.AlertDialogJD
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.alert_custom_1.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOpen.setOnClickListener {
            object : AlertDialogJD(this, "Are you sure you want to apply the chages?") {
                override fun Yes() {
                    Toast.makeText(context, "you have accepted", Toast.LENGTH_SHORT).show()
                }

                override fun No() {
                    Toast.makeText(context, "you have rejected", Toast.LENGTH_SHORT).show()

                }
            }
        }

    }
}