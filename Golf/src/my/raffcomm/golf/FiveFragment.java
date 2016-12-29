package my.raffcomm.golf;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import my.raffcomm.golf.R;

public class FiveFragment extends Fragment {
	
	public FiveFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_five, container, false);
         
        return rootView;
    }
}