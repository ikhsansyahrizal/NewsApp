package com.example.newsapp.ui.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.newsapp.R;

public class SaveNewsFragmentDirections {
  private SaveNewsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSaveNewsFragmentToArticleFragment() {
    return new ActionOnlyNavDirections(R.id.action_saveNewsFragment_to_articleFragment);
  }
}
