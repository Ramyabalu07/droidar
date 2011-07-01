package actions.algos;

import android.util.Log;

public abstract class Algo {

	public float[] execute(float[] values) {
		Log.e("algo class error", "execute(one param) not catched");
		return null;
	}

	public boolean execute(float[] target, float[] values, float bufferSize) {
		Log.e("algo class error", "execute(3 params) not catched");
		return false;
	}

}