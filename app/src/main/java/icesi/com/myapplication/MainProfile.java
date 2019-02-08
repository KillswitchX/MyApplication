package icesi.com.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainProfile extends FragmentActivity {

    private Fragment_A fragmentA;

    private Fragment_B fragmentB;

    private Fragment_C fragmentC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);

        fragmentA = new Fragment_A();
        fragmentB = new Fragment_B();
        fragmentC = new Fragment_C();

        BottomNavigationView navigation = findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                switch (menuItem.getItemId()) {
                    case R.id.menubar_home:
                        transaction.replace(R.id.contenido, fragmentA);
                        transaction.commit();
                        break;
                    case R.id.menubar_notification:
                        transaction.replace(R.id.contenido, fragmentB);
                        transaction.commit();
                        break;

                    case R.id.menubar_feed:
                        transaction.replace(R.id.contenido, fragmentC);
                        transaction.commit();
                        break;
                }

                return true;
            }
        });


    }
}
