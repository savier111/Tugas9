package com.example.tugas9backup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tugas9backup.Adapter.RecViewAdapter;
import com.example.tugas9backup.model.Mahasiswa;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecViewAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recycle_view);
        addData();

        recyclerView = findViewById(R.id.rvMhs);
        adapter = new RecViewAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecycleViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"item 1 selected",Toast.LENGTH_SHORT).show();
            case R.id.item2:
                Toast.makeText(this,"item 2 selected",Toast.LENGTH_SHORT).show();
            case R.id.item3:
                Toast.makeText(this,"item 3 selected",Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<Mahasiswa>();
        mahasiswaArrayList.add(new Mahasiswa("Arnold","72140048","089623198283","Laki-Laki","bola","Orang sukses","Shit happens"));
        mahasiswaArrayList.add(new Mahasiswa("Baskoro","721601","191919", "Laki-Laki","Photography","fotographer","Hidup Berawal Dari Mimpi"));
        mahasiswaArrayList.add(new Mahasiswa("Brayen","7214008","12345", "Laki-Laki","Game","Gamer","Game Sampai Mati"));
        mahasiswaArrayList.add(new Mahasiswa("Hendry","72111","090909","Laki-Laki","Lari","Pengusaha","Life Goes On"));
        mahasiswaArrayList.add(new Mahasiswa("Verina","721591","878787", "Perempuan","Olahraga","Pendeta","Hidup Sejalan Dengan Firman Tuhan"));


    }
}
