package icesi.com.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_A extends Fragment {

    public Fragment_A() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

     // Inflate permite pasar de xml a objeto
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        Button btn_a_fragment_a = v.findViewById(R.id.btn_a_fragment_a);

        btn_a_fragment_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Paso 4 mandar info al otro lado

                listener.onMessage("Hola desde el fragmento A");

            }
        });


        return v;
    }


    // Paso1 interface

    public interface fragemntAActions{
        void onMessage(String msj);
    }

    // Paso2 Crear listener
    fragemntAActions listener;

    // Paso3 Crear metodo para el listener
    public void setListener(fragemntAActions listener){
        this.listener = listener;
    }
}
