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
        return v;
    }
}
