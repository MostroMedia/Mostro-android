package com.mostromedia.mostro;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mostromedia.mostro.Models.User;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private DatabaseReference db;
    private User user;
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener listener;
    public String userId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User();

        user.setName("Camilo");
        user.setImage(R.drawable.ic_launcher_foreground);
        user.setDescription("Amante de la electronica");
        user.setJob("Developer");

        db = FirebaseDatabase.getInstance().getReference();
        auth = FirebaseAuth.getInstance();
        listener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(firebaseAuth != null){
                    userId = getUid();
                }else{
                    Log.w("WARN", "algo esta pasando :(");
                }
            }
        };

        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNewUser();
            }
        });

    }

    public void createNewUser()  {

        Toast.makeText(this,"Adding...", Toast.LENGTH_SHORT).show();

        db.child("users").setValue(user);
        //db.child("users").child(userId).setValue(user);

    }

    public String getUid(){

        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }


}
