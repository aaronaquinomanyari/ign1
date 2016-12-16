package pe.gob.ign.ignperu.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pe.gob.ign.ignperu.R;

/**
 * Created by prueba on 10/11/2016.
 */
public class Principal extends AppCompatActivity implements View.OnClickListener{
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        boton =(Button)findViewById(R.id.btnProductos);
        boton.setOnClickListener(this);

    }



    @Override
    public void onClick(View v){
    switch (v.getId()){
        case R.id.btnProductos:
            Toast.makeText(getApplicationContext(),"Ingresando",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,Productos.class);
            startActivity(intent);

        case 1:
            break;
        default:
            break;
    }
}
}
