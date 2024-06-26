package com.mock.location.app;

import android.util.Log;
import android.location.Location;
import android.location.LocationManager;

public class DetectMocky {
  private String providerName;
  private Context context;

  public MockLocationProvider(String name, Context context) {
      this.providerName = name;
      this.context = context;
      LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
      lm.addTestProvider(providerName, false, false, false, false, true, true, true, 1, 1);
      lm.setTestProviderEnabled(providerName, true);
  }

  public void pushLocation(double lat, double lon) {
      LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
      Location mockLocation = new Location(providerName);
      mockLocation.setLatitude(lat);
      mockLocation.setLongitude(lon);
      mockLocation.setAltitude(0);
      mockLocation.setTime(System.currentTimeMillis());
      mockLocation.setAccuracy(1);
      lm.setTestProviderLocation(providerName, mockLocation);
  }
}
