package com.example.appmedia;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BluetoothAdapter bluetoothAdapter;
    Button btnOn, btnOff, btnDiscovery;
    TextView txtBTname;
    ListView listView;
    ArrayList arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOn = findViewById(R.id.button_On);
        btnOff = findViewById(R.id.button_Off);
        btnDiscovery = findViewById(R.id.buttonDiscovery);
        txtBTname = findViewById(R.id.nameBTphone);
        listView = findViewById(R.id.list_item);
        arrayList = new ArrayList();

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        btnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bluetoothAdapter.isEnabled() == false){
                    Toast.makeText(MainActivity.this, "Đang bật Bluetooth...", Toast.LENGTH_SHORT).show();
                    Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(turnOn,0);
                    txtBTname.setText(""+ bluetoothAdapter.getName());
                }
                else {
                    Toast.makeText(MainActivity.this, "Bluetooth đang bật", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bluetoothAdapter.isEnabled() == true){
                    Toast.makeText(MainActivity.this, "Đang tắt Bluetooth...", Toast.LENGTH_SHORT).show();
                    bluetoothAdapter.disable();
                }
                else {
                    Toast.makeText(MainActivity.this, "Bluetooth đã tắt", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean discoveryDevice(View v){
//        Intent discovery = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
//        startActivityForResult(discovery,1);
        boolean b = bluetoothAdapter.startDiscovery();
        return b;
    }

    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(BluetoothDevice.ACTION_FOUND.equals(action)){
                BluetoothDevice bluetoothDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                arrayList.add(bluetoothDevice.getName());
                arrayAdapter.notifyDataSetChanged();
            }
        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        registerReceiver(broadcastReceiver,intentFilter);
    }
}