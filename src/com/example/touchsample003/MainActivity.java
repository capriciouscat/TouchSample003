package com.example.touchsample003;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	public void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		// �N���X�̃C���X�^���X�𐶐�
		MyView mView = new MyView( this );
		// View�ɐݒ�
		setContentView( mView );
	}
}
