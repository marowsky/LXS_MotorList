package de.petesky.motorlist.adapter.viewholder;

import android.support.annotation.NonNull;

import de.petesky.motorlist.databinding.ItemWordBinding;
import de.petesky.motorlist.adapter.ExampleAdapter;
import de.petesky.motorlist.models.WordModel;
import com.github.wrdlbrnft.sortedlistadapter.SortedListAdapter;

public class WordViewHolder extends SortedListAdapter.ViewHolder<WordModel> {

    private final ItemWordBinding mBinding;

    public WordViewHolder(ItemWordBinding binding, ExampleAdapter.Listener listener) {
        super(binding.getRoot());
        binding.setListener(listener);

        mBinding = binding;
    }

    @Override
    protected void performBind(@NonNull WordModel item) {
        mBinding.setModel(item);
    }
}
