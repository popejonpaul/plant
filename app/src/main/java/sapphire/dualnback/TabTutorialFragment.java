package sapphire.dualnback;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class TabTutorialFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_tutorial_fragment, container, false);
        ImageView image = view.findViewById(R.id.imageView);
       /* Glide.with(this)
                .load(R.drawable.tutorial)
                .into(image);*/
        return view;
    }
}
