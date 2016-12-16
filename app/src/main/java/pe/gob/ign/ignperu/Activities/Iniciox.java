package pe.gob.ign.ignperu.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.allowedcompany.ign.R;

/**
 * Created by prueba on 10/11/2016.
 */
public class Iniciox extends AppCompatActivity {

    private final int DURACION_SPLASH = 5000; // 3 segundos
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Tenemos una plantilla llamada splash.xml donde mostraremos la información que queramos (logotipo, etc.)
        setContentView(R.layout.activity_inicio);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(Iniciox.this, Principal.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
