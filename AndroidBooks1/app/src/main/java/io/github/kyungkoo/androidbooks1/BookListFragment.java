package io.github.kyungkoo.androidbooks1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nb31 on 2015. 8. 11..
 */
public class BookListFragment extends Fragment {

  @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    //return super.onCreateView(inflater, container, savedInstanceState);

    View viewHierarchy = inflater.inflate(R.layout.fragment_book_list, container, false);

    return viewHierarchy;
  }
}
