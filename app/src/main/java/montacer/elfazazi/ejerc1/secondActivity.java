package montacer.elfazazi.ejerc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String respuesta = null;
        int resp;
        if (bundle.containsKey("LET")){
            respuesta = bundle.getString("LET");
            resp = respuesta.length();
            Toast.makeText(this, "letras: "+resp, Toast.LENGTH_SHORT).show();
        }

        if (bundle.containsKey("PAL")){
            respuesta = bundle.getString("PAL");
            resp = respuesta.split(" ").length;
            Toast.makeText(this, "Palabras: "+resp, Toast.LENGTH_SHORT).show();
        }
    }
}