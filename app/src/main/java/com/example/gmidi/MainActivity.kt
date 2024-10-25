package com.example.gmidi

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gmidi.model.WebViewClientImpl

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var btnRetry: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (isNetworkAvailable()) {
            setContentView(R.layout.activity_main)
            webView = findViewById(R.id.webview)
            webView.webViewClient = WebViewClientImpl(this)
            webView.settings.javaScriptEnabled = true
            webView.loadUrl("https://gmidi.netlify.app/")
        } else {
            setContentView(R.layout.activity_no_connection)
            btnRetry = findViewById(R.id.btn_retry)
            btnRetry.setOnClickListener {
                recreate()
            }
        }
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
}
