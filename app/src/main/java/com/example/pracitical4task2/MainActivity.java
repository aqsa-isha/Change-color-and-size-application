package com.example.pracitical4task2;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.graphics.Color;
public class MainActivity extends AppCompatActivity {
    Button color, size;
    TextView output;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Changing color and size (02, 14, 43)");
        color = findViewById(R.id.chg_color);
        size = findViewById(R.id.chg_size);
        output = findViewById(R.id.textView);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (i) {
                    case 1:
                        output.setTextColor(Color.YELLOW);
                        break;
                    case 2:
                        output.setTextColor(Color.RED);
                        break;
                    case 3:
                        output.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        output.setTextColor(Color.GREEN);
                        break;
                    default:
                        output.setTextColor(Color.BLACK);
                        i = 0;
                        break;
                }
                i++;
            }
        });
    }
    public void chg_font_size(View v) {
        switch (i) {
            case 1:
                output.setTextSize(40);
                break;
            case 2:
                output.setTextSize(50);
                break;
            case 3:
                output.setTextSize(60);
                break;
            case 4:
                output.setTextSize(70);
                break;
            default:
                output.setTextSize(30);
                i = 0;
                break;
        }
        i++;
    }
}

