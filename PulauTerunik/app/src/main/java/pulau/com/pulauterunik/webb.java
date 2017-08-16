package pulau.com.pulauterunik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webb);

        WebView view = (WebView)findViewById(R.id.view);
        view.loadUrl("https://www.smkassalaambandung.sch.id");
    }
}
