package clase_10.elena.com.clase_10;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import clase_10.elena.com.clase_10.AdaptadorCategoria.AdaptadorCategoria;
import clase_10.elena.com.clase_10.AdaptadorCategoria.Categoria;


public class MainActivity extends ActionBarActivity {


    ListView listado;
    ArrayList<Categoria> categoria;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listado= (ListView) findViewById(R.id.listado);

        categoria= new ArrayList<Categoria>();
        categoria.add( new Categoria("Lunes", "Nublado", R.drawable.im1));
        categoria.add( new Categoria("Martes", "Soleado", R.drawable.im2));
        categoria.add( new Categoria("Miercoles", "Lluvioso", R.drawable.im3));
        categoria.add( new Categoria("Jueves", "tormenta", R.drawable.im4));
        categoria.add( new Categoria("Viernes", "caluroso", R.drawable.im5));
        categoria.add( new Categoria("Sabado", "Soleado", R.drawable.im6));
        categoria.add( new Categoria("Domingo", "Nublado", R.drawable.im7));

        AdaptadorCategoria adaptador = new AdaptadorCategoria(categoria, MainActivity.this.getApplicationContext());
        listado.setAdapter(adaptador);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
