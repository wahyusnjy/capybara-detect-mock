package com.mock.location.app;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DetectMocky")
public class DetectMockyPlugin extends Plugin {

    private DetectMocky implementation = new DetectMocky();

    @PluginMethod
    public void setMockLocation(PluginCall call) {
      double latitude = call.getDouble("latitude");
      double longitude = call.getDouble("longitude");

      implementation.setMockLocation(latitude, longitude); // Assume this method sets the mock location

      JSObject ret = new JSObject();
      ret.put("success", true);
      call.resolve(ret);
    }
}
