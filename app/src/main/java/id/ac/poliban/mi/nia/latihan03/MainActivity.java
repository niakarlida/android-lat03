package id.ac.poliban.mi.nia.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        //mengenalkan view component ke object
        //atau variable yang kita buat
        Button btArsenal = findViewById(R.id.btArsena);
        Button btPorto = findViewById(R.id.btPorto);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btColoColo = findViewById(R.id.btColoColo);
        Button btBocaJunior = findViewById(R.id.btBocaJunior);
        Button btFlorentina = findViewById(R.id.btFlorentina);

        //event listener and event handler menggunakan lambda expression
        btArsenal.setOnClickListener(v -> Toast.makeText(this, "Arsenal : 1878", Toast.LENGTH_SHORT).show());
        btPorto.setOnClickListener(v -> Toast.makeText(this, "Porto : 1893", Toast.LENGTH_SHORT).show());
        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "Barcelona : 1899", Toast.LENGTH_SHORT).show());
        btColoColo.setOnClickListener(v -> Toast.makeText(this, "ColoColo : 1925", Toast.LENGTH_SHORT).show());
        btBocaJunior.setOnClickListener(v -> Toast.makeText(this, "BocaJunior : 1925", Toast.LENGTH_SHORT).show());
        btFlorentina.setOnClickListener(v -> {
            Toast.makeText(this, "Florentina : 1926", Toast.LENGTH_SHORT).show();
            finish(); //aplikasi dihancurkan
        });
    }
}
