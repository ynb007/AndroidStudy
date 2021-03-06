package com.androidstudy.Activity;

import com.androidstudy.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * @author Ynb007
 * 另一个被启动的activity
 */
public class AnotherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
		
		TextView tv = (TextView) findViewById(R.id.textview);
		Intent i = getIntent();
		Bundle bundle  = i.getExtras();
		
		//ActivityExtraUser user = (ActivityExtraUser) i.getSerializableExtra("user");
		ActivityExtraUser user = i.getParcelableExtra("user");
		String str = String.format("简单数据：%s\n Bundle数据：{data1:%s,data2:%s} \n自定义对象数据：%s", 
				i.getStringExtra("keyTest"),bundle.getString("data1"),bundle.getInt("data2"),user.getId()+";"+user.getName());
		tv.setText(str);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.another, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
