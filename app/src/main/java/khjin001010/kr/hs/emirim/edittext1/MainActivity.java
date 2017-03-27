package khjin001010.kr.hs.emirim.edittext1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText myedit;
    TextView text_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myedit = (EditText)findViewById(R.id.edit_1);
        Button mybutton = (Button) findViewById(R.id.button);

        text_1 = (TextView) findViewById(R.id.txt_1);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myedit.getText().toString();
                text_1.setText("입력한 성명은 "+name+"입니다.ㅊ");
            }
        });


    }
}
