package pe.gob.ign.ignperu.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.allowedcompany.ign.Adaptador.ProductoAdapter;
import com.allowedcompany.ign.Entidades.Producto;
import com.allowedcompany.ign.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prueba on 11/11/2016.
 */
public class Productos extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    private Button btncompa;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
       // btncompa = (Button) findViewById(R.id.btncompartir);

        //iniciar animes
        List<Producto> items =new ArrayList<>();
        items.add(new Producto(R.drawable.pro001,"Impresiones","Carta Nacional a diferentes escalas, en formato papel, plastificado."));
        items.add(new Producto(R.drawable.pro002,"Información Digital","Información digital en formatos GDB y DWG a diferentes escalas."));
        items.add(new Producto(R.drawable.pro003,"Geodesia","Trabajo de campo con equipo geodésico, postproceso."));
        items.add(new Producto(R.drawable.pro004,"Fotogrametría","resumen del producto a diferentes escalas, en formato papel, plastificado."));
        items.add(new Producto(R.drawable.pro005,"Fotografía Aérea","resumen del producto a diferentes escalas, en formato papel, plastificado."));
        items.add(new Producto(R.drawable.pro006,"Escaneo","Escaneo de imagenes analogas."));
        items.add(new Producto(R.drawable.pro007,"SIG","Desarrollo de información tabular para proyectos GIS"));
        items.add(new Producto(R.drawable.pro008,"Capacitación","Cursos referentes a Geografia, Geodesia, GIS"));


        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        //crear un nuevo adaptador
        adapter = new ProductoAdapter(items);
       recycler.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncompartir:
                Toast.makeText(getApplicationContext(),"hola niña linda",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,Productos.class);
                startActivity(intent);

            case 1:
                break;
            default:
                break;
        }
    }
}
