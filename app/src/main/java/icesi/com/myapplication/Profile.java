package icesi.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        //Intent con el que fue llamado
        Intent datos = getIntent();

        String nom = datos.getExtras().getString("nombre");

        String pass = datos.getExtras().getString("contra");

        Toast.makeText(this, nom + " , " + pass, Toast.LENGTH_LONG).show();
    }
}
