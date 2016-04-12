package efood.com.mvc.Model;

import efood.com.mvc.Listener.MainListener;

/**
 * Created by loc on 13/04/2016.
 */
public class Count {


    // thuc hien goi thang onclick
    private MainListener mainListener;

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Count(int num) {
        this.num = num;
    }
    //    // thuc  hien release bên ddayo

//    public int increase() {
//        // giá trị công công né
//
//        ++num;
//        if (mainListener != null)
//            mainListener.OnCounter(num);
//        return num;
//    }
//
//    // phuowng thuwc nay dung de nhan du lieu truyen vao la siwwk ien ckec
//    public void setOnCounterIncreasedListener(MainListener listener) {
//        mainListener = listener;
//
//    }
}
