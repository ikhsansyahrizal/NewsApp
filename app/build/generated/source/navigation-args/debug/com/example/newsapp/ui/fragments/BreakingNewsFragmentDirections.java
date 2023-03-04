package com.example.newsapp.ui.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.newsapp.R;

public class BreakingNewsFragmentDirections {
  private BreakingNewsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionBreakingNewsFragmentToArticleFragment() {
    return new ActionOnlyNavDirections(R.id.action_breakingNewsFragment_to_articleFragment);
  }
}
