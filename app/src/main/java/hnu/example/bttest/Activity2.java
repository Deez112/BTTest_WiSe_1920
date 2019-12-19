package hnu.example.bttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements IBTMsgClient {
    private TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        mTextView1 = (TextView) findViewById(R.id.textView2);

        BTManager.addBTMsgClient(this);
    }


    @Override
    public void receiveMessage(final String msg) {
        mTextView1.setText(msg);
    }

    @Override
    public void receiveConnectStatus(boolean isConnected) {
    }

    @Override
    public void handleException(Exception e) {
    }
}
