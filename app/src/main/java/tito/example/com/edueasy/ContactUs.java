package tito.example.com.edueasy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactUs extends AppCompatActivity {

    TextView divyam , tito_name , yash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        divyam = findViewById(R.id.divyam);
        tito_name = findViewById(R.id.tito);
        yash = findViewById(R.id.yash);

        divyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                String[] to={"divyampandya63@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Message regarding app to " + divyam);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


     tito_name.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            String[] to={"titonadar06@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Message regarding app to " + tito_name);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    });

        yash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                String[] to={"yashpurohit1234@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Message regarding app to " + yash);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}

