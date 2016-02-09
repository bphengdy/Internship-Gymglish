package billy.com.gymglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;

public class ListWebsiteActivity extends Activity {
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listwebsite);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public void gotoWebsite(View v)
    {
        switch(v.getId())
        {
            case(R.id.btn_website1):
                url = "http://www.gymglish.com";
                break;
            case(R.id.btn_website2):
                url = "http://www.frantastique.com";
                break;
            case(R.id.btn_website3):
                url = "http://www.vatefaireconjuguer.com";
                break;
            case(R.id.btn_website4):
                url = "https://www.richmorning.com/pt/";
                break;
            case(R.id.btn_website5):
                url = "http://www.thewordofthemonth.com/fr/word/odd";
                break;
            case(R.id.btn_website6):
                url = "http://worksweetwork.com/";
                break;
        }
        Intent i = new Intent(this,Website.class);
        i.putExtra("url",url);
        startActivity(i);
    }
}
