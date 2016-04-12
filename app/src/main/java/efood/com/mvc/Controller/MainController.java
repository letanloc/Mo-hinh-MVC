package efood.com.mvc.Controller;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

import efood.com.mvc.Listener.MainListener;
import efood.com.mvc.Model.Count;

/**
 * Created by loc on 12/04/2016.
 */

// nơi đây thực hiên sũ lí dữ liệu

public class MainController {
    MainListener mainListener;
    private Count count;
/*
*hai hàm dụng hien tai khong cần thiết
*
* */
    /// thuc hien khởi tạo thì cho nó bằng không
    public MainController() {
        this(new Count(0));
        /*  // cunstruster bên dứoi
        *   MainController(new Count(0));
        * */
    }

    @VisibleForTesting
    public MainController(@NonNull Count count) {
        this.count = count;
    }

    int num = 0;

    // on count success
    public int CountAddvalue() {
        ++num;
        count.setNum(num);
        if (mainListener != null)
            mainListener.OnCounter(num);
        return num;
    }

    public void setListener(MainListener mainListener) {
        this.mainListener = mainListener;
    }
//
}
