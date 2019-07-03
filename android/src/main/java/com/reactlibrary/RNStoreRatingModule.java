
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.net.Uri;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

public class RNStoreRatingModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private final String IS_AVAILABLE = "isAvailable";

  public RNStoreRatingModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(IS_AVAILABLE, true);
    return constants;
  }

  @Override
  public String getName() {
    return "RNStoreRating";
  }

  @ReactMethod
  public void requestReview() {
    String appPackage = this.reactContext.getPackageName();
    try {
      this.lauchMarketApp();
    } catch (Exception ex) {
      this.openWebPage();
    }
  }

  private void lauchMarketApp() throws Exception {
    String appPackage = this.reactContext.getPackageName();
    Uri uri = Uri.parse("market://details?id=" + appPackage);
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    this.reactContext.startActivity(intent);
  }

  private void openWebPage() {
    String appPackage = this.reactContext.getPackageName();
    Intent intent = new Intent(Intent.ACTION_VIEW,
        Uri.parse("https://play.google.com/store/apps/details?id=" + appPackage));
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    this.reactContext.startActivity(intent);
  }
}