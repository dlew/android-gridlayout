GridLayout Library
==================

This library provides a version of [GridLayout](http://developer.android.com/reference/android/widget/GridLayout.html) that works across all versions of Android 1.5+.  As a side effect, this library also includes the lightweight [Space](http://developer.android.com/reference/android/widget/Space.html) as well.

For an introduction to GridLayout/Space, [check out the Android Developers Blog post about the benefits and usage of GridLayout and Space](http://android-developers.blogspot.com/2011/11/new-layout-widgets-space-and-gridlayout.html).

Compilation
===========

Compiling this library requires that the build SDK version be set to 3.0 or above.  (It uses some more modern methods if they are available.)

Usage
=====

This is a copy of the GridLayout from Android, so its usage is very similar.  The only difference is that some attributes you will need to use your project's namespace instead of the android namespace:

    <com.gridlayout.GridLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:gridlayout="http://schemas.android.com/apk/res/com.mycompany.myapp"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        gridlayout:alignmentMode="alignBounds"
        gridlayout:columnCount="4"
        gridlayout:columnOrderPreserved="false"
        gridlayout:useDefaultMargins="true" >

Caveats
=======

Due to the inability to detect changes in child visibility in older versions of ViewGroup, it is necessary to call `GridLayout.notifyChildVisibilityChanged()` whenever you change the visibility of a child View of a GridLayout.

If you never change the visibility of children, you don't have to worry about this.