package com.mashangzu365.hellogo;

import android.os.Bundle;
import android.util.Log;

import hello.Hello;
import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {

  private static final String CHANNEL = "com.xiaoshike.io/hello";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);

    //warp golang lib to java api  by chaim 2018.5.2 AM 6:31
    new MethodChannel(getFlutterView(), CHANNEL).setMethodCallHandler(
            new MethodChannel.MethodCallHandler() {
              @Override
              public void onMethodCall(MethodCall call, MethodChannel.Result result) {

                switch (call.method) {
                  case "helloGo":
                    // String apiHost = call.argument("apiHost");
                    try {
                      String res = Hello.greetings("hi gomobile 2018!!");
                      result.success(res);
                    } catch (Exception e) {
                      e.printStackTrace();
                      result.error("ERROR", "Node create failed.", null);
                    }
                }
              }
            }
    );
  }
}
