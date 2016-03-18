package com.thefinestartist.finestwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/**
 * Created by TheFinestArtist on 3/16/16.
 */
public class FinestWebView extends RelativeLayout {

    public FinestWebView(Context context) {
        super(context);
        bindView();
    }

    public FinestWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        bindView();
    }

    public FinestWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        bindView();
    }

    WebView webView;
    View divider;
    View gradient;
    ProgressBar progressBar;

    private void bindView() {
        inflate(getContext(), R.layout.finest_webview, this);
        webView = (WebView) findViewById(R.id.webView);
        divider = findViewById(R.id.divider);
        gradient = findViewById(R.id.gradient);
    }
}
