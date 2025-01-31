// Generated by view binder compiler. Do not edit!
package com.example.game_store.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.game_store.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonDelete;

  @NonNull
  public final Button buttonUpdate;

  @NonNull
  public final TextView descriptionTitle;

  @NonNull
  public final EditText descriptionTxt;

  @NonNull
  public final TextView editTextId;

  @NonNull
  public final ImageView pic;

  @NonNull
  public final TextView publisherTitle;

  @NonNull
  public final EditText publisherTxt;

  @NonNull
  public final TextView rateTitle;

  @NonNull
  public final EditText ratingTxt;

  @NonNull
  public final TextView sizeTitle;

  @NonNull
  public final EditText sizeTxt;

  @NonNull
  public final EditText sizeUnitTxt;

  @NonNull
  public final EditText titleTxt;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  private ActivityDetailBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonDelete,
      @NonNull Button buttonUpdate, @NonNull TextView descriptionTitle,
      @NonNull EditText descriptionTxt, @NonNull TextView editTextId, @NonNull ImageView pic,
      @NonNull TextView publisherTitle, @NonNull EditText publisherTxt, @NonNull TextView rateTitle,
      @NonNull EditText ratingTxt, @NonNull TextView sizeTitle, @NonNull EditText sizeTxt,
      @NonNull EditText sizeUnitTxt, @NonNull EditText titleTxt, @NonNull View view,
      @NonNull View view2, @NonNull View view3) {
    this.rootView = rootView;
    this.buttonDelete = buttonDelete;
    this.buttonUpdate = buttonUpdate;
    this.descriptionTitle = descriptionTitle;
    this.descriptionTxt = descriptionTxt;
    this.editTextId = editTextId;
    this.pic = pic;
    this.publisherTitle = publisherTitle;
    this.publisherTxt = publisherTxt;
    this.rateTitle = rateTitle;
    this.ratingTxt = ratingTxt;
    this.sizeTitle = sizeTitle;
    this.sizeTxt = sizeTxt;
    this.sizeUnitTxt = sizeUnitTxt;
    this.titleTxt = titleTxt;
    this.view = view;
    this.view2 = view2;
    this.view3 = view3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDelete;
      Button buttonDelete = ViewBindings.findChildViewById(rootView, id);
      if (buttonDelete == null) {
        break missingId;
      }

      id = R.id.buttonUpdate;
      Button buttonUpdate = ViewBindings.findChildViewById(rootView, id);
      if (buttonUpdate == null) {
        break missingId;
      }

      id = R.id.descriptionTitle;
      TextView descriptionTitle = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTitle == null) {
        break missingId;
      }

      id = R.id.descriptionTxt;
      EditText descriptionTxt = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTxt == null) {
        break missingId;
      }

      id = R.id.editTextId;
      TextView editTextId = ViewBindings.findChildViewById(rootView, id);
      if (editTextId == null) {
        break missingId;
      }

      id = R.id.pic;
      ImageView pic = ViewBindings.findChildViewById(rootView, id);
      if (pic == null) {
        break missingId;
      }

      id = R.id.publisherTitle;
      TextView publisherTitle = ViewBindings.findChildViewById(rootView, id);
      if (publisherTitle == null) {
        break missingId;
      }

      id = R.id.publisherTxt;
      EditText publisherTxt = ViewBindings.findChildViewById(rootView, id);
      if (publisherTxt == null) {
        break missingId;
      }

      id = R.id.rateTitle;
      TextView rateTitle = ViewBindings.findChildViewById(rootView, id);
      if (rateTitle == null) {
        break missingId;
      }

      id = R.id.ratingTxt;
      EditText ratingTxt = ViewBindings.findChildViewById(rootView, id);
      if (ratingTxt == null) {
        break missingId;
      }

      id = R.id.sizeTitle;
      TextView sizeTitle = ViewBindings.findChildViewById(rootView, id);
      if (sizeTitle == null) {
        break missingId;
      }

      id = R.id.sizeTxt;
      EditText sizeTxt = ViewBindings.findChildViewById(rootView, id);
      if (sizeTxt == null) {
        break missingId;
      }

      id = R.id.sizeUnitTxt;
      EditText sizeUnitTxt = ViewBindings.findChildViewById(rootView, id);
      if (sizeUnitTxt == null) {
        break missingId;
      }

      id = R.id.titleTxt;
      EditText titleTxt = ViewBindings.findChildViewById(rootView, id);
      if (titleTxt == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      return new ActivityDetailBinding((ConstraintLayout) rootView, buttonDelete, buttonUpdate,
          descriptionTitle, descriptionTxt, editTextId, pic, publisherTitle, publisherTxt,
          rateTitle, ratingTxt, sizeTitle, sizeTxt, sizeUnitTxt, titleTxt, view, view2, view3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
