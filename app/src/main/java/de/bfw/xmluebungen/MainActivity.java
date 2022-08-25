package de.bfw.xmluebungen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        /*Button callButton = findViewById(R.id.call_button);
        callButton.setOnClickListener(view -> {
            TextView callNumberInput = findViewById(R.id.call_screen_phone_number_input);
            Toast.makeText(this, "Calling: " + callNumberInput.getText(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tell:" + callNumberInput.getText()));
            startActivity(intent);
        });*/
    }
}