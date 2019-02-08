package icesi.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    private RelativeLayout root_profile;
    private Button btn_salir_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        root_profile = findViewById(R.id.profile_root);
        btn_salir_profile = findViewById(R.id.btn_salir_profile);

        root_profile.setOnTouchListener(new View.OnTouchListener() {

            float xini=0;
            float yini=0;

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        xini=motionEvent.getX();
                        yini=motionEvent.getY();
                        btn_salir_profile.setText("DOWN: " + motionEvent.getX() + ", " + motionEvent.getY());
                        break;
                    case MotionEvent.ACTION_MOVE:
                        btn_salir_profile.setText("MOVE: " + motionEvent.getX() + ", " + motionEvent.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        float deltax = motionEvent.getX() - xini;
                        if(deltax>300){
                            Intent i = new Intent(Profile.this, MainProfile.class);
                            startActivity(i);
                        }
                        if(deltax<-300){
                            finish();
                        }
                        btn_salir_profile.setText("UP: "+ motionEvent.getX() + ", " + motionEvent.getY());

                }

                return true;
            }
        });


        //Intent con el que fue llamado
        Intent datos = getIntent();

        String nom = datos.getExtras().getString("nombre");

        String pass = datos.getExtras().getString("contra");

        Toast.makeText(this, nom + " , " + pass, Toast.LENGTH_LONG).show();
    }
}
