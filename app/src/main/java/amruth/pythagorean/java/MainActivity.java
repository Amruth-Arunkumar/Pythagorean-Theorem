package amruth.pythagorean.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    EditText etAValue;
    EditText etBValue;
    Button btnCalculate;
    TextView tvCValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAValue = findViewById(R.id.etAValue);
        etBValue = findViewById(R.id.etBValue);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvCValue = findViewById(R.id.tvCValue);

        tvCValue.setVisibility(View.GONE);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etAValue.getText().toString().isEmpty() || etBValue.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all fields!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int A = Integer.parseInt(etAValue.getText().toString().trim());
                    int B = Integer.parseInt(etBValue.getText().toString().trim());

                    double C = Math.sqrt((A*A)+(B*B));

                    double number = Math.round(C * 100) / 100.0;

                    String result = "The approximate value for C is: " + number;

                    tvCValue.setText(result);
                    tvCValue.setVisibility(View.VISIBLE);

                }
            }
        });
    }
}
