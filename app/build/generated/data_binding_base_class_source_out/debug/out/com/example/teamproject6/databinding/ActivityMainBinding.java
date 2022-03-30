// Generated by view binder compiler. Do not edit!
package com.example.teamproject6.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.teamproject6.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button exitApp;

  @NonNull
  public final Button startCamera;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button exitApp,
      @NonNull Button startCamera) {
    this.rootView = rootView;
    this.exitApp = exitApp;
    this.startCamera = startCamera;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.exitApp;
      Button exitApp = ViewBindings.findChildViewById(rootView, id);
      if (exitApp == null) {
        break missingId;
      }

      id = R.id.startCamera;
      Button startCamera = ViewBindings.findChildViewById(rootView, id);
      if (startCamera == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, exitApp, startCamera);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}