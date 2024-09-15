package com.example.liroytest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.liroytest.CustomerCast.CustomerPresenter;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail;
    private EditText etPassword;
    private EditText etName;
    private Button etButton;
    private CustomerPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etName=findViewById(R.id.edName);
        etEmail=findViewById(R.id.edEmail);
        etPassword=findViewById(R.id.edPass);
        etButton=findViewById(R.id.button);
        presenter = new CustomerPresenter(this);

    }
}