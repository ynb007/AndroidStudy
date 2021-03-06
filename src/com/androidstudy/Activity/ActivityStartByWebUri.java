package com.androidstudy.Activity;

import com.androidstudy.R;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * @author Ynb007
 * 一个可以在web浏览器中使用myapp://etd. 链接打开的Activity
 */
public class ActivityStartByWebUri extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_by_web_uri);
		Uri uri = getIntent().getData();
		String str = String.format("接收到的URI是：%s", uri);
		TextView tv = (TextView) findViewById(R.id.textView);
		tv.setText(str);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_start_by_web_uri, menu);
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
