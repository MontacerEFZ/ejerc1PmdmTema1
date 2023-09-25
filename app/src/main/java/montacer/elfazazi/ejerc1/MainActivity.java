package montacer.elfazazi.ejerc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnLetras;
    private Button btnPalabras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarVista();

        btnLetras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();

                Intent intent = new Intent(MainActivity.this, secondActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("LET", frase);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        }
        );

        btnPalabras.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String frase = txtFrase.getText().toString();

                 Intent intent = new Intent(MainActivity.this, secondActivity.class);

                 Bundle bundle = new Bundle();
                 bundle.putString("PAL", frase);
                 intent.putExtras(bundle);

                 startActivity(intent);
             }
         }
        );
    }

    private void iniciarVista() {
        txtFrase = findViewById(R.id.txtEscribreFraseMain);
        btnLetras = findViewById(R.id.btnContarLetrasMain);
        btnPalabras = findViewById(R.id.btnContarPalabrasMain);
    }
}