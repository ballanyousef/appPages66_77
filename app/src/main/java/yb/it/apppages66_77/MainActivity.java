package yb.it.apppages66_77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int x=1;
    TextView tv1;
    TextView tv2;
    int x2;
    Button btn2;
    Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x2=9;
        tv1=findViewById(R.id.txtResult1);
        tv2=findViewById(R.id.txtResult2);

        doit(new Point(8,9));
        Point p1=new Point(7,9);
        doit(p1);

        btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.append("hello");
                Log.i("TAG1", "seeyou");


            }
        });



        btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(btn3Listener);



    }


    private View.OnClickListener btn3Listener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tv2.append("SABAT SHALOM!");
            Log.i("TAG1", "seeyou");

        }
    };

    public void btn1Click(View view) {

        Button btn=(Button) view;
        //use st to get value
        String st=btn.getText().toString();
        //display result on textview

        tv1.append("\n");
        tv1.append(st+"\n");
    }


    public void doit(Point p){

        Log.i("POINT1", p.x+"");

    }


}