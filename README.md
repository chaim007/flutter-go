# hello_go

A new Flutter application to use aar lib(android) and framework(ios) create by gomobile. (android and IOS both support!!!)

## Getting Started

For help getting started with Flutter, view our online documentation.

## How to run on IOS

Open the IOS folder with xcode , and Run!!!

## How to run on Android

1.Make sure your Flutter is installed ok , check it with Flutter doctor like this.

    $flutter doctor
    Doctor summary (to see all details, run flutter doctor -v):
         [✓] Flutter (Channel master, v0.3.1-pre.7, on Mac OS X 10.13.4 17E199, locale zh-Hans-US)
         [✓] Android toolchain - develop for Android devices (Android SDK 27.0.3)
         [✓] iOS toolchain - develop for iOS devices (Xcode 9.3)
         [✓] Android Studio (version 3.1)
         [✓] VS Code (version 1.22.2)
         [✓] Connected devices (2 available)
         • No issues found!
         chaimdeiMac-2:hello_go chaim$ 

2a. Run with Android Studio or other IDE

2b. Run with Flutter commands when you need run on a device:

    // cd to the root of project and run in termial    
    // how to choose --target-platform  # [android-arm (default), android-arm64] #
    // when you run in a arm64 device , you need choose --target-platform=android-arm64    
      $ flutter build apk --target-platform=android-arm64
      Initializing gradle...                                       0.9s
      Resolving dependencies...                                    0.8s
      Running 'gradlew assembleRelease'...                        24.7s

    //connect you phone on USB
      $ flutter install  
          Initializing gradle...                                       1.1s
          Resolving dependencies...                                    1.1s
          Installing app.apk to OD103...
          Uninstalling old version...
          Installing build/app/outputs/apk/app.apk...                  4.7s

## Known Bugs or Issues

this project will crash on x86 simulator of API 25/26 (Anroid 7.x) , i do not find a solution yet: the similar bug is discussed to this [#15925](https://github.com/flutter/flutter/issues/15925)
     
     I/flutter: Observatory listening on http://127.0.0.1:40638/
     D/: HostConnection::get() New Host Connection established 0xa829de00, tid 18383
     D/EGL_emulation: eglMakeCurrent: 0x9aad7c20: ver 2 0 (tinfo 0x8987f460)
     I/Choreographer: Skipped 80 frames!  The application may be doing too much work on its main thread.
     D/EGL_emulation: eglMakeCurrent: 0xa8285240: ver 2 0 (tinfo 0xa8283710)
     A/libc: Fatal signal 6 (SIGABRT), code -6 in tid 18401 (ngzu365.hellogo)
     Application terminated.

If you want run on a device , you must build release apk use Flutter commands.   or you may get the following crash (when run or debug use IDE): 

      E/AndroidRuntime: FATAL EXCEPTION: main
         Process: com.mashangzu365.hellogo, PID: 8836
         java.lang.UnsatisfiedLinkError: dalvik.system.PathClassLoader[DexPathList[[zip file "/data/app/com.mashangzu365.hellogo-2/base.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_dependencies_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_0_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_1_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_2_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_3_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_4_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_5_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_6_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_7_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_8_apk.apk", zip file "/data/app/com.mashangzu365.hellogo-2/split_lib_slice_9_apk.apk"],nativeLibraryDirectories=[/data/app/com.mashangzu365.hellogo-2/lib/arm64, /data/app/com.mashangzu365.hellogo-2/base.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_dependencies_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_0_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_1_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_2_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_3_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_4_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_5_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_6_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_7_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_8_apk.apk!/lib/arm64-v8a, /data/app/com.mashangzu365.hellogo-2/split_lib_slice_9_apk.apk!/lib/arm64-v8a, /system/lib64, /vendor/lib64]]] couldn't find "libflutter.so"
                     at java.lang.Runtime.loadLibrary0(Runtime.java:984)
                     at java.lang.System.loadLibrary(System.java:1554)              

Refrences:
 [#Flutter doc: installing-a-release-apk-on-a-device](https://flutter.io/android-release/#installing-a-release-apk-on-a-device)
 [#the reason why crash here](https://github.com/flutter/flutter/issues/14231)

## How to prepare gomobile enviroment for Flutter

 ### For android:  

Install NDK in Android Studio and config env (must):

[#Installing+the+Android+NDK](https://wiki.appcelerator.org/display/guides2/Installing+the+Android+NDK)
[#NDK设置中文教程](https://blog.csdn.net/carson_ho/article/details/73250111)

      export PATH="$ANDROID_HOME/ndk-bundle:$PATH"
      export ANDROID_HOME="/Users/chaim/Library/Android/sdk/"
      export PATH="$ANDROID_HOME/platform-tools:$PATH"
      
Install go first and get gomobile package

    $ go get golang.org/x/mobile/cmd/gomobile
    $ gomobile init

get the hello example and bind it to your project.

    $ go get golang.org/x/mobile/example/bind/hello  
    $ gomobile bind -target=android golang.org/x/mobile/example/bind/hello
    $ cp hello.aar ~/!!path-to!!/hello_go/android/hello/

Use aar module for your Flutter projecet.

   a. File -> New -> New Module ... -> Import .JAR/.AAR Package find hello.aar and load it

   b. In file !!path-to!!/app/build.gradle add line:

       dependencies {
         implementation project(':hello')
       }

   c. Go Run!!! :)
     
### For IOS :
   
  please Ref  https://github.com/golang/go/wiki/Mobile#building-and-deploying-to-ios 

    
  
   
   
   
