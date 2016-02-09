package billy.com.gymglishapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Website extends Activity {

    private WebView webView;
    private String url;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        final Activity activity = this;
        webView = new WebView(this);

        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        webView.loadUrl(url);
        setContentView(webView);
    }

}