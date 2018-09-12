# 引入
## Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
## Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sinothk:SideBar:1.0.0912'
	}


# 使用
## JAVA

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

	SwitchButton switchButton = (SwitchButton) findViewById(R.id.switch_button);
	//        switchButton.setChecked(true);
	//        switchButton.isChecked();
	//        switchButton.toggle();     //switch state
	//        switchButton.toggle(false);//switch without animation
	//        switchButton.setShadowEffect(true);//disable shadow effect
	//        switchButton.setEnabled(false);//disable button
	//        switchButton.setEnableEffect(false);//disable the switch animation
	switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
	    @Override
	    public void onCheckedChanged(SwitchButton view, boolean isChecked) {
		Toast.makeText(MainActivity.this, "" + isChecked, Toast.LENGTH_SHORT).show();
	    }
	});
    }

## XML

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="SwitchButton" />

    <com.sinothk.widget.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_checked="true"
        app:sb_show_indicator="false" />

    <com.sinothk.widget.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp" />

    <com.sinothk.widget.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_checked="true"
        app:sb_checked_color="#fdc951" />

    <com.sinothk.widget.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_background="#FFF"
        app:sb_button_color="#db99c7"
        app:sb_checked_color="#A36F95"
        app:sb_checkline_color="#a5dc88"
        app:sb_shadow_color="#A36F95"
        app:sb_uncheckcircle_color="#A36F95" />

    <com.sinothk.widget.switchButton.SwitchButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sb_enable_effect="false" />

    <View
        android:layout_width="match_parent"
        android:layout_height="2dp"
        android:layout_marginTop="10dp"
        android:background="@color/colorAccent" />


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="42dp"
        android:layout_marginTop="10dp"
        android:background="@color/colorAccent"
        android:gravity="center">

        <com.sinothk.widget.switchButton.SwitchButton
            android:id="@+id/switch_button"
            android:layout_width="42dp"
            android:layout_height="28dp"
            app:sb_checked="false"
            app:sb_checked_color="#fdc951"
            app:sb_show_indicator="false" />
    </LinearLayout>
    </LinearLayout>
