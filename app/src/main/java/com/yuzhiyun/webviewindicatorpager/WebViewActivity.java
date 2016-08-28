package com.yuzhiyun.webviewindicatorpager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends Activity {
	private WebView myWebView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		myWebView = (WebView) findViewById(R.id.myWebView);
		myWebView.getSettings().setJavaScriptEnabled(true);
		// 与js交互，JavaScriptinterface 是个接口，与js交互时用到的，这个接口实现了从网页跳到app中的activity 的方法，特别重要
		myWebView.addJavascriptInterface(new JavaScriptinterface(this), "android");
		myWebView.loadUrl("file:///android_asset/index.html");

	}
}