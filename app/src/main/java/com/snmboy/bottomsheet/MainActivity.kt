package com.snmboy.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        show.setOnClickListener{
            openDialog()
        }




    }

    private fun openDialog(){
        val dialog = BottomSheetDialog(this)
        val bottomSheet = layoutInflater.inflate(R.layout.bottom_sheet, null)

        bottomSheet.buttonSubmit.setOnClickListener { dialog.dismiss() }
        dialog.setContentView(bottomSheet)
        dialog.show()
    }
}
