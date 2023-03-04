package com.example.newsapp.ui.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.newsapp.R;

public class SearchNewsFragmentDirections {
  private SearchNewsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSearchNewsFragmentToArticleFragment() {
    return new ActionOnlyNavDirections(R.id.action_searchNewsFragment_to_articleFragment);
  }
}
