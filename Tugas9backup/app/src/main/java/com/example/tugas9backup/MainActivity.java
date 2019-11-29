package com.example.tugas9backup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String [] fotoMhs = {"Arnold","Baskoro","Brayen","Hendry","Verina"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mhs);


        Button btnPress = findViewById(R.id.btnMahasiswa);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameMain1, new com.example.tugas9backup.Mahasiswa1Fragment());
                ft.commit();
            }
        });

//        Button btnPress2 = findViewById(R.id.btnSimpan);
//        btnPress2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.frameMain2, new Mahasiswa2Fragment());
//                ft.commit();
//            }
//        });
    }


    public void ToFragment(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.tugas9backup.Main3FragmentActivity.class);
        startActivity(intent);
    }

    public void ToList(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.tugas9backup.ListActivity.class);
        startActivity(intent);
    }

    public void GotoListMahasiswa(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.tugas9backup.ListMahasiswaActivity.class);
        startActivity(intent);
    }
}

