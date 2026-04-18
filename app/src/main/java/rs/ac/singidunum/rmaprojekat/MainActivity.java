package rs.ac.singidunum.rmaprojekat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView inputEmail;

    private TextView inputLozinka;

    private Button buttonUlogujMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputEmail = (TextView) findViewById(R.id.inputEmail);

        inputLozinka = (TextView) findViewById(R.id.inputLozinka);

        buttonUlogujMe = (Button) findViewById(R.id.buttonUlogujMe);


        buttonUlogujMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = inputEmail.getText().toString();

                String lozinka = inputLozinka.getText().toString();


                if (email.equals("1") && lozinka.equals("1")) {
                    Intent i = new Intent(getApplicationContext(), MainStudentScreen.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Uneti podaci nisu dobri",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}