package com.example.formulaire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText nom,email,adresse,tel;
    private Spinner ville;
    private Button btn_envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom1);
        email = findViewById(R.id.email1);
        adresse = findViewById(R.id.adr1);
        tel = findViewById(R.id.Telephone1);
        ville = findViewById(R.id.villelist);
        btn_envoyer = findViewById(R.id.btn);

        // Créer la liste des villes
        String[] listevilles = {"Casablanca", "Mohammedia", "Marrakech","Agadir","Tanger","Fès"};

        // Créer l'adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listevilles);

        // Choisir le style de la liste quand on clique dessus
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Appliquer l'adapter au spinner
        ville.setAdapter(adapter);

        btn_envoyer.setOnClickListener(v ->{
            String enom = nom.getText().toString().trim();
            String eemail = email.getText().toString().trim();
            String eadresse = adresse.getText().toString().trim();
            String etel = tel.getText().toString().trim();
            String eville = ville.getSelectedItem().toString();

            if (enom.isEmpty() || eemail.isEmpty()){
                Toast.makeText(this, "Le nom et l'email sont obligatoires pour la soumission de ce formulaire",Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("nom",enom);
            intent.putExtra("email",eemail);
            intent.putExtra("adresse",eadresse);
            intent.putExtra("n°telephone",etel);
            intent.putExtra("ville",eville);

            startActivity(intent);
        });

    }
}