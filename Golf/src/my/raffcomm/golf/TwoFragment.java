package my.raffcomm.golf;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import my.raffcomm.golf.R;

public class TwoFragment extends Fragment {
	
	public TwoFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
         
        return rootView;
    }
}