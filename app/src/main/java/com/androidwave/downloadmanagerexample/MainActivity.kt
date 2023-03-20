package com.androidwave.downloadmanagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val downloader = AndroidDownloader(this)
        val fileUrl= "https://androidwave.com/wp-content/uploads/2020/01/navigation-component-in-android.png"

        findViewById<TextView>(R.id.textView).text = fileUrl
        findViewById<Button>(R.id.button).setOnClickListener {
            /** Update the URL of file that you wish to download*/
            downloader.downloadFile(fileUrl)
        }
    }
}


