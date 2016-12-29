package my.raffcomm.golf;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;
import my.raffcomm.golf.R;

public class FourFragment extends Fragment {
	
VideoView videoview;
	
	String VideoURL="http://202.73.9.10:1935/live2/smil:golftv.smil/playlist.m3u8";
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View  v = inflater.inflate(R.layout.fragment_four, container, false);
        VideoView videoView=(VideoView)v.findViewById(R.id.VideoView);

        MediaController mediaController = new MediaController(getActivity());

        
    	Uri video = Uri.parse(VideoURL);

        
        mediaController.setAnchorView(videoView);
            videoView.setVideoURI(video);
            videoView.requestFocus();
            videoView.setMediaController(mediaController);
            videoView.start();
        return  v;
    }
}