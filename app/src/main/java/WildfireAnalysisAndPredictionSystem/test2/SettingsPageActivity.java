package WildfireAnalysisAndPredictionSystem.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingsPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        Button log_out_director = findViewById(R.id.button_log_out);
        log_out_director.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        TextView go_to_guide = findViewById(R.id.guide_director);
        go_to_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsPageActivity.this, GuidePageActivity.class);
                startActivity(intent);
            }
        });

        Button delete_account = findViewById(R.id.button_delete_account);
        delete_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO ask for user's password, delete account, go to sign in page
            }
        });

        TextView change_username = findViewById(R.id.settings_username);
        change_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO use pop-up, change username from database
                //TODO users are added as friends by their id's, not their usernames in the database. Therefore when a user changes their username, friendship is not affected.
            }
        });

        TextView change_email = findViewById(R.id.settings_email);
        change_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO use pop-up, change email from database
            }
        });

        TextView change_password = findViewById(R.id.settings_password);
        change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO use pop-up, change password from database
            }
        });



    }
}