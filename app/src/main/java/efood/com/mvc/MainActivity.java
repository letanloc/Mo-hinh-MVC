package efood.com.mvc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import efood.com.mvc.Controller.MainController;
import efood.com.mvc.Listener.MainListener;

// thuc hien nhan du  lieu tu listent ner
public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainListener {
    // class thưc thi nhiệm vụ của wiget
    Button center;
    MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    //thuc hien init
    private void init() {
        center = (Button) findViewById(R.id.count);
        // gọn cre
        controller = new MainController();
        // set click buton
        center.setOnClickListener(this);
        controller.setListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.count) controller.CountAddvalue();
    }
// tui làm thừa làm biến xóa
    @Override
    public void InsertSuccess() {
    }

    /// nơi trả về
    @Override
    public void OnCounter(int value) {
        center.setText(value + "");
    }
}
