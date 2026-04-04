package com.example.formulaire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView verification;
    private Button btn_retour, btn_partager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        verification = findViewById(R.id.resume);
        btn_retour = findViewById(R.id.btnretour);
        btn_partager = findViewById(R.id.btnpartager);

        Intent intent2 = getIntent();
        String Nom = intent2.getStringExtra("nom");
        String Email = intent2.getStringExtra("email");
        String Telephone = intent2.getStringExtra("n°telephone");
        String Adresse = intent2.getStringExtra("adresse");
        String Ville = intent2.getStringExtra("ville");

        String recap = "Nom complet : " + safe(Nom) +
                "\nEmail : " + safe(Email) +
                "\nPhone : " + safe(Telephone) +
                "\nAdresse : " + safe(Adresse) +
                "\nVille : " + safe(Ville);
        verification.setText(recap);

        // Configuration de l'action de partage: crée un Intent système pour envoyer du texte à d'autres applications
        btn_partager.setOnClickListener(v -> {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Récapitulatif de contact");
            shareIntent.putExtra(Intent.EXTRA_TEXT, recap);

            // Affiche le sélecteur d'applications Android (Gmail, WhatsApp,...)
            startActivity(Intent.createChooser(shareIntent, "Partager via :"));
        });
        btn_retour.setOnClickListener(v -> finish());


    }
    // gérer l'apparrence des champs vides
    private String safe(String str) {
        return (str == null || str.trim().isEmpty()) ? "—" : str.trim();
    }
}