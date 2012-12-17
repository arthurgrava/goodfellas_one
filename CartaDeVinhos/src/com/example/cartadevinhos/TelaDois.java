package com.example.cartadevinhos;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaDois extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/* Hiding the Status Bar */
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		/* -------- END -------- */
		
		setContentView(R.layout.tela_dois);
		
		Typeface typewriter = Typeface.createFromAsset(getAssets(), "fonts/TravelingTypewriter.otf");
		TextView txt1 = (TextView) findViewById(R.id.teladois_textoum);
		txt1.setTypeface(typewriter);
		txt1.setTextColor(Color.parseColor("#5a0101"));
		txt1.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24);
		txt1.setWidth(370);
		
		TextView txt_vinho = (TextView) findViewById(R.id.tela2_vinho);
		TextView txt_uva = (TextView) findViewById(R.id.tela2_uva);
		
		txt_vinho.setTypeface(typewriter);
		txt_vinho.setTextColor(Color.parseColor("#5a0101"));
		txt_vinho.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24);
		
		txt_uva.setTypeface(typewriter);
		txt_uva.setTextColor(Color.parseColor("#5a0101"));
		txt_uva.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24);
		
	}

}
