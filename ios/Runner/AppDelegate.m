#include "AppDelegate.h"
#include "GeneratedPluginRegistrant.h"

#import <Flutter/Flutter.h>

@import Hello;

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
  [GeneratedPluginRegistrant registerWithRegistry:self];
  // Override point for customization after application launch.
    
    FlutterViewController* controler = (FlutterViewController*) self.window.rootViewController;
    FlutterMethodChannel* goChannel = [
    FlutterMethodChannel methodChannelWithName:@"com.xiaoshike.io/hello" binaryMessenger:controler
                                        ];
    [
     goChannel setMethodCallHandler:^(FlutterMethodCall * _Nonnull call, FlutterResult  _Nonnull result) {
         //TODO
         result(HelloGreetings(@"IOS,Go 2018!"));
     }
    ];
    
    
  return [super application:application didFinishLaunchingWithOptions:launchOptions];
}

@end
