package pe.gob.ign.ignperu.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.allowedcompany.ign.Adaptador.CustomAdapter;
import com.allowedcompany.ign.R;

public class Resumen extends AppCompatActivity {
    CustomAdapter adapter;
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        viewpager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new CustomAdapter(this);
        viewpager.setAdapter(adapter);
        controlador();

    }
    public void controlador(){
        Button ingreso =(Button) findViewById(R.id.btnallaccess);
        ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuprincipal = new Intent(getApplicationContext(),Principal.class);
                startActivity(menuprincipal);
            }
        });
    }
}
