package com.site

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val mywebapp=findViewById<WebView>(R.id.webView)
            mywebapp.webViewClient= WebViewClient()
            mywebapp.loadUrl("https://myportal.kyu.ac.ug/")
            val websettings = mywebapp.settings
            websettings.javaScriptEnabled=true
            mywebapp.setWebViewClient(WebViewClient())

            fun onBackPressedCallback() {
                if(mywebapp.canGoBack())
                {
                    mywebapp.goBack()
                }

                else{
                    super.onBackPressed()
                }
            }



        }

    }


