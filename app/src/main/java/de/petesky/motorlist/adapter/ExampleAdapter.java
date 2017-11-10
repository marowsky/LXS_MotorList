package de.petesky.motorlist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import de.petesky.motorlist.databinding.ItemWordBinding;
import de.petesky.motorlist.adapter.viewholder.WordViewHolder;
import de.petesky.motorlist.models.WordModel;
import com.github.wrdlbrnft.sortedlistadapter.SortedListAdapter;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;

import java.util.Comparator;

/**
 * Created with Android Studio
 * User: Xaver
 * Date: 24/05/15
 */
public class ExampleAdapter extends SortedListAdapter<WordModel> implements FastScrollRecyclerView.SectionedAdapter{

    @NonNull
    @Override
    public String getSectionName(int position) {
        return String.valueOf(getItem(position).getAkz().substring(5));
    }

    public interface Listener {
        void onExampleModelClicked(WordModel model);
    }

    private final Listener mListener;

    public ExampleAdapter(Context context, Comparator<WordModel> comparator, Listener listener) {
        super(context, WordModel.class, comparator);
        mListener = listener;
    }

    @NonNull
    @Override
    protected ViewHolder<? extends WordModel> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent, int viewType) {
        final ItemWordBinding binding = ItemWordBinding.inflate(inflater, parent, false);
        return new WordViewHolder(binding, mListener);
    }
}
