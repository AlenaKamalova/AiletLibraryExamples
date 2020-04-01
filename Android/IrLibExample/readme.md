# Integrate irLib into project

- [Integrate irLib into project](#integrate-irlib-into-project)
  - [Include irLib using Maven](#include-irlib-using-maven)
  - [Manual include irLib](#manual-include-irlib)
  - [Include OpenCV](#include-opencv)
  - [Required dependencies](#required-dependencies)
  - [If project use androidX](#if-project-use-androidx)

## Include irLib using Maven

Update build.gradle (Project) with

```gradle
maven { url "https://maven.intrtl.com/artifactory/irlib" }
```

Update build.gradle (App level) with

```gradle
implementation 'com.intrtl:lib:+'
```

## Manual include irLib

In Android Studio open **File - Project Structure - Dependencies**, press **+** and select **Import .JAR/.AAR Package**, import *ir-lib.aar*. Then in **Declared Dependencies** press **+** and select **3. Module Dependency**, select *ir-lib*, then **Apply** changes or press **OK**.

## Include OpenCV

In Android Studio open **File - Project Structure - Dependencies**, press **+** and select **Import .JAR/.AAR Package**, import *OpenCV.aar* library. Then in **Declared Dependencies** press **+** and select **3. Module Dependency**, select *OpenCV*, then **Apply** changes or press **OK**.

## Required dependencies

```gradle
implementation 'com.google.android.gms:play-services-location:16.0.0'
implementation 'com.squareup.okhttp3:okhttp:3.11.0'
implementation 'com.github.PhilJay:MPAndroidChart:3.0.2'
implementation 'com.squareup.picasso:picasso:2.5.2'
implementation "com.microsoft.appcenter:appcenter-analytics:2.5.1"
implementation "com.microsoft.appcenter:appcenter-crashes:2.5.1"
```

## If project use androidX

Update gradle.properties with

```gradle
android.useAndroidX=true
android.enableJetifier=true
```
