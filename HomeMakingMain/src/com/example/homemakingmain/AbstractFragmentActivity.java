package com.example.homemakingmain;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * @author Bill
 *
 */
public abstract class AbstractFragmentActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();
		MyFragment fragment = buildFragment(bundle);
		transaction.add(fragment, fragment.getTag());
		
		transaction.commit();
	}
	
	@Override
	public void onAttachFragment(Fragment fragment) {
		super.onAttachFragment(fragment);
	}
	
	protected abstract MyFragment buildFragment(Bundle bundle);
}
