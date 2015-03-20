package com.call.mkcall;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MkcallActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkcall);
        //定位BUTTON
        Button btn = (Button)this.findViewById(R.id.bt_dail);
        //调用点击事件
        btn.setOnClickListener(new MyListener());
    }
    
    private class MyListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			EditText et = (EditText) MkcallActivity.this.findViewById(R.id.et_number);
			//获取edit的字符串
			String number = et.getText().toString();
			//
			Intent intent = new Intent();
			
			intent.setAction(Intent.ACTION_CALL);
			intent.setData(Uri.parse("tel:" + number));
			
			startActivity(intent);
			
		}
    	
    	
    }

    
}
