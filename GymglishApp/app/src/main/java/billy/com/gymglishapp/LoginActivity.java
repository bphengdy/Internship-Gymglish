package billy.com.gymglishapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);



    }


    public void Connection(View v)
    {
        TextInputLayout til_1 = (TextInputLayout) findViewById(R.id.til_1);
        TextInputLayout til_2 = (TextInputLayout) findViewById(R.id.til_2);
        EditText tf_id = (EditText) findViewById(R.id.et_id);
        EditText tf_password = (EditText) findViewById(R.id.et_password);
        if(("Billy".equals(tf_id.getText().toString()) )&& ("gymglish1".equals(tf_password.getText().toString())))
        {
            Toast.makeText(this.getApplicationContext(), "Connection...", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ListWebsiteActivity.class);
            startActivity(intent);
        }
        else if((tf_id.getText().toString().equals("")==false) && (tf_password.getText().toString().equals("")==false))
            Toast.makeText(this.getApplicationContext(), "Wrong id or password !", Toast.LENGTH_SHORT).show();

        if(tf_id.getText().toString().equals("")) til_1.setError("Username required !");
        else til_1.setError(null);
        if(tf_password.getText().toString().equals("")) til_2.setError("Password required !");
        else til_2.setError(null);
    }


}
