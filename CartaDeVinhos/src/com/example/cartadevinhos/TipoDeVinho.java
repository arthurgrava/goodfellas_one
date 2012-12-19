package com.example.cartadevinhos;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class TipoDeVinho extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/* Hiding the Status Bar */
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		/* -------- END -------- */
		
		setContentView(R.layout.tipo_de_vinho);
		
		/* - FONTE TYPEWRITER - */
		Typeface typewriter = Typeface.createFromAsset(getAssets(), "fonts/TravelingTypewriter.otf");
		
		TextView txt1 = (TextView) findViewById(R.id.txtTipoVinho);
		txt1.setTypeface(typewriter); //muda a fonte
		txt1.setTextColor(Color.parseColor("#5a0101")); //muda a cor
		txt1.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24); //muda o tamanho
		txt1.setWidth(370); //muda o width
		
		/* - ESPUMANTES - */
		TextView txt2 = (TextView) findViewById(R.id.txtEspumantesFieldOne);
		txt1.setTypeface(typewriter); //muda a fonte
		txt1.setTextColor(Color.parseColor("#5a0101")); //muda a cor
		txt1.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24); //muda o tamanho
		
		/* - BRANCOS - */
		TextView txt3 = (TextView) findViewById(R.id.txtBrancosFieldTwo);
		txt1.setTypeface(typewriter); //muda a fonte
		txt1.setTextColor(Color.parseColor("#5a0101")); //muda a cor
		txt1.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24); //muda o tamanho
		
		/* - TINTOS - */
		TextView txt4 = (TextView) findViewById(R.id.txtTintosFieldThree);
		txt1.setTypeface(typewriter); //muda a fonte
		txt1.setTextColor(Color.parseColor("#5a0101")); //muda a cor
		txt1.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24); //muda o tamanho
		
		/* - TACAS - */
		TextView txt5 = (TextView) findViewById(R.id.txtTacasFieldFour);
		txt1.setTypeface(typewriter); //muda a fonte
		txt1.setTextColor(Color.parseColor("#5a0101")); //muda a cor
		txt1.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24); //muda o tamanho
	}
}
