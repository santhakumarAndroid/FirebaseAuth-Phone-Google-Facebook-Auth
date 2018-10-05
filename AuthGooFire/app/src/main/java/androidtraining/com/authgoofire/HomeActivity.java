package androidtraining.com.authgoofire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView phonenumbertextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        phonenumbertextview = (TextView)findViewById(R.id.phonenumber);

        Intent showphonenumber = getIntent();
        String phonenumber = showphonenumber.getExtras().getString("phone");

        phonenumbertextview.setText(phonenumber);

    }
}
