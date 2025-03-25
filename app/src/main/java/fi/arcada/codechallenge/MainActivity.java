package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Double> values = new ArrayList<Double>();
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.myTextView);

        for (int i = 0; i < 13; i++) {
            double randomValue = Math.random();
            values.add(randomValue);
        }
    }
    public void buttonClickHandler(View view) {
        calculate();
    }
    private void calculate(){
        Statistic meanCalc = new Statistic();
        double mean = meanCalc.calcMean(values);
        myTextView.setText("Mean: " + mean);
    }
}