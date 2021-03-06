package sp.edu.np.mad.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    String Tag = "Main Activity";
    User user = new User("MAD","Description for MAD blah blah",1, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = findViewById(R.id.textView);
        TextView desc = findViewById(R.id.textView2);
        name.setText(user.getName());
        desc.setText(user.getDescription());
        Button follow = findViewById(R.id.button);
        Button message = findViewById(R.id.button2);
        message.setText("Message");
        follow.setText("follow");
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.isFollowed() == false){
                    follow.setText("Unfollow");
                    user.setFollowed(true);
                }
                else{
                    follow.setText("Follow");
                    user.setFollowed(false);
                }
            }
        });
    }
}