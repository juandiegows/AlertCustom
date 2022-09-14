package com.example.alertcustom.helper

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertcustom.R
import kotlinx.android.synthetic.main.alert_custom_1.view.*

open class AlertDialogJD(
    val context: Context,
    val message: String
) : IAlertDialogJD {


    init {

        var view: View = LayoutInflater.from(context).inflate(R.layout.alert_custom_1, null)
        var alertBuilder = AlertDialog.Builder(context);
        alertBuilder.setView(view)

        var alert = alertBuilder.create();
        view.txtMessage.text = message
        view.btnYes.setOnClickListener {
            this.Yes()
            alert.dismiss()
        }
        view.btnNo.setOnClickListener {
            this.No()
            alert.dismiss()
        }
        alert.show()
    }

    override fun Yes() {
        Toast.makeText(context, "Yes", Toast.LENGTH_SHORT).show()
    }

    override fun No() {
        Toast.makeText(context, "No", Toast.LENGTH_SHORT).show()
    }

}