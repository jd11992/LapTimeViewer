package com.jduong.laptimeviewer.viewcontroller.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.jduong.laptimeviewer.R

class HomeController : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val loadButton : Button = findViewById(R.id.loadButton)

        loadButton.setOnClickListener {
            loadAvailableCSVFiles()
        }

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
    override fun onDestroy() {
        super.onDestroy()
    }

    private fun loadAvailableCSVFiles(){

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.id_newest ->{

            }
            R.id.id_oldest ->{

            }
        }


        return super.onOptionsItemSelected(item)
    }

}
